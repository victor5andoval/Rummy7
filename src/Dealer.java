import java.util.Set;

public class Dealer {
    private RummyGameDeck gameDeck;
    private Set<Player> players;
    private GameDiscardPile discardPile;

    public RummyGameDeck getGameDeck() {
        return gameDeck;
    }

    public void setGameDeck(RummyGameDeck gameDeck) {
        this.gameDeck = gameDeck;
    }

    public Set<Player> getPlayers() {
        return players;
    }

    public void setPlayers(Set<Player> players) {
        this.players = players;
    }

    public GameDiscardPile getDiscardPile() {
        return discardPile;
    }

    public void setDiscardPile(GameDiscardPile discardPile) {
        this.discardPile = discardPile;
    }
}
