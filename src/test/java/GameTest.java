import org.junit.Before;
import org.junit.Test;

public class GameTest {

    Game game;
    Player player1;
    Player player2;
    Dealer dealer;

    @Before
    public void before(){
        player1 = new Player("Giuseppe");
        player2 = new Player("Amy");
        dealer = new Dealer(new Deck());
        game = new Game(dealer, player1, player2);

    }

    @Test
    public void checkWinner(){
        dealer.deal(player1);
        dealer.deal(player2);
        game.checkWinner();
    }
}
