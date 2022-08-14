package by.java.entities;

public class Rainbow {

    int colourNumber1;
    int colourNumber2;
//    String colour;

    public Rainbow(int colourNumber1, int colourNumber2) {
        this.colourNumber1 = colourNumber1;
        this.colourNumber2 = colourNumber2;
    }

    public int getColourNumber1() {
        return colourNumber1;
    }

    public int getColourNumber2() {
        return colourNumber2;
    }

    public void setColourNumber1(int colourNumber1) {
        this.colourNumber1 = colourNumber1;
    }

    public void setColourNumber2(int colourNumber2) {
        this.colourNumber2 = colourNumber2;
    }

    //    public void setColourNumber1(int colourNumber1) {
//        this.colourNumber1 = getColour(colourNumber1);
//    }
//
//    public void setColourNumber2(int colourNumber2) {
//        if (colourNumber1 == colourNumber2) {
//            colourNumber2 = 0;
//        } else {
//            this.colourNumber2 = getColour(colourNumber2);
//        }
//    }

    private String getColour(int colourNumber) {
        switch (colourNumber) {
            case 1:
                return "RED";
            case 2:
                return "ORANGE";
            case 3:
                return "YELLOW";
            case 4:
                return "GREEN";
            case 5:
                return "LIGHT BLUE";
            case 6:
                return "BLUE";
            case 7:
                return "VIOLET";
            default:
                return "This colour doesn't exist";

        }
    }

    @Override
    public String toString(){
        if (colourNumber1 == colourNumber2){
            return "Rainbow colour is " + colourNumber1;
        }
        return "Rainbow colours are " + colourNumber1 +
                "-" + colourNumber2;
    }
}
