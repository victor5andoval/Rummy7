import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Dealer {
    private RummyGameDeck gameDeck;
    private Map<String,Player> players;
    private GameDiscardPile discardPile;
    private Rummy7Utility rummy7Utility = new Rummy7Utility();

    public Dealer(){
        setGameDeck(new RummyGameDeck());
        setPlayers(new HashMap<String,Player>());
        setDiscardPile(new GameDiscardPile());
    }

    public RummyGameDeck getGameDeck() {
        return gameDeck;
    }

    public void setGameDeck(RummyGameDeck gameDeck) {
        this.gameDeck = gameDeck;
    }

    public Map<String,Player> getPlayers() {
        return players;
    }

    public void setPlayers(Map<String,Player> players) {
        this.players = players;
    }

    public GameDiscardPile getDiscardPile() {
        return discardPile;
    }

    public void setDiscardPile(GameDiscardPile discardPile) {
        this.discardPile = discardPile;
    }

    public void shuffleGameDeck(){
        Collections.shuffle(getGameDeck().getCards());
    }

    public void addPlayer(Player player){
        if (getPlayers().size() < 8)
            if (this.getPlayers().put(player.getName(),player) instanceof Player) rummy7Utility.print(player.getName() + " added to dealer");
    }

    //removes 7 cards from the game deck and distributes them to the given player
    public void dealToPlayer(Player player){
        int gameDeckSize = getGameDeck().getCards().size()-1-Rummy7Constants.PLAYER_DEFAULT_DECK_SIZE;
        for (int i = getGameDeck().getCards().size()-1; i > gameDeckSize; i--) {
            Card card = getGameDeck().getCards().get(i);
            player.getDeck().getCards().add(card);
            getGameDeck().getCards().remove(card);
        }
    }
}
