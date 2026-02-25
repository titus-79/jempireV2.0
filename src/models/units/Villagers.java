package models.units;

import java.util.List;

import models.Resources;

public class Villagers {

    private String name;
    private String surname;
    private static final List<String> villagersName = List.of("Lucas", "Nathan", "Emma", "Chloé", "Hugo", "Léa",
            "Louis", "Camille", "Gabriel", "Inès", "Arthur", "Jade", "Raphaël", "Manon", "Tom", "Zoé", "Noah", "Sarah",
            "Adam", "Clara", "Ethan", "Lola", "Paul", "Mila", "Mathis");
    private static final List<String> villagerSurname = List.of("Martin", "Bernard", "Thomas", "Petit", "Robert",
            "Richard", "Durand", "Dubois", "Moreau", "Laurent", "Simon", "Michel", "Lefebvre", "Leroy", "Roux", "David",
            "Bertrand", "Morel", "Fournier", "Girard", "Bonnet", "Dupont", "Lambert", "Fontaine", "Rousseau");
    private boolean assignate;
    private int health;
    private Resources resourcesCost;
    private int improvement;
    private int maxHealth = 10 * improvement;

    public Villagers(Resources resourcesCost) {
        generateName();
        this.assignate = false;
        this.health = maxHealth;
        this.resourcesCost = resourcesCost;
        this.improvement = improvement;
        System.out.println("Nouveau villageois : " + name + " " + surname + " | vie : " + health + " / " + maxHealth);
    }

    private void generateName() {
        int random = (int) (Math.random() * 25);
        this.name = villagersName.get(random);
        this.surname = villagerSurname.get(random);
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public void setAssignate(boolean assignate) {
        this.assignate = assignate;
    }

    public int getHealth() {
        return health;
    }

    public void increaseHealth(int health) {
        this.health += health;
    }

    public void decreaseHealth(int health) {
        if (health > this.health) {
            this.health = 0;
        } else {
            this.health -= health;
        }
    }
        public Resources getResourcesCost() {
        return resourcesCost;
    }

    public void setResourcesCost(Resources resourcesCost) {
        this.resourcesCost = resourcesCost;
    }

    public int getImprovement() {
        return improvement;
    }

    public void setImprovement(int improvement) {
        this.improvement = improvement;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public static List<String> getVillagersname() {
        return villagersName;
    }

    public static List<String> getVillagersurname() {
        return villagerSurname;
    }

    public boolean isAssignate() {
        return assignate;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getMaxHealth() {
        return maxHealth;
    }

    public void setMaxHealth(int maxHealth) {
        this.maxHealth = maxHealth;
    }
}
