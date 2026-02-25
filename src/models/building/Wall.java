package models.building;

import models.Resources;

public class Wall extends Building {

    private int woodCost = 10;
    private int stoneCost = 20;
    private int ironCost = 5;

    public Wall(Resources resourcesCost) {
        super(resourcesCost);
        this.setImprovement(1);
        resourcesCost.decreaseWood(woodCost);
        resourcesCost.decreaseStone(stoneCost);
        resourcesCost.decreaseIron(ironCost);
    }

}
