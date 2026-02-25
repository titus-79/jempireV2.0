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

    public void inceaseWood(int wood) {
        if (wood < 0) {
            System.out.println("valeur bois négative");
        } else {
            this.wood += wood;
        }
    }

    public void decreaseWood(int wood) {
        if (wood < this.wood) {
            System.out.println("Vous n'avez pas assez de bois");
        } else {
            this.wood -= wood;
        }
    }

    public int getStone() {
        return stone;
    }

    public void increaseStone(int stone) {
        this.stone += stone;
    }

    public void decreaseStone(int stone) {
        if (stone < this.stone) {
            System.out.println("Vous n'avez pas assez de pierre");
        } else {
            this.stone -= stone;
        }
    }

    public void increaseStone(int stone) {
        this.stone += stone;
    }

    public void decreaseStone(int stone) {
        if (stone < this.stone) {
            System.out.println("Vous n'avez pas assez de pierre");
        } else {
            this.stone -= stone;
        }
    }

    public int getFood() {
        return food;
    }

    public void increaseFood(int food) {
        this.food += food;
    }

    public void decreaseFood(int food) {
        if (food < this.food) {
            System.out.println("Vous n'avez pas assez de nourriture");
        } else {
            this.food -= food;
        }
    }

    public int getIron() {
        return iron;
    }

    public void increasedIron(int iron) {
        this.iron += iron;
    }

    public void increaseIron(int iron) {
        this.iron += iron;
    }

    public void decreaseIron(int iron) {
        if (iron < this.iron) {
            System.out.println("Vous n'avez pas assez de fer");
        } else {
            this.iron -= iron;
        }
    }

    public int getGold() {
        return gold;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }

    public void increaseGold(int gold) {
        this.gold += gold;
    }

    public void decreaseGold(int gold) {
        if (gold < this.gold) {
            System.out.println("Vous n'avez pas assez d'or");
        } else {
            this.gold -= gold;
        }
    }

}
