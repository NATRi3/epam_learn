package edu.epam.task6.Date;

import java.io.IOException;

public class Data {

    private final int second;


    public Data(int second) throws IOException {
        if (second<0){throw new IOException("Не может быть отрицательным");}
        this.second = second;
    }

    public int getSecond() {
        return second;
    }
}
