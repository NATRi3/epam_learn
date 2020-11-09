package Functions;
import Number.Number;

public class NumberFunction {
    public static int NumberSqd(Number number){
        int num = (number.getNumber() * number.getNumber()) % 10;
        return num;
    }
}
