package models.building;


public class Barrack extends Building {

    public static final int WOOD_COST = 20;
    public static final int STONE_COST = 15;
    public static final int IRON_COST = 5;

    public Barrack() {
        this.setImprovement(1);
    }
    
}
