package edu.epam.task6.Service;

import edu.epam.task6.Date.Data;

public class DataServices {

    public static String SecInTime(Data date){
        int hour = date.getSecond()/3600;
        int minute = (date.getSecond()%3600)/60;
        int resSec = (date.getSecond()%60);
        return hour+" часов "+minute+" минут "+resSec+" секунд ";
    }
}
