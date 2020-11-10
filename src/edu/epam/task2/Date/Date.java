package edu.epam.task2.Date;

import java.io.IOException;

public class Date {
    private final int year;
    private final int month;

    public Date(int year, int month) throws IOException {
        if(month>12||month<1) throw new IOException("Месяц не может быть меньше 1 или больше 12");
        this.year = year;
        this.month = month;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }
}
