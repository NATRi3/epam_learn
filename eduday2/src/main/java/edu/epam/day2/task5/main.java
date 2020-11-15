package edu.epam.day2.task5;

import edu.epam.day2.task5.date.Date;
import edu.epam.day2.task5.developer.Developer;
import edu.epam.day2.task5.service.Calculat;

import java.io.IOException;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class main {
    public static void main(String[] args) throws IOException {
        Developer developer = new Developer(63, "Саша");
        Date date = new Date(new GregorianCalendar(2007,10,2));
        new Calculat().CalculateDate(date, developer);
        System.out.println(date.getDateDevelop().get(Calendar.YEAR) + " " + date.getDateDevelop().get(Calendar.MONTH) + " " + date.getDateDevelop().get(Calendar.DAY_OF_MONTH));
    }
}
