package View;

import models.Resources;
import models.building.*;
import models.units.Craftsman;
import models.units.Soldier;
import models.units.Unit;
import models.units.Villagers;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import controller.BuildingService;
import controller.GameLoop;
import controller.UnitService;

public class GameView {

    public static boolean menu(Scanner myScan, Resources resources, List<Unit> units,
            List<Building> buildings , List<Unit> recruit , List<Building> constructionList) {
        boolean endTurn = false;
        do {
            System.out.println(menuInfo(resources, units, buildings , recruit , constructionList));
            int choice = myScan.nextInt();
            switch (choice) {
                case 1:
                    menuAssignate(myScan, resources, units, buildings);
                    break;
                case 2:
                    menuCreateBuilding(myScan, resources, buildings , constructionList);
                    break;
                case 3:
                    menuRecruitUnit(myScan, resources, units, buildings , recruit);
                    break;
                case 9:
                    units.forEach((villager) -> {
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
    private static void menuAssignate(Scanner myScan, Resources resources, List<Unit> units,
            List<Building> buildings) {

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

    private static void menuCreateBuilding(Scanner myScan, Resources resources, List<Building> buildings, List<Building> listConstruction) {
        System.out.println(menuCreateBuildingInfo());
        boolean isContruct = false;
        int choiceCreation = myScan.nextInt();
        switch (choiceCreation) {
            case 1:
                House house = BuildingService.buildHouse(resources);
                if (house != null) {
                    listConstruction.add(house);
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
                        listConstruction.add(farm);
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
                        listConstruction.add(mine);
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
                        listConstruction.add(barrack);
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
                        listConstruction.add(workshop);
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
                        listConstruction.add(wall);
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

    private static String menuInfo(Resources resources, List<Unit> units, List<Building> buildings, List<Unit> recruit, List<Building> constructionList) {


        StringBuilder infoListConstruct = new StringBuilder();
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

       for (Building building : constructionList){
           infoListConstruct.append(building.getName()).append(", ");
       }

        return "Liste de construction : " + infoListConstruct + "\n"+
                "Ressources | " + "Bois : " + resources.getWood() + " | Pierre : " + resources.getStone() + " | Fer : "
                + resources.getIron() + " | Or : " + resources.getGold() + " | Nourritures : " + resources.getFood()
                + " | population : " + units.size() + "/" + houseCapacity + "\n\n" +
                "Menu \n\n" +
                "1 - assigné vilageois\n" +
                "2 - Créer un batiment\n" +
                "3 - recruter une Unité\n" +
                "9 - fin de tour\n" +
                "0 - Quitter le jeu\n\n" +
                "Votre choix : ";
    }

    // TODO : Remplir les possibilités au fur et a mesure pour les assignements
    private static String menuAssignateInfo() {
        return "Menu assignate :\n";
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

    private static String menuRecruitUnitInfo() {
        return "Menu Recrutement :\n" +
                "1 - Recruter un villageois - " + Villagers.FOOD_COST + " nourritures\n" +
                "2 - Recruter un artisan - " + Craftsman.FOOD_COST + " nourritures | " + Craftsman.WOOD_COST + " bois | " + Craftsman.IRON_COST + " fer\n" +
                "3 - Recruter un soldat - " + Soldier.FOOD_COST + " nourritures | " + Soldier.WOOD_COST + " bois | " + Soldier.IRON_COST + " fer\n" +

                "0 - Retour";
    }

    private static void menuRecruitUnit(Scanner myScan, Resources resources, List<Unit> units, List<Building> buildings , List<Unit> recruit) {
        List<House> houses = new ArrayList<>();
        boolean isConstruct = false;
        for (Building building : buildings) {
            if (building instanceof House) {
                houses.add((House) building);
            }
        }
        int houseCapacity = 0;
        for (House house : houses) {
            houseCapacity += house.getCapacity();
        }
        System.out.println(menuRecruitUnitInfo());
        int choiceRecruit = myScan.nextInt();
        switch (choiceRecruit) {
            case 1:
                if (units.size() >= houseCapacity) {
                    System.out
                            .println(
                                    "Vous n'avez plus de place dans les maisons pour recruter un nouveau villageois.\n");
                    break;
                }
                Unit villager = UnitService.recruitVillagers(resources);
                if (villager != null) {
                    units.add(villager);
                }
                break;
            case 2:
                if (units.size() >= houseCapacity) {
                    System.out
                            .println(
                                    "Vous n'avez plus de place dans les maisons pour recruter un nouveau villageois.\n");
                    break;
                }
                Unit craftsman = UnitService.recruitCraftsman(resources);
                if (craftsman != null) {
                    units.add(craftsman);
                }

                break;
            case 3:
                for (Building building : buildings) {
                    if (building instanceof Barrack) {
                        isConstruct = true;
                        Unit soldier = UnitService.recruitSoldier(resources);
                        if (soldier != null) {
                            units.add(soldier);
                        }
                    } else {
                        System.out.println("Vous n'avez pas de caserne !!\n");
                    }
                }
                break;
            case 4:

                break;
            case 5:

                break;
            case 6:

                break;
            case 0:
                break;
            default:
                System.out.println("Choix impossible");
                break;
        }
    }
}
