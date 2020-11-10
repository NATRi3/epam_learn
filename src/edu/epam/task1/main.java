package edu.epam.task1;

import edu.epam.task1.Number.Number;
import edu.epam.task1.Functions.NumberFunction;

public class main {
    public static void main(String[] args) {
        Number number = new Number(15142218);
        int result = NumberFunction.NumberSqd(number);
        System.out.println(result);
    }
}
