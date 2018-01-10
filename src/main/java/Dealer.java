
import java.util.ArrayList;
import java.util.Collections;

public class Dealer {

    private Deck deck;

    Dealer(Deck deck){
        this.deck = deck;
    }

    public void deal(Player player1) {
        shuffle();
        Card card = deck.getCard();
        player1.giveCard(card);

    }

    public void shuffle() {
        ArrayList<Card> cards = deck.getDeck();
        Collections.shuffle(cards);
    }

    public Deck getDeck() {
        return this.deck;
    }

    public int getNumberOfCards() {
        return this.deck.getDeck().size();
    }
}
