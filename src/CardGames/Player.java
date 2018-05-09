package CardGames;

import java.util.Random;

public class Player {
    int gamesWon;
    String player1;
    String player2;

    public Player(){
        this.player1 = player1;
        this.player2 = player2;
    }

    public int countMe(int gamesWon){
        gamesWon += gamesWon;
        return gamesWon;
    }

    public int getRandom(int min, int max) {
        Random r = new Random();
        return r.ints(min, (max + 1)).findFirst().getAsInt();
    }
}
