public class Card {

    //TODO should be String. WIll make it easier for printing lines and such
    private char suit;
    private int value;
    private boolean color;
    private String ui_color;

    public Card () {
        ui_color = color?Rummy7Constants.CARD_STRING_COLOR_RED:Rummy7Constants.CARD_STRING_COLOR_BLACK;
        //TODO Do the same as above for suits
    }

    //user friendly string equivalent of color. Ie, Red, Black
    public String getUi_color() {
        return ui_color;
    }

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

    //Testing git
    public String toString(){
        return "Card"
    }
}

