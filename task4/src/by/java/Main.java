package by.java;

public class Main {

    public static void main(String[] args) {
        int number1 = 5;
        int number2 = 4;

        System.out.println(getResult(number1, number2));
    }

    private static int getResult (int number1, int number2) {
        int result = number1 + number2 + (number1 * number2);
        return result;
    }
}
