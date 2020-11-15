package edu.epam.task2.Functions;

import edu.epam.task2.Date.Date;
import edu.epam.task2.Functions.DateFunctions;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.testng.Assert.*;

public class DateFunctionsTest {

    @Test
    public void machDaysTest () throws IOException {
        boolean result = true;
        Date date = new Date(2004,2);
        Date date1 = new Date(2000, 11);
        Date date2 = new Date(1999, 2);
        Date date3 = new Date(1999, 4);
        Date date4 = new Date(1998, 10);
        if(!(DateFunctions.machDays(date)==29)){result = false; }
        if(!(DateFunctions.machDays(date1)==30)){result = false; }
        if(!(DateFunctions.machDays(date2)==28)){result = false; }
        if(!(DateFunctions.machDays(date3)==31)){result = false; }
        if(!(DateFunctions.machDays(date4)==31)){result = false; }
        assertTrue(result);
    }
}