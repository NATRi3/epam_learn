package edu.epam.ball.entity;

public class Ball {
    private double weight;
    private Color color;

    public Ball(double weight, Color color) {

        this.weight = weight;
        this.color = color;
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
}
