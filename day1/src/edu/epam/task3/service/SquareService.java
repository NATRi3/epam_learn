package edu.epam.task3.service;

public class SquareService {

    public static double SquareSqr(double a){
        return a*a;
    }

    public static double SquareSqrDiagonal(double diagonal){
        return (diagonal*diagonal)/2;
    }

    public static double SquareA(double sqr){
        return Math.sqrt(sqr);
    }
}
