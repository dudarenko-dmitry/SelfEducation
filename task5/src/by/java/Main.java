package by.java;

public class Main {

    public static void main(String[] args) {

        int timeInSecond = 1005030;
        int minuteTotal = timeInSecond / 60;
        int second = timeInSecond % 60;
        int hourTotal = minuteTotal / 60;
        int minute = minuteTotal % 60;
        int dayTotal = hourTotal / 24;
        int hour = hourTotal % 24;
        int week = dayTotal / 7;
        int day = dayTotal % 7;

        System.out.println("Total time in seconds " + timeInSecond + " is: " +
                week + " weeks " +
                day + " days " +
                hour + " hours " +
                minute + " minutes " +
                second + " seconds.");
    }
}