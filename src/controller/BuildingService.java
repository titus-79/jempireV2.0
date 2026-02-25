package controller;

import models.Resources;
import models.building.Barrack;
import models.building.Farm;
import models.building.House;
import models.building.Mine;
import models.building.Wall;
import models.building.Workshop;

public class BuildingService {

    public static House buildHouse(Resources resources) {
        if (resources.getWood() < House.WOOD_COST) {
            System.out.println("Pas assez de bois !");
            return null;
        }
        resources.decreaseWood(House.WOOD_COST);
        return new House();
    }

    public static Farm buildFarm(Resources resources) {
        if (resources.getWood() < Farm.WOOD_COST 
                || resources.getStone() < Farm.STONE_COST) {
            System.out.println("Pas assez de ressources !");
            return null;
        }
        resources.decreaseWood(Farm.WOOD_COST);
        resources.decreaseStone(Farm.STONE_COST);
        return new Farm();
    }

        public static Mine buildMine(Resources resources) {
        if (resources.getWood() < Mine.WOOD_COST 
                || resources.getStone() < Mine.STONE_COST) {
            System.out.println("Pas assez de ressources !");
            return null;
        }
        resources.decreaseWood(Mine.WOOD_COST);
        resources.decreaseStone(Mine.STONE_COST);
        return new Mine();
    }

        public static Barrack buildBarrack(Resources resources) {
        if (resources.getWood() < Barrack.WOOD_COST 
                || resources.getStone() < Barrack.STONE_COST || resources.getIron() < Barrack.IRON_COST) {
            System.out.println("Pas assez de ressources !");
            return null;
        }
        resources.decreaseWood(Barrack.WOOD_COST);
        resources.decreaseStone(Barrack.STONE_COST);
        resources.decreaseStone(Barrack.IRON_COST);
        return new Barrack();       
    }

        public static Wall buildWall(Resources resources) {
        if (resources.getWood() < Wall.WOOD_COST 
                || resources.getStone() < Wall.STONE_COST || resources.getIron() < Wall.IRON_COST) {
            System.out.println("Pas assez de ressources !");
            return null;
        }
        resources.decreaseWood(Wall.WOOD_COST);
        resources.decreaseStone(Wall.STONE_COST);
        resources.decreaseStone(Wall.IRON_COST);
        return new Wall();  
    }    

        public static Workshop buildWorkshop(Resources resources) {
        if (resources.getWood() < Workshop.WOOD_COST 
                || resources.getStone() < Workshop.STONE_COST || resources.getIron() < Workshop.IRON_COST) {
            System.out.println("Pas assez de ressources !");
            return null;
        }
        resources.decreaseWood(Workshop.WOOD_COST);
        resources.decreaseStone(Workshop.STONE_COST);
        resources.decreaseStone(Workshop.IRON_COST);
        return new Workshop();       
    }
}
