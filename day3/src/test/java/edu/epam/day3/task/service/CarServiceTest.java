package edu.epam.day3.task.service;

import com.sun.source.tree.AssertTree;
import edu.epam.day3.task.product.Car;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.*;

import java.util.ArrayList;
import java.util.Iterator;

public class CarServiceTest {
@DataProvider(name = "createCarsArray")
public Object[] createCarsArray() {
    ArrayList<Car> cars =new ArrayList<Car>();
    cars.add(new Car("Skoda", "Octavia", 2008, "black", 20000, "2801AB-7"));
    cars.add(new Car("Skoda", "Octavia", 2000, "black", 15000, "9932AB-7"));
    cars.add(new Car("Skoda", "Rapid", 2015, "black", 28000, "4598AT-1"));
    cars.add(new Car("Skoda", "Rapid", 2010, "black", 22000, "2255TB-5"));
    cars.add(new Car("Skoda", "Rapid", 1999, "black", 12000, "5533AO-2"));
    cars.add(new Car("WV", "Polo", 2020, "black", 30000, "2213CK-3"));
    cars.add(new Car("WV", "Polo", 2018, "black", 28000, "3321AM-3"));
    return cars.toArray();
}

    @Test(dataProvider = "createCarsArray")
    public void testSearchCarModel(Object[] cars){
        ArrayList<Car> arrayCars = new ArrayList<Car>();
        for (int i = 0;i< cars.length;i++){
            arrayCars.add((Car) cars[i]);
        }
        ArrayList<Car> result = (ArrayList<Car>) new CarService().SearchCarModel(arrayCars, "Skoda");
        Iterator<Car> iterator = result.iterator();
        if(iterator.next().getId()==0&&iterator.next().getId()==2
                &&iterator.next().getId()==3&&iterator.next().getId()==4&&iterator.next().getId()==1){

        }

    }

    @Test
    public void testSearchCarModelYear() {

    }

    @Test
    public void testSearchCarYearPrice() {

    }
}