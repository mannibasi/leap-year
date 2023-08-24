package org.katas;

public class Year {
    private final int year;

    public Year(int year) {
        this.year = year;
    }

    public boolean isLeap() {
        if (year % 100 == 0 && year % 400 != 0) {
            return false;
        }
        return year % 4 == 0;
    }
}
