package edu.epam.task1.Number;

public class Number {
    private final int lastNumber;

    public Number(int number) {
        this.lastNumber = number%10;
    }

    public int getNumber() {
        return lastNumber;
    }
}
