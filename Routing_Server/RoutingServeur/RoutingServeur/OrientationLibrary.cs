using System;
using System.Collections.Generic;
using System.Linq;
using System.Runtime.Serialization;
using System.ServiceModel;
using System.Text;
using RoutingServeur.ProxyCacheServiceReference; 
using System.Net.Http;
using System.Text.Json;
using System.Threading.Tasks;
//using System.Device.Location;
using static System.Collections.Specialized.BitVector32;
//using System.ServiceModel.Web;
using System.ServiceModel.Activation;
using System.Device.Location;
using Newtonsoft.Json;
using System.Reflection;

namespace RoutingServeur
{
    // REMARQUE : vous pouvez utiliser la commande Renommer du menu Refactoriser pour changer le nom de classe "Service1" à la fois dans le code et le fichier de configuration.
    public class OrientationLibrary : IOrientationLibrary
    {
        public string APIKEY = "5b3ce3597851110001cf6248ab12f85b6c6941df99d94286c4de0e84";
        static readonly HttpClient client = new HttpClient();

        private static int CAS_NUMERO_UN = 1; // Deplacement a pied

        private static int CAS_NUMERO_DEUX = 2; // Deplacement en Velo, car on aura pris un velo

        public async Task<List<CoordonateAdresse>> recupCoordoneeAdresse(string adresse)
        {
            HttpResponseMessage response = await client.GetAsync("https://api.openrouteservice.org/geocode/search?api_key=" + APIKEY + "&text=" + adresse);
            response.EnsureSuccessStatusCode();
            string responseBody = await response.Content.ReadAsStringAsync();
            OpenRoute route = System.Text.Json.JsonSerializer.Deserialize<OpenRoute>(responseBody);
            List<Feature> feat = route.features;
            List<CoordonateAdresse> villeListe = new List<CoordonateAdresse>();
            foreach (Feature feat2 in feat)// pour chaque adresse possible determiner, on recupere la ville associer, et les coordonées
            {                              // normalement la liste ne comptient un unique element, c'est au cas ou la liste comme sa sa plante pas
                villeListe.Add(new CoordonateAdresse(feat2.properties.locality, feat2.geometry));
            }
            return villeListe; // la je recup les données utile lier a une adresse, plus ambigue si on donne pas une adresse avec la ville
                               // reste a comaparer deux adresse objet de ce type pour faire le traitement demander ( dans le fomulaire client on ajoute rue, numero et ville)
        }

        public string RecuperationTest(string papak)// fonction utiliser pour debugger l'application depuis un client en soap, a default d'utiliser des tests.
        {
            string val = "";
            CoordonateAdresse cc = recupCoordoneeAdresse("Bd du Midi, 76100 Rouen").Result[0];
            CoordonateAdresse ccc = recupCoordoneeAdresse("All. Pierre de Coubertin, 76000 Rouen").Result[0];

            
            val += cc.ville + " // "; ;
            val += cc.longitude + " // ";
            val += cc.latitude + " // ";
            val += " loongitude coor : "+cc.coordonne.Longitude + " // ";
            val += " latitude coor : " +cc.coordonne.Latitude + " // \n ";
            
            
            val += ccc.ville + " // "; ;
            val += ccc.longitude + " // ";
            val += ccc.latitude + " // ";
            val += " loongitude coor : " + ccc.coordonne.Longitude + " // ";
            val += " latitude coor : " + ccc.coordonne.Latitude + " // \n ";
            
            val += " la suite \n\n";
            
            List<GeoStation> ll = recupStationDeLaVille(papak);
            
            foreach (GeoStation ll2 in ll)
            {
                val += ll2.nom + " // ";
                val += ll2.stationCoordinate.Longitude.ToString() + " // ";
                val += ll2.stationCoordinate.Latitude.ToString() + " // \n";
            }

            val += " la suite avec maintenant la station la plus proche \n\n";
            GeoStation stat1 = getStationPlusProche(ll,cc);
            GeoStation stat2 = getStationPlusProche(ll,ccc);
            val += " station 1 \n\n";
            if(stat1== null)
                val += "c pas bon pour stat1" + " // \n";
            else
            {
                val += stat1.nom + " // ";
                val += stat1.stationCoordinate.Longitude.ToString() + " // ";
                val += stat1.stationCoordinate.Latitude.ToString() + " // \n";
            }
            val += " station 2 \n\n";
            if (stat2 == null)
                val += "c pas bon pour stat1" + " // \n";
            else
            {
                val += stat2.nom + " // ";
                val += stat2.stationCoordinate.Longitude.ToString() + " // ";
                val += stat2.stationCoordinate.Latitude.ToString() + " // \n";
            }
            DirectionSuivre dd = recupereDirectionCas2(CAS_NUMERO_UN, cc, ccc,stat1,stat2).Result;
            if (dd == null)
                val += " la direction a suivre a renvoyer une unité nullllllll";
            else
            {
                foreach(Segment seg in dd.segment)
                {
                    val += seg.duration.ToString() + " : la duration // ";
                    val += seg.distance.ToString() + " : la distance // \n";
                    foreach(Step step in seg.steps)
                    {
                        val += step.duration.ToString() + " : step duration //";
                        val += step.distance.ToString() + " : step duration //";
                        val += step.instruction + " : le chemin via instruction // \n\n";
                    }
                }
            }
            return val;
        }
        public List<GeoStation> recupStationDeLaVille(string city)
        {
            ProxyCacheServiceClient proxy = new ProxyCacheServiceClient();
            string JSONStations = proxy.GetStations(city);
            if (JSONStations.Equals("00")) // renvoyez par le proxy quand la ville ne fait pas partie des contracts
            {
                return null;
            }
            List<Station> stations = JsonConvert.DeserializeObject<List<Station>>(JSONStations);
            stations.RemoveAll(i => i.status == "CLOSED");     // on retire les stations fermé.                         
            List<GeoStation> geoStations= new List<GeoStation>();
            foreach (Station stat in stations)
            {
                geoStations.Add(new GeoStation(stat.name, stat.position.latitude,stat.position.longitude));
            }
            return geoStations;
        }

