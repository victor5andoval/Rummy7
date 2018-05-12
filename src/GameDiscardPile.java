import java.util.ArrayList;
import java.util.Map;

public class GameDiscardPile {
    private ArrayList<Card> pile;

    public GameDiscardPile(){this.pile = new ArrayList<>();}

    //Returns the selected card PLUS any cards that may be stacked on top of it
    public Map<String,Card> getCard(){
        return null;
    }

    public void discard(Card c){this.pile.add(c);}
}
