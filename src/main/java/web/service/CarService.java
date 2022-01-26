package web.service;

import org.springframework.stereotype.Component;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarService {
    List<Car> cars;
    {
        cars = new ArrayList<>();

        cars.add(new Car("Hyundai Solaris", 1, 400000));
        cars.add(new Car("BMW", 3, 900000));
        cars.add(new Car("Audi", 80, 200000));
        cars.add(new Car("Mersedes", 220, 600000));
        cars.add(new Car("Lada Priora", 2, 350000));
    }

    public List<Car> getCars() {
        return cars;
    }

    public List<Car> getSomeCars(int id) {
        if (id >= cars.size()) {
            return cars;
        }

        List<Car> result = new ArrayList<>();
        for (int i = 0; i < id; i++) {
            result.add(cars.get(i));
        }

        return result;
    }
}
