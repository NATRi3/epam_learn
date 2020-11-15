package edu.epam.day2.task4;

import edu.epam.day2.task4.Account.User;

public class App {
    public static void main(String[] args) {
        User user = new User("98327OOk");
        System.out.println(user.isPasswordRight("232314"));
        System.out.println(user.isPasswordRight("98327OOk"));
    }
}
