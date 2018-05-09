package CardGames;

import java.util.Scanner;

public class GameOfWar {
    Player play = new Player();
    Scanner scanner = new Scanner(System.in);

    public static String turn1;
    public static String turn2;

    public static int playCard1() {
        turn1 = play.getRandom(1, 52);
    }

    public static int playCard2() {
        turn2 = play.getRandom(1, 52);
    }

}

