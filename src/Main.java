import models.GameLoop;
import models.Resources;

public class Main {
    public static void main(String[] args) {
        Resources resources = new Resources(10,10,50,0,30);
        GameLoop game = new GameLoop(resources);
        System.out.println("Bienvenu sur JEmpire V2\n\n");
        game.gameLoop();
    }
}