package edu.epam.ball.entity;

import edu.epam.ball.App;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Basket {
    private double weight;
    private double maxWeight;
    private Map<Color, Integer> countBall;
    private ArrayList<Ball> balls;

    public Basket(double maxWeight){
        this.maxWeight = maxWeight;
        weight=0;
        countBall = new HashMap<Color,Integer>();
        balls = new ArrayList<Ball>();
    }

    public Basket(Basket basket){
        this.weight=basket.getWeight();
        this.maxWeight=basket.getMaxWeight();
        this.countBall=basket.getCountBall();
        this.balls=basket.getBalls();
    }

    public void addBall(Ball ball){
        if(maxWeight<(weight+ball.getWeight())){
            App.logger.info("Basket is full");
        }
        else {
            weight+=ball.getWeight();
            if (countBall.containsKey(ball.getColor())) {
                countBall.put(ball.getColor(), 1+countBall.get(ball.getColor()));
            } else {
                countBall.put(ball.getColor(), 1);
            }
            balls.add(ball);
        }
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(double maxWeight) {
        this.maxWeight = maxWeight;
    }

    public Map<Color, Integer> getCountBall() {
        return countBall;
    }

    public ArrayList<Ball> getBalls() {
        return balls;
    }

    @Override
    public String toString() {
        return String.valueOf(new StringBuilder().append("Basket{weight=")
                .append(weight).append(", maxWeight=").append(maxWeight).append(", countBall=")
                .append(countBall).append(", balls=").append(balls).append('}'));
    }
}
