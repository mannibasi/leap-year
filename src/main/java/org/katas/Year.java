package org.katas;

public class Year {
    private final int year;

    public Year(int year) {
        this.year = year;
    }

    public boolean isLeap() {
        if (divisibleBy(100) && notDivisibleBy(400)) {
            return false;
        }
        return divisibleBy(4);
    }

    private boolean notDivisibleBy(int number) {
        return year % number != 0;
    }

    private boolean divisibleBy(int number) {
        return year % number == 0;
    }
}