        private GeoStation getStationPlusProche(List<GeoStation> stations,CoordonateAdresse adresse) // sa ne voit pas d'equidistance par rapport a la station ou on prend le velo et le destination de base
        {
            GeoStation plusProche = null;
            double distanceMin = -1;
            foreach (GeoStation station in stations) {
                // la je fait le calcule pour trouver la station la plus proche
                double nbVal = adresse.coordonne.GetDistanceTo(station.stationCoordinate);
                if (distanceMin < nbVal)
                {
                    plusProche = station;
                    distanceMin= nbVal;
                }
            }
            return plusProche;
        }

        public async  Task<DirectionSuivre> recupereDirection(int casDonnée,CoordonateAdresse pointA,CoordonateAdresse pointB)
        {
            HttpResponseMessage response = await client.GetAsync("https://api.openrouteservice.org/v2/directions/foot-walking?api_key=" + APIKEY+"&start="+pointA.longitudeString+","+pointA.latitudeString + "&end="+pointB.longitudeString + ","+pointB.latitudeString);
            response.EnsureSuccessStatusCode();
            string responseBody = await response.Content.ReadAsStringAsync();
            OpenDirection myDeserializedClass = JsonConvert.DeserializeObject<OpenDirection>(responseBody);

            DirectionSuivre direct = new DirectionSuivre(casDonnée);
            direct.segment = myDeserializedClass.features[0].properties.segments;

            return direct;
        }

        public async Task<DirectionSuivre> recupereDirectionCas2(int casDonnée, CoordonateAdresse pointA, CoordonateAdresse pointB,GeoStation StationA,GeoStation StationB)
        {
            HttpResponseMessage response1 = await client.GetAsync("https://api.openrouteservice.org/v2/directions/foot-walking?api_key=" + APIKEY + "&start=" + pointA.longitudeString + "," + pointA.latitudeString + "&end=" + StationA.longitudeString + "," + StationA.latitudeString);
            response1.EnsureSuccessStatusCode();
            string response1Body = await response1.Content.ReadAsStringAsync();

            HttpResponseMessage response2 = await client.GetAsync("https://api.openrouteservice.org/v2/directions/cycling-road?api_key=" + APIKEY + "&start=" + StationA.longitudeString + "," + StationA.latitudeString + "&end=" + StationB.longitudeString + "," + StationB.latitudeString);
            response1.EnsureSuccessStatusCode();
            string response2Body = await response2.Content.ReadAsStringAsync();

            HttpResponseMessage response3 = await client.GetAsync("https://api.openrouteservice.org/v2/directions/foot-walking?api_key=" + APIKEY + "&start=" + StationB.longitudeString + "," + StationB.latitudeString + "&end=" + pointB.longitudeString + "," + pointB.latitudeString);
            response1.EnsureSuccessStatusCode();
            string response3Body = await response3.Content.ReadAsStringAsync();


            OpenDirection myDeserializedClass1 = JsonConvert.DeserializeObject<OpenDirection>(response1Body);
            OpenDirection myDeserializedClass2 = JsonConvert.DeserializeObject<OpenDirection>(response2Body);
            OpenDirection myDeserializedClass3 = JsonConvert.DeserializeObject<OpenDirection>(response3Body);

            DirectionSuivre direct = new DirectionSuivre(casDonnée);
            direct.segment = new List<Segment>();

            direct.segment.Add(myDeserializedClass1.features[0].properties.segments[0]);
            direct.segment.Add(myDeserializedClass2.features[0].properties.segments[0]);
            direct.segment.Add(myDeserializedClass3.features[0].properties.segments[0]);


            return direct;
        }

