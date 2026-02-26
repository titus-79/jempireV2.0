package models.units;

public class Scout extends Unit {

    public static final int WOOD_COST = 5;
    public static final int FOOD_COST = 10;
    public static final int IRON_COST = 5;

    public Scout() {
        this.setImprovement(1);
    }
}
