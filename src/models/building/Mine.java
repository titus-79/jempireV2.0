package models.building;

import models.Resources;

public class Mine extends Building{

    int woodCost = 15;
    int stoneCost = 10;

    public Mine(Resources ressources) {
        super(ressources);
        this.setImprovement(1);
        ressources.decreaseWood(woodCost);
        ressources.decreaseStone(stoneCost);
    }

    public void getRessourceStone(){
        getResourcesCost().increaseStone(10);
    }

    public void getRessourceIron(){
        getResourcesCost().increasedIron(10);
    }
}
