package org.katas;

public class Year {
    private final int year;

    public Year(int year) {
        this.year = year;
    }

    public boolean isLeap() {
        return divisibleBy(4) && !(divisibleBy(100) && notDivisibleBy(400));
    }

    private boolean notDivisibleBy(int number) {
        return year % number != 0;
    }

    private boolean divisibleBy(int number) {
        return year % number == 0;
    }
}
