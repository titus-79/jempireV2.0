package models.building;

import models.Resources;

public class Barrack extends Building {

    private int woodCost = 20;
    private int stoneCost = 15;
    private int ironCost = 5;

    public Barrack(Resources resourcesCost) {
        super(resourcesCost);
        this.setImprovement(1);
        resourcesCost.decreaseWood(woodCost);
        resourcesCost.decreaseStone(stoneCost);
        resourcesCost.decreaseIron(ironCost);
    }

    
}
