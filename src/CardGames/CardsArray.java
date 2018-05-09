package CardGames;

public class CardsArray extends Card {
    public CardsArray(String suit, String value, int ID) {
        super(suit, value, ID);
    }

    public static Card[] getAllCards() {
        return new CardsArray[] {
                new CardsArray("Clubs", "2", 1),
                new CardsArray("Clubs", "3", 2),
                new CardsArray("Clubs", "4", 3),
                new CardsArray("Clubs", "5", 4),
                new CardsArray("Clubs", "6", 5),
                new CardsArray("Clubs", "7", 6),
                new CardsArray("Clubs", "8", 7),
                new CardsArray("Clubs", "9", 8),
                new CardsArray("Clubs", "10", 9),
                new CardsArray("Clubs", "J", 10),
                new CardsArray("Clubs", "Q", 11),
                new CardsArray("Clubs", "K", 12),
                new CardsArray("Clubs", "A", 13),

                new CardsArray("Hearts", "2", 14),
                new CardsArray("Hearts", "3", 15),
                new CardsArray("Hearts", "4", 16),
                new CardsArray("Hearts", "5", 17),
                new CardsArray("Hearts", "6", 18),
                new CardsArray("Hearts", "7", 19),
                new CardsArray("Hearts", "8", 20),
                new CardsArray("Hearts", "9", 21),
                new CardsArray("Hearts", "10", 22),
                new CardsArray("Hearts", "J", 23),
                new CardsArray("Hearts", "Q", 24),
                new CardsArray("Hearts", "K", 25),
                new CardsArray("Hearts", "A", 26),

                new CardsArray("Diamonds", "2", 27),
                new CardsArray("Diamonds", "3", 28),
                new CardsArray("Diamonds", "4", 29),
                new CardsArray("Diamonds", "5", 30),
                new CardsArray("Diamonds", "6", 31),
                new CardsArray("Diamonds", "7", 32),
                new CardsArray("Diamonds", "8", 33),
                new CardsArray("Diamonds", "9", 34),
                new CardsArray("Diamonds", "10", 35),
                new CardsArray("Diamonds", "J",36),
                new CardsArray("Diamonds", "Q",37),
                new CardsArray("Diamonds", "K",38),
                new CardsArray("Diamonds", "A",39),

                new CardsArray("Spades", "2",40),
                new CardsArray("Spades", "3",41),
                new CardsArray("Spades", "4",42),
                new CardsArray("Spades", "5",43),
                new CardsArray("Spades", "6",44),
                new CardsArray("Spades", "7",45),
                new CardsArray("Spades", "8",46),
                new CardsArray("Spades", "9",47),
                new CardsArray("Spades", "10",48),
                new CardsArray("Spades", "J",49),
                new CardsArray("Spades", "Q",50),
                new CardsArray("Spades", "K",51),
                new CardsArray("Spades", "A",52),

        };
    }
}
