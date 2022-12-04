using System;
using System.Collections.Generic;
using System.Linq;
using System.Runtime.Serialization;
using System.ServiceModel;
using System.Text;
using System.Net.Http;
using System.Text.Json;
using System.Threading.Tasks;
//using System.Device.Location;
using static System.Collections.Specialized.BitVector32;
using System.ServiceModel.Web;
using System.ServiceModel.Activation;

namespace ProxyCacheJCDCO
{
    [AspNetCompatibilityRequirements(RequirementsMode = AspNetCompatibilityRequirementsMode.Allowed)]
    public class ProxyCacheService : IProxyCacheService
    {
        static readonly HttpClient client = new HttpClient();

        string apiKey = "d4345b920d2521b7377ca6c2c311e928c2b729f2";

        [AspNetCacheProfile("CacheFor60Seconds")]
        private async Task<string> requestStations(string nameCity)
        {
            HttpResponseMessage response = await client.GetAsync("https://api.jcdecaux.com/vls/v3/stations?contract="+ nameCity +"&apiKey="+ apiKey);
            response.EnsureSuccessStatusCode();
            string responseBody = await response.Content.ReadAsStringAsync();
            return responseBody;
        }

        
        public string GetStations(string nameCityN) 
        {
            string nameCity = nameCityN.ToLower();
            bool villeExistant = isCityValide(nameCity).Result;
            if(!villeExistant)
            {
                return "00";
            }

            string reponse = requestStations(nameCity).Result;

            return reponse;
        }

        [AspNetCacheProfile("CacheFor60Seconds")]
        public async Task<bool> isCityValide(string city)
        {
            HttpResponseMessage response = await client.GetAsync("https://api.jcdecaux.com/vls/v3/contracts?apiKey="+ apiKey);
            response.EnsureSuccessStatusCode();
            string responseBody = await response.Content.ReadAsStringAsync();

            List<Contract> contracts = JsonSerializer.Deserialize<List<Contract>>(responseBody);

            foreach (Contract contract in contracts)
            {
                if(contract.name.Equals(city))
                {
                    return true;
                }
            }
            return false;
        }

    }
    
}
