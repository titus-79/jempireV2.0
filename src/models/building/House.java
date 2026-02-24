package models.building;

import models.Resources;

public class House extends Building {

    public House(Resources resourcesCost) {
        super(resourcesCost);
        resourcesCost.decreaseWood(10);
        //population.increaselimite(4);
    }
    
}
