package edu.epam.day3.task.service;

import edu.epam.day3.task.product.Car;
import edu.epam.day3.task.service.CarService;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;

import static org.testng.Assert.*;

public class CarServiceTest {
    ArrayList<Car> cars;
    int car1, car2, car3, car4, car5;

    @BeforeMethod
    public void setArray(){
        cars = new ArrayList<Car>();
        car1 = (int) (Math.random()*1000);
        car2 = (int) (Math.random()*1000);
        car3 = (int) (Math.random()*1000);
        car4 = (int) (Math.random()*1000);
        car5 = (int) (Math.random()*1000);
        cars.add(new Car(""+car1,""+car1,car1,""+car1,car1,""+car1));
        cars.add(new Car(""+car2,""+car3,car2,""+car2,car2,""+car2));
        cars.add(new Car(""+car3,""+car3,car3,""+car3,car3,""+car3));
        cars.add(new Car(""+car4,""+car4,car4,""+car4,car4,""+car4));
        cars.add(new Car(""+car5,""+car5,car5,""+car5,car5,""+car5));
    }

    @Test
    public void testSearchCarModel(){
        if (new CarService().SearchCarModel(cars,""+car1)!=new CarService().SearchCarModel(cars, ""+car1)){
            fail();
        }
        if (new CarService().SearchCarModel(cars,""+car2)!=new CarService().SearchCarModel(cars, ""+car2)){
            fail();
        }
        if (new CarService().SearchCarModel(cars,""+car3)!=new CarService().SearchCarModel(cars, ""+car3)){
            fail();
        }
        if (new CarService().SearchCarModel(cars,""+car4)!=new CarService().SearchCarModel(cars, ""+car4)){
            fail();
        }
        if (new CarService().SearchCarModel(cars,""+car5)!=new CarService().SearchCarModel(cars, ""+car5)){
            fail();
        }
    }

    @Test
    public void testSearchCarModelYear() {
        if (new CarService().SearchCarModelYear(cars,""+car1, car1)!=new CarService().SearchCarModelYear(cars, ""+car1, car1)){
            fail();
        }
        if (new CarService().SearchCarModelYear(cars,""+car2, car2)!=new CarService().SearchCarModelYear(cars, ""+car2, car2)){
            fail();
        }
        if (new CarService().SearchCarModelYear(cars,""+car3, car3)!=new CarService().SearchCarModelYear(cars, ""+car3, car3)){
            fail();
        }
        if (new CarService().SearchCarModelYear(cars,""+car4, car5)!=new CarService().SearchCarModelYear(cars, ""+car4, car4)){
            fail();
        }
        if (new CarService().SearchCarModelYear(cars,""+car5, car5)!=new CarService().SearchCarModelYear(cars, ""+car5, car5)){
            fail();
        }
    }

    @Test
    public void testSearchCarYearPrice() {
        if (new CarService().SearchCarYearPrice(cars,car1, car1)!=new CarService().SearchCarYearPrice(cars, car1, car1)){
            fail();
        }
        if (new CarService().SearchCarYearPrice(cars,car1, car1)!=new CarService().SearchCarYearPrice(cars, car1, car1)){
            fail();
        }
        if (new CarService().SearchCarYearPrice(cars,car1, car1)!=new CarService().SearchCarYearPrice(cars, car1, car1)){
            fail();
        }
        if (new CarService().SearchCarYearPrice(cars,car1, car1)!=new CarService().SearchCarYearPrice(cars, car1, car1)){
            fail();
        }
        if (new CarService().SearchCarYearPrice(cars,car1, car1)!=new CarService().SearchCarYearPrice(cars, car1, car1)){
            fail();
        }
    }
}