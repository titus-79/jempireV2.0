package models.building;

import models.tools.Tools;

public class Workshop extends Building {

    public static final int WOOD_COST = 20;
    public static final int STONE_COST = 10;
    public static final int IRON_COST = 5;

    public Workshop() {
        this.setImprovement(1);

    }

    public void createTool() {
        Tools tool = new Tools(10);
    }

    public void createWeapon() {
        Tools weapon = new Tools(10);
    }

}
