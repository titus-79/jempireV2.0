package models.units;

public class Officier extends Soldier {

    private int maxHealth = 20;

    public static final int FOOD_COST = 15;
    public static final int GOLD_COST = 20;

    public Officier() {
        this.setImprovement(1);
        this.setMaxHealth(maxHealth);
        this.setHealth(maxHealth);
    }

}
