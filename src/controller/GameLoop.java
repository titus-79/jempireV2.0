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
    private List<Unit> recruit;
    private List<Building> constructionList;

    public GameLoop() {
        this.resources = new Resources(500, 500, 1, 500, 500);
        this.recruit = new ArrayList<>();
        this.constructionList = new ArrayList<>();
        this.units = new ArrayList<>();
        units.add(new Villagers());
        this.villages = new ArrayList<>();
        villages.add(new House());
    }

    public void gameLoop() {
        int turn = 1;
        boolean finish = false;
        while (!finish) {
            System.out.println("Tour " + turn);
            finish = GameView.menu(myScan, resources, units, villages, recruit, constructionList);
            if ( resources.getFood() > 0){
                endTurnMethod();
            }else {
                System.out.println("Pas assez de nourriture - vous avez perdu");
                finish = true;
            }
            turn++;
        }
    }

    public void endTurnMethod() {
        if (resources.getFood() < units.size()) {
            int rest = units.size() - resources.getFood();
            for (int i = 0; i < rest; i++) {
                units.removeLast();
            }
            resources.setFood(0);
        } else {
            resources.decreaseFood(units.size());
        }
        units.addAll(recruit);
        villages.addAll(constructionList);
        recruit.clear();
        constructionList.clear();
    }

}
