package CardGames;

public class CardsArray extends Card {
    public CardsArray(String suit, String value, int ID) {
        super(suit, value, ID);
    }

    public static Card[] getAllCards() {
        return new Card[] {
                new Card("Clubs", "2", 1),
                new Card("Clubs", "3", 2),
                new Card("Clubs", "4", 3),
                new Card("Clubs", "5", 4),
                new Card("Clubs", "6", 5),
                new Card("Clubs", "7", 6),
                new Card("Clubs", "8", 7),
                new Card("Clubs", "9", 8),
                new Card("Clubs", "10", 9),
                new Card("Clubs", "J", 10),
                new Card("Clubs", "Q", 11),
                new Card("Clubs", "K", 12),
                new Card("Clubs", "A", 13),
                new Card("Hearts", "2", 1),
                new Card("Hearts", "3", 2),
                new Card("Hearts", "4", 3),
                new Card("Hearts", "5", 4),
                new Card("Hearts", "6", 5),
                new Card("Hearts", "7", 6),
                new Card("Hearts", "8", 7),
                new Card("Hearts", "9", 8),
                new Card("Hearts", "10", 9),
                new Card("Hearts", "J", 10),
                new Card("Hearts", "Q", 11),
                new Card("Hearts", "K", 12),
                new Card("Hearts", "A", 13),
                new Card("Diamonds", "2", 1),
                new Card("Diamonds", "3", 2),
                new Card("Diamonds", "4", 3),
                new Card("Diamonds", "5", 4),
                new Card("Diamonds", "6", 5),
                new Card("Diamonds", "7", 6),
                new Card("Diamonds", "8", 7),
                new Card("Diamonds", "9", 8),
                new Card("Diamonds", "10", 9),
                new Card("Diamonds", "J",10),
                new Card("Diamonds", "Q",11),
                new Card("Diamonds", "K",12),
                new Card("Diamonds", "A",13),
                new Card("Spades", "2",1),
                new Card("Spades", "3",2),
                new Card("Spades", "4",3),
                new Card("Spades", "5",4),
                new Card("Spades", "6",5),
                new Card("Spades", "7",6),
                new Card("Spades", "8",7),
                new Card("Spades", "9",8),
                new Card("Spades", "10",9),
                new Card("Spades", "J",10),
                new Card("Spades", "Q",11),
                new Card("Spades", "K",12),
                new Card("Spades", "A",13),

        };
    }

    private Card[] deck = getAllCards();

        private int cardsUsed;

        public void shuffle() {
            for ( int i = deck.length-1; i > 0; i-- ) {
                int rand = (int)(Math.random()*(i+1));
                Card temp = deck[i];
                deck[i] = deck[rand];
                deck[rand] = temp;
            }
            cardsUsed = 0;
        }

        public int cardsLeft() {
            return deck.length - cardsUsed;
        }

        public Card dealCard() {
            if (cardsUsed == deck.length)
                throw new IllegalStateException("No cards are left in the deck.");
            cardsUsed++;
            return deck[cardsUsed - 1];
        }

}
