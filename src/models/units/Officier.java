package models.units;

import models.Resources;

public class Officier extends Soldier {

    private int foodCost = 15;
    private int goldCost = 20;
    private int maxHealth = 20;

    public Officier(Resources resourcesCost) {
        super(resourcesCost);
        this.setImprovement(1);
        this.setMaxHealth(maxHealth);
        this.setHealth(maxHealth);
        resourcesCost.decreaseFood(foodCost);
        resourcesCost.decreaseGold(goldCost);
    }

}
