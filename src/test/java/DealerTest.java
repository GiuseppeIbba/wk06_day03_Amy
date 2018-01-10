import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class DealerTest {

    Dealer dealer;
    Deck deck;
    Player player1;

    @Before
    public void before(){
        deck = new Deck();
        dealer = new Dealer(deck);
        player1 = new Player("Amy");
    }

    @Test
    public void dealerDealsACard(){
//        assertTrue(dealer.deal() instanceof Card);
        dealer.deal(player1);
        int cardCount = dealer.getNumberOfCards();
        assertEquals(51, cardCount);
    }

}
