package edu.epam.day3.task.service;

import edu.epam.day3.task.product.Car;

import java.util.ArrayList;
import java.util.Iterator;

public class CarService {
    public ArrayList<Car> SearchCarModel(ArrayList<Car> cars, String model){
        ArrayList<Car> result = new ArrayList<Car>();
        Iterator<Car> iterator = cars.iterator();
        while(iterator.hasNext()){
            Car car = iterator.next();
            if(car.getModel().equals(model)){
                result.add(car);
            }
        }
        return result;
    }

    public ArrayList<Car> SearchCarModelYear(ArrayList<Car> cars, String model, int year){
        ArrayList<Car> result = new ArrayList<Car>();
        Iterator<Car> iterator = cars.iterator();
        while(iterator.hasNext()){
            Car car = iterator.next();
            if(car.getModel().equals(model)&&car.getYear()>=year){
                result.add(car);
            }
        }
        return result;
    }

    public ArrayList<Car> SearchCarYearPrice(ArrayList<Car> cars, int year, int price){
        ArrayList<Car> result = new ArrayList<Car>();
        Iterator<Car> iterator = cars.iterator();
        while(iterator.hasNext()){
            Car car = iterator.next();
            if(car.getYear()==year&& car.getPrice()>=price){
                result.add(car);
            }
        }
        return result;
    }
}
