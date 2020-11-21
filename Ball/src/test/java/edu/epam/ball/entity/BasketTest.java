package edu.epam.ball.entity;

import edu.epam.ball.exeption.WeightBallException;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class BasketTest {

    @Test
    public void testExceptionAddBall() {
        try {
            new Ball(-23, Color.black);
            fail();
        } catch (WeightBallException e) {
            Assert.assertTrue(true);
        }
    }


}