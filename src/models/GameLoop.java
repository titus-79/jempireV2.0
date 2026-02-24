package models;

import models.units.Villagers;

import java.util.List;
import java.util.Scanner;

public class GameLoop {

    private int loopOfGame;
    private Resources resources;
    private boolean victory = false;
    private boolean defeat = false;
    private Scanner myScan = new Scanner(System.in);
    private List<Villagers> villagers;

    public GameLoop(Resources resources, List<Villagers> villagers) {
        this.resources = resources;
        this.villagers = villagers;
    }

    public void gameLoop(){

        while (!victory || !defeat){
            menu(myScan);
        }

    }

    public void menu(Scanner myScan){
        System.out.println(menuInfo());
        int choice = myScan.nextInt();
        switch (choice){
            case 1 :
                menuAssignate(myScan);
                break;
            case 2 :
                menuCreateBuilding(myScan);
                break;
            case 3 :
                break;
            default :
                break;
        }
    }

    // TODO  : remplir les assignements possible avec les methodes de classes adaptés
    private void menuAssignate(Scanner myScan){
        System.out.println(menuAssignateInfo());
        int choiceAssignate = myScan.nextInt();
        switch (choiceAssignate){
            case 1 :
                break;
            case 2 :
                break;
            case 3 :
                break;
            default :
                break;
        }
    }

    // TODO  : remplir les creation de batiment possible avec les methodes de classes adaptés
    private void menuCreateBuilding(Scanner myScan){
        System.out.println(menuCreateBuildingInfo());
        int choiceCreation = myScan.nextInt();
        switch (choiceCreation){
            case 1 :
                break;
            case 2 :
                break;
            case 3 :
                break;
            default :
                break;
        }
    }

    private String menuInfo() {
        return "Ressources | " + "Bois : " +resources.getWood() + " | Pierre : "+resources.getStone() + " | Fer : " + resources.getIron() + " | Or : " + resources.getGold() + " | Nourritures : " + resources.getFood() + "\n\n" +
                "Menu \n\n" +
                "1 - assigné vilageois\n" +
                "2 - Créer un batiment\n" +
                "3 - fin de tour\n\n" +
                "Votre choix : ";
    }

    // TODO : Remplir les possibilités au fur et a mesure pour les assignements
    private String menuAssignateInfo() {
        return "";
    }

    // TODO : Remplir les possibilités au fur et a mesure pour la construction de batiment
    private String menuCreateBuildingInfo() {
        return "";
    }
}
