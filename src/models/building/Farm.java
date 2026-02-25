package models.building;

public class Farm extends Building {

    public static final int WOOD_COST = 10;
    public static final int STONE_COST = 10;
    public static final int FOOD_PRODUCT = 10;

    public Farm() {
        this.setImprovement(1);
    }

    public void getFarmProduct() {
        getResourcesCost().increaseFood(FOOD_PRODUCT * getImprovement());
    }

}
