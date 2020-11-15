package edu.epam.task5.Number;

import java.io.IOException;

public class Number {

    private final int NUMBER;

    public Number(int number) throws IOException {
        if (number<=0){throw new IOException("Число не должно быть меньше либо равно нуля.");}
        NUMBER = number;
    }

    public int getNumber() {
        return NUMBER;
    }
}
