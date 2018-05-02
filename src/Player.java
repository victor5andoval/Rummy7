import java.util.ArrayList;

public class Player {
    private int score;
    private RummyGameDeck deck;
    private String name;
    //TODO to add playerGame or not?

    public Player(String name) {
        if (name != null && name != "") setName(name);
        setScore(0);
        setDeck(new RummyGameDeck(new ArrayList<Card>()));
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public RummyGameDeck getDeck() {
        return deck;
    }

    public void setDeck(RummyGameDeck deck) {
        this.deck = deck;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
