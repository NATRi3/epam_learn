package edu.epam.task3.figure;

import java.io.IOException;

public class Square {
    private final double SQR;


    public Square(double sqr) throws IOException {
        if (sqr<=0) throw new IOException("Квадрат не может иметь площать меньше 0");
        SQR = sqr;
    }

    public double getSqr() {
        return SQR;
    }
}
