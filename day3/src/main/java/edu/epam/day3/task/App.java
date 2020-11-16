package edu.epam.day3.task;

import edu.epam.day3.task.product.Car;
import edu.epam.day3.task.service.CarService;

import java.util.ArrayList;
import java.util.Iterator;

public class App {
    public static void main(String[] args) {
        ArrayList<Car> cars = new ArrayList<Car>();
        cars.add(new Car("Skoda", "Octavia", 2008, "black", 20000, "2801AB-7"));
        cars.add(new Car("Skoda", "Octavia", 2000, "black", 15000, "9932AB-7"));
        cars.add(new Car("Skoda", "Rapid", 2015, "black", 28000, "4598AT-1"));
        cars.add(new Car("Skoda", "Rapid", 2010, "black", 22000, "2255TB-5"));
        cars.add(new Car("Skoda", "Rapid", 1999, "black", 12000, "5533AO-2"));
        cars.add(new Car("WV", "Polo", 2020, "black", 30000, "2213CK-3"));
        cars.add(new Car("WV", "Polo", 2018, "black", 28000, "3321AM-3"));

        CarService carService = new CarService();
        ArrayList<Car> result1 = new ArrayList<Car>(carService.SearchCarModel(cars, "Skoda"));
        ArrayList<Car> result2 = new ArrayList<Car>(carService.SearchCarModelYear(cars,"Skoda", 2010));
        ArrayList<Car> result3 = new ArrayList<Car>(carService.SearchCarYearPrice(cars, 2000, 15000));
        Iterator iterator1 = result1.iterator();
        while(iterator1.hasNext()){
            System.out.println(iterator1.next().toString());
        }
        System.out.println("_________");
        Iterator iterator2 = result2.iterator();
        while(iterator2.hasNext()){
            System.out.println(iterator2.next().toString());
        }
        System.out.println("_________");
        Iterator iterator3 = result3.iterator();
        while(iterator3.hasNext()){
            System.out.println(iterator3.next().toString());
        }
    }
}
