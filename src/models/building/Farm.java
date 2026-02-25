package models.building;

import models.Resources;

public class Farm extends Building{

    public Farm(Resources resources) {
        super(resources);
        this.setImprovement(1);
    }

    public void getFarmProduct(){
        getResourcesCost().increaseFood(10);
    }

}
