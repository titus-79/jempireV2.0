package controller;

import models.Resources;
import models.units.Craftsman;
import models.units.Unit;
import models.units.Villagers;

public class UnitService {

    public static Villagers recruitVillagers(Resources resources) {
        if (resources.getFood() < Villagers.FOOD_COST) {
            System.out.println("Pas assez de bois !");
            return null;
        }
        resources.decreaseWood(Villagers.FOOD_COST);
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

    
}
