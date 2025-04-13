package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImp implements CarService {

    List<Car> cars = new ArrayList<Car>();

    @Override
    public List<Car> getCars(Integer value) {

        cars.add(new Car("'Hurricane'", "Belaz", "mustasher"));
        cars.add(new Car("'BlackPerl'", "vaz-2109", "Foxy"));
        cars.add(new Car("'RedPerl'", "vaz-2109", "Bonnie"));
        cars.add(new Car("'WhitePerl'", "vaz-2109", "Chica"));
        cars.add(new Car("'Chaika'", "gaz-13", "Freddy"));

        return getCarList(value);

    }

    private List<Car> getCarList(Integer value) {
        System.out.println("Машин - " + value);
        if ((value != null) && (value < 5)) {
            return cars.stream().limit(value).collect(Collectors.toList());
        } else {
            return cars.stream().limit(5).collect(Collectors.toList());
        }
    }
}
