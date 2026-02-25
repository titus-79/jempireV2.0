package models.units;

import models.Resources;

public class Soldier extends Villagers {

    private int foodCost = 5;
    private int woodCost = 5;
    private int ironCost = 10;

    public Soldier(Resources resourcesCost) {
        super(resourcesCost);
        this.setImprovement(1);
        resourcesCost.decreaseWood(woodCost);
        resourcesCost.decreaseStone(foodCost);
        resourcesCost.decreaseIron(ironCost);
    }


    
}
