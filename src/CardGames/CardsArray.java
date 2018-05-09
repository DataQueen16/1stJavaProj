package CardGames;

public class CardsArray extends Card {
    public CardsArray(String suit, String value) {
        super(suit, value);
    }

    public static Card[] getAllCards() {
        return new CardsArray[] {
                new CardsArray("Clubs", "2"),
                new CardsArray("Clubs", "3"),
                new CardsArray("Clubs", "4"),
                new CardsArray("Clubs", "5"),
                new CardsArray("Clubs", "6"),
                new CardsArray("Clubs", "7"),
                new CardsArray("Clubs", "8"),
                new CardsArray("Clubs", "9"),
                new CardsArray("Clubs", "10"),
                new CardsArray("Clubs", "J"),
                new CardsArray("Clubs", "Q"),
                new CardsArray("Clubs", "K"),
                new CardsArray("Clubs", "A"),

                new CardsArray("Hearts", "2"),
                new CardsArray("Hearts", "3"),
                new CardsArray("Hearts", "4"),
                new CardsArray("Hearts", "5"),
                new CardsArray("Hearts", "6"),
                new CardsArray("Hearts", "7"),
                new CardsArray("Hearts", "8"),
                new CardsArray("Hearts", "9"),
                new CardsArray("Hearts", "10"),
                new CardsArray("Hearts", "J"),
                new CardsArray("Hearts", "Q"),
                new CardsArray("Hearts", "K"),
                new CardsArray("Hearts", "A"),

                new CardsArray("Diamonds", "2"),
                new CardsArray("Diamonds", "3"),
                new CardsArray("Diamonds", "4"),
                new CardsArray("Diamonds", "5"),
                new CardsArray("Diamonds", "6"),
                new CardsArray("Diamonds", "7"),
                new CardsArray("Diamonds", "8"),
                new CardsArray("Diamonds", "9"),
                new CardsArray("Diamonds", "10"),
                new CardsArray("Diamonds", "J"),
                new CardsArray("Diamonds", "Q"),
                new CardsArray("Diamonds", "K"),
                new CardsArray("Diamonds", "A"),

                new CardsArray("Spades", "2"),
                new CardsArray("Spades", "3"),
                new CardsArray("Spades", "4"),
                new CardsArray("Spades", "5"),
                new CardsArray("Spades", "6"),
                new CardsArray("Spades", "7"),
                new CardsArray("Spades", "8"),
                new CardsArray("Spades", "9"),
                new CardsArray("Spades", "10"),
                new CardsArray("Spades", "J"),
                new CardsArray("Spades", "Q"),
                new CardsArray("Spades", "K"),
                new CardsArray("Spades", "A"),

        };
    }
}
