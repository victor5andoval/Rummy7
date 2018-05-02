public class SimulateRummy7 {
    //TODO Import and use a testing framework to test the code
    public static void main(String args[]){
        Rummy7Utility rummyUtils = new Rummy7Utility();

        //There's a dealer
        Dealer dealer = new Dealer();

        //Test that RummyGameDeck has the right number of cards. Should be 52
        rummyUtils.print("Dealer's deck size is " + dealer.getGameDeck().getCards().size());

        //check the Dealer's game deck
        rummyUtils.print("These are the cards...");
        dealer.getGameDeck().printlnCards();

        //Players join the game
        Player player1 = new Player("player1");
        Player player2 = new Player("player2");

        dealer.addPlayer(player1);
        dealer.addPlayer(player2);

        //make sure that dealer has the players that were just added
        rummyUtils.print("dealer has the following players:");
        dealer.getPlayers().forEach((name,player) -> {rummyUtils.print(player.getName());});

        //test that cards have been shuffled
        rummyUtils.print("These are the cards... shuffled");
        dealer.shuffleGameDeck();
        dealer.getGameDeck().printlnCards();

        //Dealer deals cards to players
        //Since deck is 52, 52-7=45, 45-7=38. Each player now has 7 cards.
        dealer.dealToPlayer(player1);
        dealer.dealToPlayer(player2);

        //make sure that the players have been dealt 7 cards
        rummyUtils.print("Dealer has dealt the cards to the players. Getting their deck size");
        dealer.getPlayers().forEach((name,player) -> {
            rummyUtils.print(player.getName() + " " + player.getDeck().getCards().size());
        });

        rummyUtils.print("Printing the player1 cards...");
        player1.getDeck().printlnCards();

        rummyUtils.print("Printing the player2 cards...");
        player2.getDeck().printlnCards();
    }


}
