package models.building;

import models.Resources;

abstract class Building {

    private Resources resourcesCost;

    public Building(Resources resourcesCost) {
        this.resourcesCost = resourcesCost;
    }

}
