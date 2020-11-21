package edu.epam.ball.service;

import edu.epam.ball.App;
import edu.epam.ball.entity.Ball;
import edu.epam.ball.entity.Basket;
import edu.epam.ball.entity.Color;
import edu.epam.ball.exeption.FileWayException;
import edu.epam.ball.exeption.WeightBallException;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class Reader {

    public Basket readBasketFromFile(String way) throws FileWayException {
        Basket basket = null;
        try{
            BufferedReader reader = new BufferedReader(new FileReader(way));
            String read;
            Color color;
            int endWeight;
            double weight;
            basket = new Basket(Double.parseDouble(reader.readLine()));
            while((read = reader.readLine())!=null){
                endWeight= read.indexOf(' ');
                if(endWeight == -1){
                    System.out.println("Неудалось считать элемент");
                }
                else {
                    weight = Double.parseDouble(read.substring(0,endWeight));
                    color = Color.valueOf(read.substring(endWeight+1,read.length()));
                    try {
                        basket.addBall(new Ball(weight, color));
                    }
                    catch (WeightBallException e){
                        App.logger.info(e.getMessage());
                    }
                }
            }
        }
        catch (FileNotFoundException e){
            throw new FileWayException("Wrong file way");
        }
        catch (IOException e){
            App.logger.error(e.getMessage());
        }
        return basket;
    }
}
