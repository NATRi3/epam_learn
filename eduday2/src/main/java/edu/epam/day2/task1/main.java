package edu.epam.day2.task1;

import edu.epam.day2.task1.service.UserService;
import edu.epam.day2.task1.user.User;

public class main {
    public static void main(String[] args) {
        User user = new User();
        UserService userService = new UserService();
        userService.SayHelloUser(user);
    }
}
