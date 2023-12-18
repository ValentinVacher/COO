package concrete_decorator;

import decorator.TeslaModelYDecorator;
import interfaces.TeslaModelY;

import java.util.Scanner;

public class ColorDecorator extends TeslaModelYDecorator {
    private String color;
    private double prix;

    public ColorDecorator(TeslaModelY decoratedTeslaModelY) {
        super(decoratedTeslaModelY);
        newColor();
    }

    public void newColor(){
        while (color == null) {
            System.out.println("\nChoisisser une couleur :\n1) Blanc nacré pour 0€\n2) Noir pour 0€\n3) Bleu métallisé pour 1600€\n4) Quicksilver pour 3000€\n5) Midnight Cherry Red pour 3200€");
            String scanner = new Scanner(System.in).nextLine();

            switch (scanner) {
                case "1" -> {
                    color = "https://static-assets.tesla.com/configurator/compositor?context=design_studio_2&options=$MTY13,$PPSW,$WY19B,$INPW0&view=FRONT34&model=my&size=1920&bkba_opt=2&crop=0,0,0,0&";
                    prix = 0;
                }
                case "2" -> {
                    color = "https://static-assets.tesla.com/configurator/compositor?context=design_studio_2&options=$MTY13,$PBSB,$WY19B,$INPW0&view=FRONT34&model=my&size=1920&bkba_opt=2&crop=0,0,0,0&";
                    prix = 0;
                }
                case "3" -> {
                    color = "https://static-assets.tesla.com/configurator/compositor?context=design_studio_2&options=$MTY13,$PPSB,$WY19B,$INPW0&view=FRONT34&model=my&size=1920&bkba_opt=2&crop=0,0,0,0&";
                    prix = 1600;
                }
                case "4" -> {
                    color = "https://static-assets.tesla.com/configurator/compositor?context=design_studio_2&options=$MTY13,$PN00,$WY19B,$INPW0&view=FRONT34&model=my&size=1920&bkba_opt=2&crop=0,0,0,0&";
                    prix = 3000;
                }
                case "5" -> {
                    color = "https://static-assets.tesla.com/configurator/compositor?context=design_studio_2&options=$MTY13,$PR00,$WY19B,$INPW0&view=FRONT34&model=my&size=1920&bkba_opt=2&crop=0,0,0,0&";
                    prix = 3200;
                }
                default -> System.out.println("\nVeuillez entrer une valeur valide");
            }
        }
    }

    @Override
    public String getPhotoExterieur(){
        return color;
    }

    @Override
    public  double getPrix(){
        return super.getPrix() + prix;
    }
}
