package concrete_decorator;

import decorator.TeslaModelYDecorator;
import interfaces.TeslaModelY;

public class InteriorWhiteDecorator extends TeslaModelYDecorator {
    public InteriorWhiteDecorator(TeslaModelY decoratedTeslaModelY) {
        super(decoratedTeslaModelY);
    }

    @Override
    public String getPhotoInterieur() {
        return "https://static-assets.tesla.com/configurator/compositor?context=design_studio_2&options=$INPW0,$PPSW,$DV2W&view=STUD_SEAT&model=my&size=1441&bkba_opt=2&crop=0,0,0,0&";
    }

    @Override
    public  double getPrix(){
        return super.getPrix() + 1190;
    }
}
