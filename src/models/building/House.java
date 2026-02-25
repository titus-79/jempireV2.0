package models.building;

import models.Resources;

public class House extends Building {
    private int woodCost = 10;
    private int capacity = 2;
    private int improvement = 1;

    public House(Resources resourcesCost) {
        super(resourcesCost);
        resourcesCost.decreaseWood(woodCost * improvement);
    }

    public int getCapacity() {
        return capacity;
    }

    public int getWoodCost() {
        return woodCost;
    }

    public void setWoodCost(int woodCost) {
        this.woodCost = woodCost;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getImprovement() {
        return improvement;
    }

    public void setImprovement(int improvement) {
        this.improvement = improvement;
    }

}
