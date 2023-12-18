package concret_component;

import interfaces.TeslaModelY;

public class SimpleTeslaModelY implements TeslaModelY {
    private String photoInterieur;
    private String photoExterieur;
    private int tailleJantes;
    private boolean autopilote;
    private double prix;
    private int autonomie;

    public SimpleTeslaModelY() {
        this.photoInterieur = "https://static-assets.tesla.com/configurator/compositor?context=design_studio_2&options=$INPB0,$PPSW,$DV2W&view=STUD_SEAT&model=my&size=1441&bkba_opt=2&crop=0,0,0,0&";
        this.photoExterieur = "https://static-assets.tesla.com/configurator/compositor?context=design_studio_2&options=$MTY13,$PPSW,$WY19B,$INPW0&view=FRONT34&model=my&size=1920&bkba_opt=2&crop=0,0,0,0&";
        this.tailleJantes = 19;
        this.autopilote = false;
        this.prix = 45990;
        this.autonomie = 455;
    }

    @Override
    public String getPhotoInterieur() {
        return photoInterieur;
    }

    @Override
    public String getPhotoExterieur() {
        return photoExterieur;
    }

    @Override
    public int getTailleJantes() {
        return tailleJantes;
    }

    public boolean getAutopilote() {
        return autopilote;
    }

    @Override
    public double getPrix() {
        return prix;
    }

    @Override
    public int getAutonomie() {
        return autonomie;
    }
}
