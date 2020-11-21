package edu.epam.ball;

import edu.epam.ball.entity.Ball;
import edu.epam.ball.entity.Basket;
import edu.epam.ball.entity.Color;
import edu.epam.ball.exeption.FileWayException;
import edu.epam.ball.exeption.WeightBallException;
import edu.epam.ball.service.Reader;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class App {
    public static Logger logger = LogManager.getLogger(App.class);
    public static void main( String[] args ){
        Basket basket = null;
        Basket basket1 = new Basket(200);
        try {
            basket = new Reader().readBasketFromFile("C:\\Users\\User\\Documents\\GitHub\\epam_learn\\Ball\\data\\data.txt");
        } catch (FileWayException e) {
            logger.error(e.getMessage());
        }
        try {
            basket1.addBall(new Ball(10, Color.black));
            basket1.addBall(new Ball(15, Color.black));
            basket1.addBall(new Ball(-23, Color.black));
        } catch (WeightBallException e) {
            logger.error(e.getMessage());
        }
        logger.info(basket);
        logger.info(basket1);
    }
}
