package edu.epam.day3.task.service;

import edu.epam.day3.task.product.Car;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CarService {
    public List<Car> searchCarModel(List<Car> cars, String model){
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

    public List<Car> searchCarModelYear(List<Car> cars, String model, int year){
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

    public List<Car> searchCarYearPrice(List<Car> cars, int year, int price){
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
