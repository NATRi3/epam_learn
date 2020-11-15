package edu.epam.task9.figure;

import java.io.IOException;

public class Circlet {

    private final double R;


    public Circlet(double r) throws IOException {
        if (r<=0){throw new IOException("Радиус должен быть больше нуля");}
        R = r;
    }

    public double getR() {
        return R;
    }
}
