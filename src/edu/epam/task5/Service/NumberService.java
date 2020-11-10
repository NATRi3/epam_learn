package edu.epam.task5.Service;

import edu.epam.task5.Number.Number;

public class NumberService {

    public static boolean isNumberPerfect(Number number){
        int result = 0;
        for (int i = 1; i < number.getNumber(); i++){
            if (number.getNumber() % i==0){
                result+=i;
            }
        }
        if(result == number.getNumber()){
            return true;
        }
        else {
            return false;
        }
    }

}
