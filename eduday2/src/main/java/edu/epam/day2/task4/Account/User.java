package edu.epam.day2.task4.Account;

public class User {
    private String password;


    public User(String password) {
        this.password = password;
    }


    public boolean isPasswordRight(String password) {
        return this.password.equals(password);
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
