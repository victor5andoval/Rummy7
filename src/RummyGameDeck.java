import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.Stack;

public class RummyGameDeck {
    private ArrayList<Card> cards;
    private Stack<Card> missingCardsLog;

    public RummyGameDeck() {
        this.cards = new ArrayList<Card>();
        this.missingCardsLog = new Stack<Card>();
        fillRummyGameDeck();
    }

    public RummyGameDeck(ArrayList<Card> cards){
        this.cards = cards;
    }

    public ArrayList<Card> getCards(){
        return this.cards;
    }

    //print all the cards
    public void printlnCards(){
        this.getCards().forEach(System.out::println);
    }

    //Fill up RummyGameDeck with Cards excluding the Joker
    private void fillRummyGameDeck(){
        for (int colorCounter = 0; colorCounter < 2; colorCounter++) {
            for (int suitCounter = 0; suitCounter < 2; suitCounter++) {
                for (int value = 2; value < 15; value++) {
                    boolean cardColor = true;
                    char cardSuit = Character.MIN_VALUE;

                    if (colorCounter == 0){
                        //black
                        cardColor = false;
                        if(suitCounter == 0){
                            cardSuit=Rummy7Constants.CARD_CHAR_CLUBS;
                        }else if(suitCounter == 1){
                            cardSuit=Rummy7Constants.CARD_CHAR_SPADES;
                        }

                    }
                    else if(colorCounter == 1){
                        //red
                        cardColor = true;
                        if(suitCounter == 0){
                            cardSuit=Rummy7Constants.CARD_CHAR_DIAMONDS;
                        }else if(suitCounter == 1) {
                            cardSuit = Rummy7Constants.CARD_CHAR_HEARTS;
                        }
                    }

                    Card card = new Card();

                    card.setColor(cardColor);
                    card.setSuit(cardSuit);
                    card.setValue(value);

                    this.getCards().add(card);
                }
            }
        }
    }
}
