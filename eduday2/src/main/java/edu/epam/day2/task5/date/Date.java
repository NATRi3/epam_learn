package edu.epam.day2.task5.date;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Date {
    private Calendar dateDevelop;

    public Date(Calendar dateDevelop) {
        this.dateDevelop = dateDevelop;
    }

    public Calendar getDateDevelop() {
        return dateDevelop;
    }

    public void setDateDevelop(Calendar dateDevelop) {
        this.dateDevelop = dateDevelop;
    }
}
