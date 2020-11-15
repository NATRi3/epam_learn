package edu.epam.day2.task3.service.reader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReaderNumber {
    public int ReaderNumber(){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            for (String number = null; true;) {
                try {
                    number = reader.readLine();
                    int result = Integer.parseInt(number);
                    if (result > 0) {
                        return result;
                    }
                    throw new Exception();
                } catch (Exception e) {
                    System.out.println("Попробуйте еще раз :)");
                }
            }
        }
        catch (Exception e){
            System.out.println("Something go wrong.");
        }
        return 0;
    }
}
