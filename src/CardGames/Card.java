package CardGames;

public class Card {
    private String suit;
    private String value;
    private int ID;

    public Card(String suit, String value, int ID){
        this.suit = suit;
        this.value = value;
        this.ID = ID;
    }

    public String setSuit(String suit) {
        return this.suit = suit;
    }

    public String getSuit() {
        return suit;
    }

    public String setValue(String value) {
        return this.value = value;
    }

    public String getValue() {
        return value;
    }
}
