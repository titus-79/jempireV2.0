package controller;

import models.Resources;
import models.units.Craftsman;
import models.units.Officier;
import models.units.Soldier;
import models.units.Unit;
import models.units.Villagers;

public class UnitService {

    public static Villagers recruitVillagers(Resources resources) {
        if (resources.getFood() < Villagers.FOOD_COST) {
            System.out.println("Pas assez de kebab !");
            return null;
        }
        resources.decreaseFood(Villagers.FOOD_COST);
        return new Villagers();
    }

    public static Craftsman recruitCraftsman(Resources resources) {
        if (resources.getFood() < Craftsman.FOOD_COST || resources.getWood() < Craftsman.WOOD_COST
                || resources.getIron() < Craftsman.IRON_COST) {
            System.out.println("Pas assez de ressources !");
            return null;
        }
        resources.decreaseFood(Craftsman.FOOD_COST);
        resources.decreaseWood(Craftsman.WOOD_COST);
        resources.decreaseIron(Craftsman.IRON_COST);

        return new Craftsman();
    }

    public static Soldier recruitSoldier(Resources resources) {
        if (resources.getFood() < Soldier.FOOD_COST || resources.getWood() < Soldier.WOOD_COST
                || resources.getIron() < Soldier.IRON_COST) {
            System.out.println("Pas assez de ressources !");
            return null;
        }
        resources.decreaseFood(Soldier.FOOD_COST);
        resources.decreaseWood(Soldier.WOOD_COST);
        resources.decreaseIron(Soldier.IRON_COST);

        return new Soldier();
    }

    public static Officier recruitOfficier(Resources resources) {
        if (resources.getFood() < Officier.FOOD_COST || resources.getGold() < Officier.GOLD_COST) {
            System.out.println("Pas assez de ressources !");
            return null;
        }
        resources.decreaseFood(Officier.FOOD_COST);
        resources.decreaseGold(Officier.GOLD_COST);

        return new Officier();
    }

}
