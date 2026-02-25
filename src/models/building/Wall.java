package models.building;


public class Wall extends Building {

    public static final int WOOD_COST = 10;
    public static final int STONE_COST = 20;
    public static final int IRON_COST = 5;

    public Wall() {
        this.setImprovement(1);
    }

}
