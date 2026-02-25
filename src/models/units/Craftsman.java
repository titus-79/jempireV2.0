package models.units;

import models.Resources;

public class Craftsman extends Unit {

    private int foodCost = 15;
    private int woodCost = 10;
    private int ironCost = 10;

    public Craftsman(Resources resourcesCost) {
        super(resourcesCost);
        this.setImprovement(1);
        resourcesCost.decreaseWood(woodCost);
        resourcesCost.decreaseStone(foodCost);
        resourcesCost.decreaseIron(ironCost);
    }
}
