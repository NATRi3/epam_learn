package edu.epam.ball.service;

import edu.epam.ball.entity.Ball;
import edu.epam.ball.entity.Basket;
import edu.epam.ball.entity.Color;

import java.io.BufferedReader;
import java.io.FileReader;


public class Reader {

    public Basket readBasketFromFile(String way){
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
                    basket.addBall(new Ball(weight,color));
                }
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return basket;
    }
}
