package concrete_decorator;

import decorator.TeslaModelYDecorator;
import interfaces.TeslaModelY;

public class LargeRimsDecorator extends TeslaModelYDecorator {
    public LargeRimsDecorator(TeslaModelY decoratedTeslaModelY) {
        super(decoratedTeslaModelY);
    }

    @Override
    public int getTailleJantes(){
        return 20;
    }

    @Override
    public int getAutonomie(){
        return 430;
    }
}
