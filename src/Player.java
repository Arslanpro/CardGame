public class Player {
    Hand hand;
    String name;

    public Player(String name) {
        this.name = name;
        this.hand = new Hand();
    }

    public void receiveCard(Card card) {
        hand.addCard(card);
    }

    public Card playCard() {
        return hand.playCard();
    }

    // Add more methods as needed, like checking if player has any cards left, etc.
}
