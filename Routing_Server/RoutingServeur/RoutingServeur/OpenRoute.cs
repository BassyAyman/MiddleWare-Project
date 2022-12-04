using System;
using System.Collections.Generic;
using System.Device.Location;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace RoutingServeur
{
    public class Engine
    {
        public string name { get; set; }
        public string author { get; set; }
        public string version { get; set; }
    }

    public class Feature
    {
        public string type { get; set; }
        public Geometry geometry { get; set; } // oui, on prend coordinate
        public Properties properties { get; set; }
    }

    public class Geocoding
    {
        public string version { get; set; }
        public string attribution { get; set; }
        public Query query { get; set; }
        public Engine engine { get; set; }
        public long timestamp { get; set; }
    }

    public class Geometry // LA
    {
        public string type { get; set; }
        public List<double> coordinates { get; set; }
    }

    public class CoordonateAdresse // classe ajouter, non depuis le Json
    {
        public double latitude { get; set; }
        public string latitudeString { get; set; }
        public GeoCoordinate coordonne { get; set; }
        public double longitude { get; set; }
        public string longitudeString { get; set; }
        public string ville { get; set; }
        public CoordonateAdresse(string ville,Geometry geo) { 
            this.ville = ville;
            this.longitude = geo.coordinates[0];
            this.latitude= geo.coordinates[1];
            this.coordonne = new GeoCoordinate(geo.coordinates[1], geo.coordinates[0]);
            this.latitudeString = latitude.ToString().Split(',')[0] + "." + latitude.ToString().Split(',')[1];
            this.longitudeString = longitude.ToString().Split(',')[0] + "." + longitude.ToString().Split(',')[1];
        }
    }

    public class Lang
    {
        public string name { get; set; }
        public string iso6391 { get; set; }
        public string iso6393 { get; set; }
        public string via { get; set; }
        public bool defaulted { get; set; }
    }

    public class ParsedText
    {
        public string housenumber { get; set; }
        public string street { get; set; }
        public string city { get; set; }
    }

    public class Properties // on s'en fou
    {
        public string id { get; set; }
        public string gid { get; set; }
        public string layer { get; set; }
        public string source { get; set; }
        public string source_id { get; set; }
        public string name { get; set; }
        public string housenumber { get; set; }
        public string street { get; set; }
        public string postalcode { get; set; }
        public int confidence { get; set; }
        public string match_type { get; set; }
        public string accuracy { get; set; }
        public string country { get; set; }
        public string country_gid { get; set; }
        public string country_a { get; set; }
        public string macroregion { get; set; }
        public string macroregion_gid { get; set; }
        public string macroregion_a { get; set; }
        public string region { get; set; }
        public string region_gid { get; set; }
        public string region_a { get; set; }
        public string macrocounty { get; set; }
        public string macrocounty_gid { get; set; }
        public string county { get; set; }
        public string county_gid { get; set; }
        public string localadmin { get; set; }
        public string localadmin_gid { get; set; }
        public string locality { get; set; }
        public string locality_gid { get; set; }
        public string continent { get; set; }
        public string continent_gid { get; set; }
        public string label { get; set; }
    }

    public class Query
    {
        public string text { get; set; }
        public int size { get; set; }
        public bool @private { get; set; }
        public Lang lang { get; set; }
        public int querySize { get; set; }
        public string parser { get; set; }
        public ParsedText parsed_text { get; set; }
    }

    public class OpenRoute
    {
        public Geocoding geocoding { get; set; }// non interessant
        public string type { get; set; }// ratio

        public List<Feature> features { get; set; }// ici; avec precision de la ville, on a une seul feature, sinon on a plusieurs
        // feature veut dire info liée a une adresse
        public List<double> bbox { get; set; } // oui
    }

}
