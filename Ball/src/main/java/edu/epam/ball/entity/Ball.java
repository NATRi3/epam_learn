package edu.epam.ball.entity;

import edu.epam.ball.exeption.WeightBallException;

public class Ball {
    private double weight;
    private Color color;

    public Ball(double weight, Color color) throws WeightBallException {
        if (weight <= 0) {
            throw new WeightBallException("Weight can't be less or equals than zero");
        } else {
            this.weight = weight;
            this.color = color;
        }
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        if (weight<=0){
            System.out.println("Вес не может быть меньше нуля");
        }
        this.weight = 1;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return String.valueOf(new StringBuilder().append("Ball{weight=").append(weight)
        .append(", color=").append(color).append('}'));
    }
}
