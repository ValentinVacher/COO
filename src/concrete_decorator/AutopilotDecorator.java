package concrete_decorator;

import decorator.TeslaModelYDecorator;
import interfaces.TeslaModelY;

public class AutopilotDecorator extends TeslaModelYDecorator {
    public AutopilotDecorator(TeslaModelY decoratedTeslaModelY) {
        super(decoratedTeslaModelY);
    }

    @Override
    public boolean getAutopilote(){
        return true;
    }

    @Override
    public double getPrix(){
        return super.getPrix() + 3800;
    }
}
