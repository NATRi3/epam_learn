package edu.epam.task2;

import edu.epam.task2.Date.Date;
import edu.epam.task2.Functions.DateFunctions;

import java.io.IOException;

public class main {
    public static void main(String[] args) throws IOException {
        Date date = new Date(2004, 10);
        System.out.println(DateFunctions.machDays(date));
    }
}
