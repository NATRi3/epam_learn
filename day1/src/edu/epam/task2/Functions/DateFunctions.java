package edu.epam.task2.Functions;

import edu.epam.task2.Date.Date;

public class DateFunctions {
    public static int machDays(Date date){
        int days = 0;
        boolean bisYear = false;
        if (date.getYear()%4==0){
            if (date.getYear()%100 == 0){
                if (date.getYear()%400 == 0){
                bisYear = true;
                }

            }
            else {
                bisYear = true;
            }
        }
        if (date.getMonth() == 2) {
            if (bisYear) {
                days = 29;
            } else {
                days = 28;
            }
        }
        else{
                if (date.getMonth() == 1 || date.getMonth() == 3 || date.getMonth() == 4 || date.getMonth() == 5 || date.getMonth() == 7 || date.getMonth() == 8 || date.getMonth() == 10 || date.getMonth() == 12) {
                    days = 31;
                } else {
                    days = 30;
            }
        }
        return days;
    }
}
