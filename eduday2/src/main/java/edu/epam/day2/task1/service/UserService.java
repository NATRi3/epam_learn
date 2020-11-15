package edu.epam.day2.task1.service;

import edu.epam.day2.task1.user.User;

public class UserService {
    public void SayHelloUser(User user){
        StringBuilder helloUser = new StringBuilder().append("Hello ").append(user.getUserName());
        System.out.println(helloUser.toString());
    }
}