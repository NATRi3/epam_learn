package edu.epam.day3.task.product;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Car {
    private static int count = 0;
    private int id;
    private String model;
    private String brand;
    private int year;
    private String color;
    private int price;
    private String number;


    public Car(String model, String brand, int year, String color, int price, String number) {
        this.id = count++;
        this.setModel(model);
        this.setBrand(brand);
        this.setYear(year);
        this.setColor(color);
        this.setPrice(price);
        this.setNumber(number);
    }

    public Car() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            try {
                this.id = count++;
                System.out.println("Model:");
                this.model = reader.readLine();
                System.out.println("Brand:");
                this.brand = reader.readLine();
                System.out.println("Year:");
                this.year = Integer.parseInt(reader.readLine());
                System.out.println("Color:");
                this.color = reader.readLine();
                System.out.println("Price:");
                this.price = Integer.parseInt(reader.readLine());
                System.out.println("Number:");
                this.number = reader.readLine();
                System.out.println("Car added!");
                break;
            } catch (IOException e) {
                System.out.println("Something wrong. Try again.");
            }
        }
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder().append("Car{id=").append(id).append(", model=")
                .append(model).append(", brand=").append(brand).append(", year=").append(year).append(", color=")
                .append(color).append(", price=").append(price).append(", number=").append(number).append("}");
        return String.valueOf(stringBuilder);
    }
}
