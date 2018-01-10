import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlayerTest {

    private Player player;

    @Before
    public void before() {
        player = new Player("Giuseppe");
    }

    @Test
    public void playerHasName() {
        assertEquals( "Giuseppe", player.getName());
    }

    @Test
    public void playStartWithNewCard() {
        assertEquals(0, player.getCards().size());
    }

    @Test
    public void playerReceivesCard(){
        Deck deck = new Deck();
        Dealer dealer = new Dealer(deck);
        dealer.deal(player);
        assertEquals(1, player.cardCount());
    }
}
