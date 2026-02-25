package models.building;

public class House extends Building {
    
    public static final int WOOD_COST = 10;
    private int capacity = 2;

    public House() {
        this.setImprovement(1);
    }

    public int getCapacity() {
        return capacity;
    }



}
