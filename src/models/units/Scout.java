package models.units;

import models.Resources;

public class Scout extends Unit {
    private int foodCost = 10;
    private int woodCost = 5;
    private int ironCost = 5;

    public Scout(Resources resourcesCost) {
        super(resourcesCost);
        this.setImprovement(1);
        resourcesCost.decreaseWood(woodCost);
        resourcesCost.decreaseStone(foodCost);
        resourcesCost.decreaseIron(ironCost);
    }
}
