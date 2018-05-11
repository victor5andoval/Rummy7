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

    // readable card value
    public String toString(){
        String tempColor = this.color ? "red" : "black";
        String tempSuit = "";
        switch (this.suit){
            case('c'):tempSuit = "clubs";       break;
            case('s'):tempSuit = "spades";      break;
            case('d'):tempSuit = "diamonds";    break;
            case('h'):tempSuit = "hearts";      break;
        }
        String tempValue = "";
        if (this.value > 10){
            switch (this.value){
                case(11):tempValue = "J";break;
                case(12):tempValue = "Q";break;
                case(13):tempValue = "K";break;
                case(14):tempValue = "A";break;
            }
        } else {tempValue = String.valueOf(this.value);}
        
        
        return String.format("%-6s %-2s of %1s", tempColor,tempValue,tempSuit );
    }}

