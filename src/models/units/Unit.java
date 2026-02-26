package models.units;

import java.util.List;

import models.Resources;
import models.tools.Tools;

public abstract class Unit {
    private String name;
    private String surname;
    private static final List<String> villagersName = List.of(
            "Snow", "Stark", "Greyjoy", "Bolton", "Lannister", "Baratheon", "Waters", "Clegane", "Martell", "Naharis",
            "Mormont", "Targaryen", "Arryn", "Hightower", "Free Folk", "de Tarth", "Tyrell", "Sand", "Naath", "Asshai",
            "Lorath", "Maegyr", "Reed");

    private static final List<String> villagerSurname = List.of(
            "Jon", "Robb", "Bran", "Rickon", "Ned", "Benjen", "Theon", "Ramsay", "Roose", "Tyrion", "Jaime", "Tywin",
            "Joffrey", "Tommen", "Stannis", "Renly", "Robert", "Gendry", "Sandor", "Gregor", "Oberyn", "Daario",
            "Jorah", "Viserys", "Drogo", "Daenerys", "Rhaella", "Rhaenyra", "Aemma", "Alicent", "Arya", "Sansa",
            "Catelyn", "Lyanna", "Ygritte", "Brienne", "Cersei", "Myrcella", "Margaery", "Olenna", "Ellaria", "Nymeria",
            "Missandei", "Melisandre", "Shae", "Talisa",
            "Gilly", "Meera", "Asha", "Shireen");

    private boolean assignate;
    private int health;
    private Resources resourcesCost;
    private int improvement = 1;
    private int maxHealth = 10 * improvement;
    private List<Tools> tools;

    public Unit() {
        generateName();
        this.assignate = false;
        this.health = maxHealth;
        System.out.println("Nouveau villageois : " + name + " " + surname + " | vie : " + health + " / " + maxHealth);
    }

    private void generateName() {
        this.name = villagersName.get((int) (Math.random() * villagersName.size()));
        this.surname = villagerSurname.get((int) (Math.random() * villagerSurname.size()));
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

    public List<Tools> getTools(){
        return tools;
    }

}
