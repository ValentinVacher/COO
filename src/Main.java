import concret_component.SimpleTeslaModelY;
import concrete_decorator.AutopilotDecorator;
import concrete_decorator.ColorDecorator;
import concrete_decorator.InteriorWhiteDecorator;
import concrete_decorator.LargeRimsDecorator;
import interfaces.TeslaModelY;

public class Main {
    public static void main(String[] args) {
        TeslaModelY simpleTeslaModelY = new SimpleTeslaModelY();
        display(simpleTeslaModelY);

        TeslaModelY teslaModelYInteriorWhite = new InteriorWhiteDecorator(new SimpleTeslaModelY());
        display(teslaModelYInteriorWhite);

        TeslaModelY teslaModelYNewColor = new ColorDecorator(new SimpleTeslaModelY());
        display(teslaModelYNewColor);

        TeslaModelY teslaModelYLargeRims = new LargeRimsDecorator(new SimpleTeslaModelY());
        display(teslaModelYLargeRims);

        TeslaModelY teslaModelYAutopilot = new AutopilotDecorator(new SimpleTeslaModelY());
        display(teslaModelYAutopilot);

        TeslaModelY teslaModelYWithAll = new AutopilotDecorator(new LargeRimsDecorator(new ColorDecorator(new InteriorWhiteDecorator(new SimpleTeslaModelY()))));
        display(teslaModelYWithAll);
    }

    static void display(TeslaModelY teslaModelY){
        System.out.println("\nTesla model Y : " + teslaModelY.getPhotoExterieur() + "\nInterieur : " + teslaModelY.getPhotoInterieur() + "\nTaille des jantes : " + teslaModelY.getTailleJantes() + "\nAutopilote : " + teslaModelY.getAutopilote() + "\nPrix : " + teslaModelY.getPrix() + "\nAutonomie : " + teslaModelY.getAutonomie());
    }
}