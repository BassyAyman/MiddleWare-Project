package mainpack;

import com.soap.ws.client.generated.*;


public class MainWSclient {
    public static void main(String[] args) {
        System.out.println("le test");

        OrientationLibrary orientationLibrary = new OrientationLibrary();
        IOrientationLibrary iOrientationLibrary = orientationLibrary.getBasicHttpBindingIOrientationLibrary();
        // verifier que les deux ville que je vais demander sont identiques.
        //DirectionSuivre et = iOrientationLibrary.getItininary("5 rue des emmurées, Rouen","2 rue Sainte-Genevieve du Mont, Rouen"); // test cas 1
        DirectionSuivre et = iOrientationLibrary.getItininary("Bd du Midi, 76100 Rouen","All. Pierre de Coubertin, 76000 Rouen"); // test cas 2
        System.out.println("le cas en question : "+et.getCas());
        //System.out.println(iOrientationLibrary.recuperationTest("rouen"));
        //System.out.println(" AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        switch (et.getCas()){
            case 0 :
                System.out.println("Vous etes dans une ville qui ne rentre pas dans notre zone d'action");
                break;
            case 1 : // cas direct
                System.out.println("Il vaut mieux aller directement sans passez par une stations, taille seg = "+et.getSegment().getValue().getSegment().size());
                System.out.println(" trajet a effectuer a PIED donc ---------------------------");
                Segment seg = et.getSegment().getValue().getSegment().get(0);
                System.out.println("distance total : "+seg.getDistance());
                System.out.println(" temps total : "+seg.getDuration());
                for (Step step : seg.getSteps().getValue().getStep()) {
                    System.out.println("       distance trajet : "+step.getDistance());
                    System.out.println("       durée trajet : "+step.getDuration());
                    System.out.println("        instruction : "+step.getInstruction().getValue());
                }

                break;
            case 2 : // cas passage par une air de velo
                System.out.println("Vous pouvez passer par une stations qui vous sera conseillez, taille seg = "+et.getSegment().getValue().getSegment().size());
                System.out.println("         A PIED       --");
                Segment seg1 = et.getSegment().getValue().getSegment().get(0);
                System.out.println("distance total : "+seg1.getDistance());
                System.out.println(" temps total : "+seg1.getDuration());
                for (Step step : seg1.getSteps().getValue().getStep()) {
                    System.out.println("       distance trajet : "+step.getDistance());
                    System.out.println("       durée trajet : "+step.getDuration());
                    System.out.println("        instruction : "+step.getInstruction().getValue());
                }
                System.out.println("         A VELO       --");
                Segment seg2 = et.getSegment().getValue().getSegment().get(1);
                System.out.println("distance total : "+seg2.getDistance());
                System.out.println(" temps total : "+seg2.getDuration());
                for (Step step : seg2.getSteps().getValue().getStep()) {
                    System.out.println("       distance trajet : "+step.getDistance());
                    System.out.println("       durée trajet : "+step.getDuration());
                    System.out.println("        instruction : "+step.getInstruction().getValue());
                }

                System.out.println("         A PIED       --");
                Segment seg3 = et.getSegment().getValue().getSegment().get(2);
                System.out.println("distance total : "+seg2.getDistance());
                System.out.println(" temps total : "+seg2.getDuration());
                for (Step step : seg2.getSteps().getValue().getStep()) {
                    System.out.println("       distance trajet : "+step.getDistance());
                    System.out.println("       durée trajet : "+step.getDuration());
                    System.out.println("        instruction : "+step.getInstruction().getValue());
                }
                break;
        }
    }
}
