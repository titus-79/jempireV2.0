package models.building;

import models.Resources;

public class House extends Building {
    private int woodCost = 10;
    private int capacity = 2;

    public House(Resources resourcesCost) {
        super(resourcesCost);
        this.setImprovement(1);
        resourcesCost.decreaseWood(woodCost * this.getImprovement());
    }

    public int getCapacity() {
        return capacity;
    }

    public int getWoodCost() {
        return woodCost;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }


}
