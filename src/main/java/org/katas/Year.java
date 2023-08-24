package org.katas;

public class Year {
    private final int year;

    public Year(int year) {
        this.year = year;
    }

    public boolean isLeap() {
        return year % 4 == 0;
    }
}
