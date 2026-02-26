package models.units;

public class Soldier extends Villagers {

    private int maxHealth = 15;

    public static final int WOOD_COST = 5;
    public static final int FOOD_COST = 5;
    public static final int IRON_COST = 10;

    public Soldier() {
        this.setImprovement(1);
        this.setMaxHealth(maxHealth);
        this.setHealth(maxHealth);
    }

}
