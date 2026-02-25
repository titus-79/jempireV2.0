package models.building;

import models.Resources;

abstract class Building {

    private Resources resourcesCost;
    private int improvement;

    public Building(Resources resourcesCost) {
        this.resourcesCost = resourcesCost;
    }

    public Building(Resources resourcesCost, int improvement) {
        this.resourcesCost = resourcesCost;
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
}
