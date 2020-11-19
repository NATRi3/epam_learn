package edu.epam.day3.task.service;

import edu.epam.day3.task.product.Car;
import edu.epam.day3.task.product.CarGarage;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.*;
import org.testng.Assert;

public class CarServiceTest {
@DataProvider(name = "createCarsArray")
public Object[] createCarsArray() {
    CarGarage carGarage = new CarGarage();
    carGarage.addCar(new Car("Skoda", "Octavia", 2008, "black", 20000, "2801AB-7"));
    carGarage.addCar(new Car("Skoda", "Octavia", 2000, "black", 15000, "9932AB-7"));
    carGarage.addCar(new Car("Skoda", "Rapid", 2015, "black", 28000, "4598AT-1"));
    carGarage.addCar(new Car("Skoda", "Rapid", 2010, "black", 22000, "2255TB-5"));
    carGarage.addCar(new Car("Skoda", "Rapid", 1999, "black", 12000, "5533AO-2"));
    carGarage.addCar(new Car("WV", "Polo", 2020, "black", 30000, "2213CK-3"));
    carGarage.addCar(new Car("WV", "Polo", 2018, "black", 28000, "3321AM-3"));
    return new Object[]{carGarage};
}

    @Test(dataProvider = "createCarsArray")
    public void testSearchCarModel(Object[] carsGarage){
        CarGarage garage = (CarGarage)carsGarage[0];
        CarService carService = new CarService();
        CarGarage result1;
        result1 = new CarGarage(carService.searchCarModel(garage.getCars(), "Skoda"));
        garage.removeCar(6);
        garage.removeCar(5);
        Assert.assertEquals(result1,garage);
    }

    @Test(dataProvider = "createCarsArray")
    public void testSearchCarModelYear(Object[] carsGarage) {
        CarGarage garage = (CarGarage)carsGarage[0];
        CarService carService = new CarService();
        CarGarage result1;
        result1 = new CarGarage(carService.searchCarModelYear(garage.getCars(),"Skoda", 2010));
        garage.removeCar(0);
        garage.removeCar(1);
        garage.removeCar(4);
        garage.removeCar(5);
        garage.removeCar(6);
        Assert.assertEquals(result1,garage);
    }

    @Test(dataProvider = "createCarsArray")
    public void testSearchCarYearPrice(Object[] carsGarage) {
        CarGarage garage = (CarGarage)carsGarage[0];
        CarService carService = new CarService();
        CarGarage result1;
        result1 = new CarGarage(carService.searchCarYearPrice(garage.getCars(), 2000, 15000));
        garage.removeCar(0);
        garage.removeCar(2);
        garage.removeCar(3);
        garage.removeCar(4);
        garage.removeCar(5);
        garage.removeCar(6);
        Assert.assertEquals(result1,garage);
    }
}