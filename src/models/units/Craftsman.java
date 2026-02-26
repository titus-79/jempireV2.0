package models.units;

public class Craftsman extends Unit {

    public static final int WOOD_COST = 10;
    public static final int FOOD_COST = 15;
    public static final int IRON_COST = 10;

    public Craftsman() {
        this.setImprovement(1);
    }
}
