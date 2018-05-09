package CardGames;

abstract class Card {
    private String suit;
    private String value;

    public Card(String suit, String value){
        this.suit = suit;
        this.value = value;
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
