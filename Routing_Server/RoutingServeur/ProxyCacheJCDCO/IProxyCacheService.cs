using System;
using System.Collections.Generic;
using System.Linq;
using System.Runtime.Serialization;
using System.ServiceModel;
using System.ServiceModel.Activation;
using System.ServiceModel.Web;
using System.Text;
using System.Text.Json;
using System.Threading.Tasks;
//using System.Device.Location;
using static System.Collections.Specialized.BitVector32;

namespace ProxyCacheJCDCO
{
  
    [ServiceContract]
    public interface IProxyCacheService
    {
        [OperationContract]
        string GetStations(string nameCity);

    }

    public class Contract
    {
        public String name { get; set; }
        public String commercial_name { get; set; }
        public List<String> cities { get; set; } // liste de ville associer au contract
        public String country_code { get; set; }
    }
    [DataContract]
    public class Station
    {
        [DataMember]
        public int number { get; set; }
        [DataMember]
        public String name { get; set; }
        [DataMember]
        public String address { get; set; }
        [DataMember]
        public Position position { get; set; }
        [DataMember]
        public String status { get; set; } // indication de si la station est ferme ou non

    }
    public class Position
    {
        public double lat { get; set; }
        public double lng { get; set; }
    }
}
