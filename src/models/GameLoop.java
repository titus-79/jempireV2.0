package models;

import models.building.House;
import models.units.Villagers;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import View.GameView;

public class GameLoop {

    private int loopOfGame;
    private Resources resources;
    private boolean victory = false;
    private boolean defeat = false;
    private Scanner myScan = new Scanner(System.in);
    private List<Villagers> villagers;
    private List<House> houses;

    public GameLoop() {
        this.resources = new Resources(15, 10, 10, 0, 10);
        this.villagers = new ArrayList<>();
        villagers.add(new Villagers());
        this.houses = new ArrayList<>();
        houses.add(new House(resources));
    }

    public void gameLoop() {
        int turn = 1;
        while (!victory || !defeat) {
            System.out.println("Tour " + turn);
            GameView.menu(myScan, resources, villagers, houses);
            turn++;
        }
    }

    public void buildHouse() {
        if (resources.getWood() >= 10) {
            houses.add(new House(resources));
        } else {
            System.out.println("Pas assez de bois !");
        }
    }

}
