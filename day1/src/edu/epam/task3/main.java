package edu.epam.task3;

import edu.epam.task3.figure.Circle;
import edu.epam.task3.figure.Square;
import edu.epam.task3.service.CircleService;
import edu.epam.task3.service.SquareService;

import java.io.IOException;

public class main {
    public static void main(String[] args) throws IOException {
        Square square = new Square(10);
        Circle circle = new Circle(CircleService.CircleSqr(SquareService.SquareA(square.getSqr())));
        Square square1 = new Square(SquareService.SquareSqrDiagonal(CircleService.CircleRadius(circle.getSQR())));
        Square square11 = new Square(117);
        Circle circle1 = new Circle(CircleService.CircleSqr(SquareService.SquareA(square11.getSqr())));
        Square square12 = new Square(SquareService.SquareSqrDiagonal(CircleService.CircleRadius(circle1.getSQR())));
        Square square21 = new Square(7);
        Circle circle2 = new Circle(CircleService.CircleSqr(SquareService.SquareA(square21.getSqr())));
        Square square22 = new Square(SquareService.SquareSqrDiagonal(CircleService.CircleRadius(circle2.getSQR())));
        System.out.println(square1.getSqr() +" "+ square12.getSqr() +" "+ square22.getSqr());
    }
}
