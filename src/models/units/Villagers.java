package models.units;

import models.Resources;

public class Villagers extends Unit {

    private int foodCost = 5;

    public Villagers(Resources resourcesCost) {
        super(resourcesCost);
        this.setImprovement(1);
        resourcesCost.decreaseWood(foodCost);
    }

   
}
