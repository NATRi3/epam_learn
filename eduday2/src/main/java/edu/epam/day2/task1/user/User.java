package edu.epam.day2.task1.user;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class User {
    private String userName;


    public User() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String userName = null;
        try {
            userName = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
