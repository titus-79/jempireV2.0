package View;

import models.Resources;
import models.building.*;
import models.units.Villagers;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import controller.BuildingService;
import controller.GameLoop;

public class GameView {

    public static boolean menu(Scanner myScan, Resources resources, List<Villagers> villagers,
            List<Building> buildings) {
        boolean endTurn = false;
        do {
            System.out.println(menuInfo(resources, villagers, buildings));
            int choice = myScan.nextInt();
            switch (choice) {
                case 1:
                    menuAssignate(myScan);
                    break;
                case 2:
                    menuCreateBuilding(myScan, resources, buildings);
                    break;
                case 3:
                    break;
                case 9:
                    villagers.forEach((villager) -> {
                        villager.setAssignate(false);
                    });
                    endTurn = true;
                    break;
                case 0:
                    System.out.println("Aurevoir");
                    return true;
                default:
                    System.out.println("Choix impossible");
                    break;
            }
        } while (!endTurn);
        return false;
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

    private static void menuCreateBuilding(Scanner myScan, Resources resources, List<Building> buildings) {
        System.out.println(menuCreateBuildingInfo());
        boolean isContruct = false;
        int choiceCreation = myScan.nextInt();
        switch (choiceCreation) {
            case 1:
                House house = BuildingService.buildHouse(resources);
                if (house != null) {
                    buildings.add(house);
                }
                break;
            case 2:
                for (Building building : buildings) {
                    if (building instanceof Farm) {
                        isContruct = true;
                        break;
                    }
                }
                if (isContruct) {
                    System.out.println("Ferme déjà contruite");

                } else {
                    Farm farm = BuildingService.buildFarm(resources);
                    if (farm != null) {
                        buildings.add(farm);
                    }
                }
                break;
            case 3:
                for (Building building : buildings) {
                    if (building instanceof Mine) {
                        isContruct = true;
                        break;
                    }
                }
                if (isContruct) {
                    System.out.println("Mine déjà contruite");

                } else {
                    Mine mine = BuildingService.buildMine(resources);
                    if (mine != null) {
                        buildings.add(mine);
                    }
                }
                break;
            case 4:
                for (Building building : buildings) {
                    if (building instanceof Barrack) {
                        isContruct = true;
                        break;
                    }
                }
                if (isContruct) {
                    System.out.println("Caserne déjà contruite");

                } else {
                    Barrack barrack = BuildingService.buildBarrack(resources);
                    if (barrack != null) {
                        buildings.add(barrack);
                    }
                }
                break;
            case 5:
                for (Building building : buildings) {
                    if (building instanceof Workshop) {
                        isContruct = true;
                        break;
                    }
                }
                if (isContruct) {
                    System.out.println("Atelier déjà contruite");

                } else {
                    Workshop workshop = BuildingService.buildWorkshop(resources);
                    if (workshop != null) {
                        buildings.add(workshop);
                    }
                }
                break;
            case 6:
                for (Building building : buildings) {
                    if (building instanceof Wall) {
                        isContruct = true;
                        break;
                    }
                }
                if (isContruct) {
                    System.out.println("Mur déjà contruite");

                } else {
                    Wall wall = BuildingService.buildWall(resources);
                    if (wall != null) {
                        buildings.add(wall);
                    }
                }
                break;
            case 0:
                break;
            default:
                System.out.println("Choix impossible");
                break;
        }
    }

    private static String menuInfo(Resources resources, List<Villagers> villagers, List<Building> buildings) {

        // int houseCapacity = buildings.stream()
        // .filter(building -> building instanceof House)
        // .map((house) -> ((House)house).getCapacity())
        // .reduce(0, (a, b) -> a + b);

        List<House> houses = new ArrayList<>();
        for (Building building : buildings) {
            if (building instanceof House) {
                houses.add((House) building);
            }
        }
        int houseCapacity = 0;
        for (House house : houses) {
            houseCapacity += house.getCapacity();
        }

        return "Ressources | " + "Bois : " + resources.getWood() + " | Pierre : " + resources.getStone() + " | Fer : "
                + resources.getIron() + " | Or : " + resources.getGold() + " | Nourritures : " + resources.getFood()
                + " | population : " + villagers.size() + "/" + houseCapacity + "\n\n" +
                "Menu \n\n" +
                "1 - assigné vilageois\n" +
                "2 - Créer un batiment\n" +
                "3 - recruter un soldat\n" +
                "9 - fin de tour\n" +
                "0 - Quitter le jeu\n\n" +
                "Votre choix : ";
    }

    // TODO : Remplir les possibilités au fur et a mesure pour les assignements
    private static String menuAssignateInfo() {
        return "Menu assignate";
    }

    private static String menuCreateBuildingInfo() {
        return "Menu bâtiment :\n" +
                "1 - Créer une maison - 10 bois\n" +
                "2 - Créer la ferme - 10 bois | 5 pierres\n" +
                "3 - Créer la mine - 15 bois | 10 pierres\n" +
                "4 - Créer la caserne - 20 bois | 10 pierres | 5 fers\n" +
                "5 - Créer l'atelier - 20 bois | 10 pierres | 5 fer\n" +
                "6 - Créer le mur - 10 bois | 20 pierres | 5 fer\n" +
                "0 - Retour";
    }
}