        public DirectionSuivre GetItininary(string origin, string destination) // une autre fonction 
        {
            CoordonateAdresse originAdresse = recupCoordoneeAdresse(origin).Result[0];
            CoordonateAdresse destinationAdresse = recupCoordoneeAdresse(destination).Result[0];
            if (!originAdresse.ville.ToLower().Equals(destinationAdresse.ville.ToLower())) // cas ou les deux destination de base ne sont pas dans la meme ville
            {
                DirectionSuivre direct = new DirectionSuivre(5);
                return direct;
            }
            string villeDansLaquelleOnEst = originAdresse.ville;
            List<GeoStation> originStation = recupStationDeLaVille(villeDansLaquelleOnEst);
            List<GeoStation> destinationStation = recupStationDeLaVille(villeDansLaquelleOnEst); /////////////////////// JEN SUIS LA, l'erreur ct que je donnais en param pas la ville ducoup sa renvoie faux
            // regarder le fil d'exec a partir de la, ***************** parce que sa renvoie tjr une erreur
            
            if (originStation == null || destinationStation == null) // cas ou la ville ne fait pas partie de la liste de contract
            {
                DirectionSuivre direct = new DirectionSuivre(0);
                return direct;
            }
            /*if(originStation.Count() == 0 || destinationStation.Count() == 0)
            {
                Note : Dans le cas ou ya pas de stations, on peut direct donner le trajet et avec le cas, on precisera que ya pas de stations, peut etre une solution au cas ou la ville est pas dans un contract, plus tard
            }*/

            GeoStation originStationPlusProche = getStationPlusProche(originStation, originAdresse);
            GeoStation destinationStationPlusProche = getStationPlusProche(destinationStation, destinationAdresse); // un soucis notable, si la liste est vide sa renvoie un null.
            // ajout d'un cas, si la geo la plus proche entre les deux c la meme, pas besoin de prendre de velo.


            DirectionSuivre d1 = recupereDirection(CAS_NUMERO_UN, originAdresse, destinationAdresse).Result;
            DirectionSuivre d2 = recupereDirectionCas2(CAS_NUMERO_DEUX, originAdresse, destinationAdresse, originStationPlusProche, destinationStationPlusProche).Result;

            double temps1 = d1.segment[0].duration;
            double temps2 = d2.segment[0].duration + d2.segment[1].duration + d2.segment[2].duration;
            double tempsMin = Math.Min(temps1, temps2);

            return (tempsMin == temps1) ? d1 : d2;

        }
    }

    public class Station
    {
        public int number { get; set; }
        public String name { get; set; }
        public String address { get; set; }
        public Position position { get; set; }
        public String status { get; set; } // indication de si la station est ferme ou non ( CLOSED / OPEN )
    }

    public class GeoStation
    {
        public string nom { get; set; }
        public string latitudeString { get; set; }
        public string longitudeString { get; set; }
        public GeoCoordinate stationCoordinate { get; set; }

        public GeoStation(string name, double latitude, double longitude)
        {
            this.nom = name;
            this.stationCoordinate = new GeoCoordinate(latitude, longitude);
            this.latitudeString = latitude.ToString().Split(',')[0] + "." + latitude.ToString().Split(',')[1];
            this.longitudeString = longitude.ToString().Split(',')[0] + "." + longitude.ToString().Split(',')[1];
        }
    }

    public class Position
    {
        public double latitude { get; set; }
        public double longitude { get; set; }
    }
}
