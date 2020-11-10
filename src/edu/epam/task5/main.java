package edu.epam.task5;

import edu.epam.task5.Number.Number;
import edu.epam.task5.Service.NumberService;
import java.io.IOException;

public class main {
    public static void main(String[] args) throws IOException {
        Number number = new Number(8);
        System.out.println(NumberService.isNumberPerfect(number));
    }
}
