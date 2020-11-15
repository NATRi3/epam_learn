package edu.epam.day2.task5.service;

import edu.epam.day2.task5.date.Date;
import edu.epam.day2.task5.developer.Developer;

import java.util.Calendar;

public class Calculat {
    public void CalculateDate(Date date, Developer developer){
        date.getDateDevelop().add(date.getDateDevelop().DAY_OF_YEAR,developer.getDayForDevelopProgram());
    }
}
