package edu.epam.task3.figure;

import java.io.IOException;

public class Circle {
    private final double SQR;


    public Circle(double sqr) throws IOException {
        if (sqr<=0) throw new IOException("Круг не может иметь площать меньше 0");
        SQR = sqr;
    }

    public double getSQR() {
        return SQR;
    }
}
