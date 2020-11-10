package edu.epam.task1.Functions;
import edu.epam.task1.Number.Number;

public class NumberFunction {
    public static int NumberSqd(Number number){
        int num = (number.getNumber() * number.getNumber()) % 10;
        return num;
    }
}
