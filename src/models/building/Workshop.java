package models.building;

import models.Resources;
import models.tools.Tools;

public class Workshop extends Building{

    int woodCost = 20;
    int stoneCost = 10;
    int ironCost = 5;

    public Workshop(Resources resourcesCost) {
        super(resourcesCost);
        resourcesCost.decreaseWood(woodCost);
        resourcesCost.decreaseStone(stoneCost);
        resourcesCost.decreaseIron(ironCost);
    }

    public void createTool(){
        Tools tool = new Tools(10);
    }

    public void createWeapon(){
        Tools weapon = new Tools(10);
    }

}
