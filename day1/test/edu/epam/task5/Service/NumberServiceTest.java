package edu.epam.task5.Service;

import org.junit.jupiter.api.Test;
import edu.epam.task5.Number.Number;
import edu.epam.task5.Service.NumberService;

import java.io.IOException;

import static org.testng.Assert.*;

public class NumberServiceTest {

    @Test
    public void NumberServiceTest() throws IOException {
        Number number;
        boolean result = true;
        for(int i = 1; i<28; i++){
            number = new Number(i);
            if (NumberService.isNumberPerfect(number)){
                if (!(number.getNumber()==6||number.getNumber()==28)) {
                    result = false;
                    break;
                }
            }
        }
        assertTrue(result);
    }

    @Test
    public void NumberServiceTestt() {
        try {
            Number number = new Number(-4);
            assertTrue(false);
        }
        catch (IOException e){
            assertTrue(true);
        }
        try{
            Number number = new Number(0);
            assertTrue(false);
        }
        catch (IOException e){
            assertTrue(true);
        }
    }
}