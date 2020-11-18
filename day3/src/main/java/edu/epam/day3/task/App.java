package edu.epam.day3.task;

import edu.epam.day3.task.product.Car;
import edu.epam.day3.task.product.CarGarage;
import edu.epam.day3.task.service.CarService;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        CarGarage garage = new CarGarage();
        garage.addCar(new Car("Skoda", "Octavia", 2008, "black", 20000, "2801AB-7"));
        garage.addCar(new Car("Skoda", "Octavia", 2000, "black", 15000, "9932AB-7"));
        garage.addCar(new Car("Skoda", "Rapid", 2015, "black", 28000, "4598AT-1"));
        garage.addCar(new Car("Skoda", "Rapid", 2010, "black", 22000, "2255TB-5"));
        garage.addCar(new Car("Skoda", "Rapid", 1999, "black", 12000, "5533AO-2"));
        garage.addCar(new Car("WV", "Polo", 2020, "black", 30000, "2213CK-3"));
        garage.addCar(new Car("WV", "Polo", 2018, "black", 28000, "3321AM-3"));
        CarService carService = new CarService();
        ArrayList<Car> result1;
        result1 = new ArrayList<Car>(carService.searchCarModel(garage.getCars(), "Skoda"));
        ArrayList<Car> result2;
        result2 = new ArrayList<Car>(carService.searchCarModelYear(garage.getCars(),"Skoda", 2010));
        ArrayList<Car> result3;
        result3 = new ArrayList<Car>(carService.searchCarYearPrice(garage.getCars(), 2000, 15000));

        System.out.println(result1);
        System.out.println("_________");
        System.out.println(result2);
        System.out.println("_________");
        System.out.println(result3);
    }
}
