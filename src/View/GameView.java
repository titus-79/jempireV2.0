package View;

import java.util.List;
import java.util.Scanner;

import models.Resources;
import models.building.Farm;
import models.building.House;
import models.units.Villagers;

public class GameView {

    public static void menu(Scanner myScan, Resources resources, List<Villagers> villagers, List<House> houses) {
        System.out.println(menuInfo(resources, villagers, houses));
        int choice = myScan.nextInt();
        switch (choice) {
            case 1:
                menuAssignate(myScan);
                break;
            case 2:
                menuCreateBuilding(myScan, resources);
                break;
            case 3:
                break;
            default:
                break;
        }
    }

    // TODO : remplir les assignements possible avec les methodes de classes adaptés
    private static void menuAssignate(Scanner myScan) {
        System.out.println(menuAssignateInfo());
        int choiceAssignate = myScan.nextInt();
        switch (choiceAssignate) {
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            default:
                break;
        }
    }

    // TODO : remplir les creation de batiment possible avec les methodes de classes
    // adaptés
    private static void menuCreateBuilding(Scanner myScan, Resources ressources) {
        System.out.println(menuCreateBuildingInfo());
        int choiceCreation = myScan.nextInt();
        switch (choiceCreation) {
            case 1:
                break;
            case 2:
                new Farm(ressources);
                break;
            case 3:
                break;
            default:
                break;
        }
    }

    private static String menuInfo(Resources resources, List<Villagers> villagers, List<House> houses) {

        int houseCapacity = houses.stream().map((house) -> house.getCapacity()).reduce(0, (a, b) -> a + b);

        return "Ressources | " + "Bois : " + resources.getWood() + " | Pierre : " + resources.getStone() + " | Fer : "
                + resources.getIron() + " | Or : " + resources.getGold() + " | Nourritures : " + resources.getFood()
                + " | population : " + villagers.size() + "/" + houses.size() * houseCapacity + "\n\n" +
                "Menu \n\n" +
                "1 - assigné vilageois\n" +
                "2 - Créer un batiment\n" +
                "3 - fin de tour\n\n" +
                "Votre choix : ";
    }

    // TODO : Remplir les possibilités au fur et a mesure pour les assignements
    private static String menuAssignateInfo() {
        return "";
    }

    // TODO : Remplir les possibilités au fur et a mesure pour la construction de
    // batiment
    private static String menuCreateBuildingInfo() {
        return "";
    }
}
