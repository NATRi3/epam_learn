package edu.epam.ball.service;

import edu.epam.ball.exeption.FileWayException;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ReaderTest {

    @Test
    public void testReadBasketFromFile() {
        try {
            new Reader().readBasketFromFile("\\a\\bb\\cc.txt");
            fail();
        } catch (FileWayException e) {
            Assert.assertTrue(true);
        }

    }
}