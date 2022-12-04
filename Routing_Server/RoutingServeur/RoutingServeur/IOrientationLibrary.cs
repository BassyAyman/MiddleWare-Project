using System;
using System.Collections.Generic;
using System.Device.Location;
using System.Linq;
using System.Runtime.Serialization;
using System.ServiceModel;
using System.Text;

namespace RoutingServeur
{
    // REMARQUE : vous pouvez utiliser la commande Renommer du menu Refactoriser pour changer le nom d'interface "IService1" à la fois dans le code et le fichier de configuration.
    [ServiceContract]
    public interface IOrientationLibrary
    {
        [OperationContract]
        DirectionSuivre GetItininary(string origin,string destination);// origin et destination seront bien fait de maniere a m'arranger pour faire la requete a l'api

        [OperationContract]
        string RecuperationTest(string papak);

    }

    [DataContract]
    public class DirectionSuivre
    {
        [DataMember]
        public int cas { get; set; }
        [DataMember]
        public  List<Segment> segment { get; set; }

        public DirectionSuivre(int casc)        {
            this.cas = casc;
        }

    }
}
