package decorator;

import interfaces.TeslaModelY;

public abstract class TeslaModelYDecorator  implements TeslaModelY {
    private final TeslaModelY decoratedTeslaModelY;

    public TeslaModelYDecorator(TeslaModelY decoratedTeslaModelY) {
        this.decoratedTeslaModelY = decoratedTeslaModelY;
    }

    @Override
    public String getPhotoInterieur() {
        return decoratedTeslaModelY.getPhotoInterieur();
    }

    @Override
    public String getPhotoExterieur() {
        return decoratedTeslaModelY.getPhotoExterieur();
    }

    @Override
    public int getTailleJantes() {
        return decoratedTeslaModelY.getTailleJantes();
    }

    @Override
    public boolean getAutopilote() {
        return decoratedTeslaModelY.getAutopilote();
    }

    @Override
    public double getPrix() {
        return decoratedTeslaModelY.getPrix();
    }

    @Override
    public int getAutonomie() {
        return decoratedTeslaModelY.getAutonomie();
    }
}
