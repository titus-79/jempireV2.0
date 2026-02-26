package models.building;

import models.Resources;

public abstract class Building {

    private Resources resourcesCost;
    private int improvement;

    public Building() {
    }

    public Building(int improvement) {
        this.improvement = improvement;
    }

    public Resources getResourcesCost() {
        return resourcesCost;
    }

    public void setResourcesCost(Resources resourcesCost) {
        this.resourcesCost = resourcesCost;
    }

    public int getImprovement() {
        return improvement;
    }

    public void setImprovement(int improvement) {
        this.improvement = improvement;
    }

    public String getName(){
        return this.getClass().getSimpleName();
    }
}
