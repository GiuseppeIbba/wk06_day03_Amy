public class Game {

    Dealer dealer;
    Player player1;
    Player player2;


    Game(Dealer dealer, Player player1, Player player2){
        this.dealer = dealer;
        this.player1 = player1;
        this.player2 = player2;
    }

    Player checkWinner(){
        boolean noWinner = true;
        Player winner = null;
        while(noWinner){

            if (player1.handValue() > player2.handValue()) {

                winner = player1;
                noWinner = false;
            } else if (player1.handValue() < player2.handValue()){

                winner = player2;
                noWinner = false;
            } else {
                dealer.deal(player1);
                dealer.deal(player2);//logically bad change this!
            }
        }
        return winner;
    }
}
