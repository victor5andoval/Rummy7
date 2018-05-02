public class Card {

    //TODO should be String. WIll make it easier for printing lines and such
    private char suit;
    private int value;
    private boolean color;

    public char getSuit() {
        return suit;
    }

    public void setSuit(char suit) {
        this.suit = suit;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    //true = red; false = black;
    public boolean isColor() {
        return color;
    }

    //true = red; false = black;
    public void setColor(boolean color) {
        this.color = color;
    }
}

