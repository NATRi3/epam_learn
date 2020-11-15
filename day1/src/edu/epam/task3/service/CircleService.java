package edu.epam.task3.service;

public class CircleService {

    public static double CircleSqr(double radius){
        return radius*radius*3.14;
    }

    public static double CircleRadius(double sqr){
        return Math.sqrt(sqr/3.14);
    }
}
