package controller;

import models.Resources;
import models.building.Building;
import models.building.House;
import models.units.Unit;
import models.units.Villagers;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import View.GameView;

public class GameLoop {

    private int loopOfGame;
    private Resources resources;
    private Scanner myScan = new Scanner(System.in);
    private List<Unit> units;
    private List<Building> villages;

    public GameLoop() {
        this.resources = new Resources(500, 500, 500, 500, 500);
        this.units = new ArrayList<>();
        units.add(new Villagers());
        this.villages = new ArrayList<>();
        villages.add(new House());
    }

    public void gameLoop() {
        int turn = 1;
        boolean finish = false;
        while (!finish){
            System.out.println("Tour " + turn);
            finish = GameView.menu(myScan, resources, units, villages);
            turn++;
        }
    }

    public static void recuitSoldier(Resources resources, List<Villagers> villagers) {
        // TODO Méthodes pour polymorpher une instance vilageois en soldat
        // if (resources.getFood() >= 5 && resources.getWood() >= 5 && resources.getIron() >= 10) {
        //     List<Villagers> villagersVoluntary = villagers.map((Villagers villager) -> villager.isAssignate == false);
        //     villagers.add(new Soldier(resources));
        // } else {
        //     System.out.println("Pas assez de ressources !");
        // }
    }

}
