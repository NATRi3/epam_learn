package edu.epam.day3.task.product;

import java.util.ArrayList;
import java.util.List;

public class CarGarage {
    private ArrayList<Car> cars = new ArrayList<Car>();

    public CarGarage(){

    }
    public CarGarage(List<Car> cars){
        this.cars= (ArrayList<Car>) cars;
    }

    public void addCar(Car car) {
        cars.add(car);
    }

    public void removeCar(int id){
        if (!cars.isEmpty()) {
            for(Car car: cars){
                if(car.getId()==id){
                    cars.remove(car);
                    System.out.println("Car removed.");
                    return;
                }
            }
            System.out.println("Car not found.");
        }
        else{
            System.out.println("Garage is empty.");
        }
        ;
    }

    public ArrayList<Car> getCars() {
        return cars;
    }

    public void setCars(ArrayList<Car> cars) {
        this.cars = cars;
    }
}
