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

        while(noWinner){

            if (player1.handValue() > player2.handValue()) {

                return player1;
            } else if (player1.handValue() < player2.handValue()){

                return player2;
            } else {
                dealer.deal(player1);
                dealer.deal(player2);//logically bad change this!
            }
        }


    }
}
