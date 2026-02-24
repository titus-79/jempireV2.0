package models;

public class Resources {

    private int wood;
    private int stone;
    private int food;
    private int iron;
    private int gold;

    public Resources(int wood, int stone, int food, int iron, int gold) {
        this.wood = wood;
        this.stone = stone;
        this.food = food;
        this.iron = iron;
        this.gold = gold;
    }

    public int getWood() {
        return wood;
    }

    public void setWood(int wood) {
        this.wood = wood;
    }

    public int getStone() {
        return stone;
    }

    public void setStone(int stone) {
        this.stone = stone;
    }

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        this.food = food;
    }

    public int getIron() {
        return iron;
    }

    public void setIron(int iron) {
        this.iron = iron;
    }

    public int getGold() {
        return gold;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }

}
