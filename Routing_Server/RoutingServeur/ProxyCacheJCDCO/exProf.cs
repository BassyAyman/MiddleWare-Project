using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Diagnostics.Contracts;
using System.Net.Http;
using System.Text.Json;
using System.Threading.Tasks;
using System.Device.Location;
using static System.Collections.Specialized.BitVector32;

namespace ProxyCacheJCDCO
{
    /*
        internal class Program

        {
            // HttpClient is intended to be instantiated once per application, rather than per-use. See Remarks.

            static readonly HttpClient client = new HttpClient();
            static async Task Main()
            {
                try
                {
                    HttpResponseMessage response = await client.GetAsync("https://api.jcdecaux.com/vls/v3/contracts?apiKey=3a37296050700207ee78b649bbfd3a1d444e802f");
                    response.EnsureSuccessStatusCode();
                    string responseBody = await response.Content.ReadAsStringAsync();
                    // Above three lines can be replaced with new helper method below
                    // string responseBody = await client.GetStringAsync(uri);
                    List<Contract> contracts = JsonSerializer.Deserialize<List<Contract>>(responseBody);
                    foreach (Contract contract in contracts)
                    {
                        Console.WriteLine($"Name: {contract.name}");
                    }
                    string contry;
                    contry = Console.ReadLine();
                    HttpResponseMessage response2 = await client.GetAsync("https://api.jcdecaux.com/vls/v1/stations?contract=" + contry + "&apiKey=3a37296050700207ee78b649bbfd3a1d444e802f");
                    response.EnsureSuccessStatusCode();
                    string responseBody2 = await response2.Content.ReadAsStringAsync();
                    List<Station> stations = JsonSerializer.Deserialize<List<Station>>(responseBody2);
                    foreach (Station station in stations)
                    {
                        Console.WriteLine($"Name: {station.name} à la position: {station.position.lat}:{station.position.lng}");
                    }
                    int numberStationChoise = Int32.Parse(Console.ReadLine());
                    Station stationChoise = null;
                    foreach (Station station in stations)
                    {
                        if (station.number == numberStationChoise)
                        {
                            stationChoise = station;
                        }
                    }
                    double savedDistance = -1;
                    GeoCoordinate curentGeoCoordinate = new GeoCoordinate(latitude: stationChoise.position.lat, stationChoise.position.lng);
                    Station stationCloser = null;
                    foreach (Station station in stations)
                    {
                        GeoCoordinate sationGeoCoordinate = new GeoCoordinate(latitude: station.position.lat, station.position.lng);
                        double distance = curentGeoCoordinate.GetDistanceTo(sationGeoCoordinate);
                        Console.WriteLine($"Ldistance: {distance} de: {station.name}");
                        if (distance != 0 && (savedDistance == -1 || (distance < savedDistance)))
                        {
                            savedDistance = distance;
                            stationCloser = station;
                        }
                    }
                    Console.WriteLine($"La plus proche: {stationCloser.name} à la position: {stationCloser.position.lat}:{stationCloser.position.lng}");
                    Console.ReadLine();
                }
                catch (HttpRequestException e)
                {
                    Console.WriteLine("\nException Caught!");
                    Console.WriteLine("Message :{0} ", e.Message);
                }

            }

        }*/
}
