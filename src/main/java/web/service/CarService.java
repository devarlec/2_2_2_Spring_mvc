package web.service;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public interface CarService {
    static List<Car> createFiveCars(int value) {
        List<Car> cars = new ArrayList<Car>();
        cars.add(new Car("'Hurricane'","Belaz","mustasher"));
        cars.add(new Car("'BlackPerl'","vaz-2109","Foxy"));
        cars.add(new Car("'RedPerl'","vaz-2109","Bonnie"));
        cars.add(new Car("'WhitePerl'","vaz-2109","Chica"));
        cars.add(new Car("'Chaika'","gaz-13","Freddy"));

        List<Car> carsOut = new ArrayList<Car>();
        for (int i = 0; i < value; i++) {
           carsOut.add(cars.get(i));
        }

        return carsOut;
    }
}
