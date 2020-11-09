import Number.Number;
import Functions.NumberFunction;

public class main {
    public static void main(String[] args) {
        Number number = new Number(15);
        int result = NumberFunction.NumberSqd(number);
        System.out.println(result);
    }
}
