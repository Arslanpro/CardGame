import java.util.ArrayList;
import java.util.List;

public class Hand {
    List<Card> cards;

    public Hand() {
        this.cards = new ArrayList<>();
    }

    public void addCard(Card card) {
        cards.add(card);
    }

    public Card playCard() {
        return cards.remove(0);  // play the top card
    }

    // Add more methods as needed, like checking if hand is empty, etc.
}

