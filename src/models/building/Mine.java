package models.building;

public class Mine extends Building {

    public static final int WOOD_COST = 15;
    public static final int STONE_COST = 10;
    public static final int STONE_PRODUCT = 10;
    public static final int IRON_PRODUCT = 10;

    public Mine() {
        this.setImprovement(1);
    }

    public void setRessourceStone() {
        getResourcesCost().increaseStone(STONE_PRODUCT);
    }

    public void SetRessourceIron() {
        getResourcesCost().increaseIron(IRON_PRODUCT);
    }
}
