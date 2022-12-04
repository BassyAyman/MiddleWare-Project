using System;
using System.Collections.Generic;
using System.Linq;
using System.Runtime.Serialization;
using System.Text;
using System.Text.Json.Serialization;
using System.Threading.Tasks;
using Newtonsoft.Json;

namespace RoutingServeur
{
    public class FeatureDirection
    {
        [JsonProperty(PropertyName = "properties")]
        public PropertiesDirection properties { get; set; }

        [JsonProperty(PropertyName = "geometry")]
        public GeometryDirection geometry { get; set; }
    }
    
    public class GeometryDirection
    {
        [JsonProperty(PropertyName = "coordinates")]
        public List<List<double>> coordinates { get; set; }
        [JsonProperty(PropertyName = "type")]
        public string type { get; set; }
    }

    public class PropertiesDirection
    {
        [JsonProperty(PropertyName = "segments")]
        public List<Segment> segments { get; set; }
    }

    public class OpenDirection
    {
        [JsonProperty(PropertyName = "features")]
        public List<FeatureDirection> features { get; set; }
    }
    [DataContract]
    public class Segment
    {
        [DataMember]
        public double distance { get; set; }
        [DataMember]
        public double duration { get; set; }
        [DataMember]
        public List<Step> steps { get; set; }
    }
    [DataContract]
    public class Step
    {
        [DataMember]
        public double distance { get; set; }
        [DataMember]
        public double duration { get; set; }
        [DataMember]
        public int type { get; set; }
        [DataMember]
        public string instruction { get; set; }
        [DataMember]
        public string name { get; set; }
        [DataMember]
        public List<int> way_points { get; set; }
    }
}
