package edu.epam.day2.task5.developer;

import java.io.IOException;

public class Developer {
    private final int dayForDevelopProgram;
    private final String name;


    public Developer(int dayForDevelopProgram, String name) throws IOException {
        if (dayForDevelopProgram>0) {
            this.dayForDevelopProgram = dayForDevelopProgram;
        }
        else{
            throw new IOException();
        }
        this.name = name;
    }

    public int getDayForDevelopProgram() {
        return dayForDevelopProgram;
    }

    public String getName() {
        return name;
    }
}
