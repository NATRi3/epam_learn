package edu.epam.ball;

import edu.epam.ball.entity.Ball;
import edu.epam.ball.entity.Basket;
import edu.epam.ball.entity.Color;
import edu.epam.ball.service.Reader;


public class App {
    public static void main( String[] args ){
        Basket basket = new Reader().readBasketFromFile("src\\main\\java\\edu\\epam\\ball\\data\\data.txt");
        basket.addBall(new Ball(10, Color.black));
        System.out.println(basket);
    }
}
