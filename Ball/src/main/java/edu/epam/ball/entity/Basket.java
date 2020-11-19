package edu.epam.ball.entity;

import java.util.HashMap;
import java.util.Map;

public class Basket {
    private double weight;
    private double maxWeight;
    private Map<Color, Integer> countBall;

    public Basket(double maxWeight){
        this.maxWeight = maxWeight;
        weight=0;
        countBall = new HashMap<Color,Integer>();
    }

    public void addBall(Ball ball){
        if(maxWeight<(weight+ball.getWeight())){
            System.out.println("Корзина переполнена");
        }
        else {
            weight+=ball.getWeight();
            if (countBall.containsKey(ball.getColor())) {
                countBall.put(ball.getColor(), countBall.get(ball.getColor()) + 1);
            } else {
                countBall.put(ball.getColor(), 1);
            }
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

    @Override
    public String toString() {
        return "Basket{" +
                "weight=" + weight +
                ", maxWeight=" + maxWeight +
                ", countBall=" + countBall +
                '}';
    }
}
