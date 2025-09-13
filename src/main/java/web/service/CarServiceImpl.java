package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.Arrays;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {
    private final List<Car> cars = Arrays.asList(
            new Car("Audi", "A6", 2012),
            new Car("Audi", "A7", 2014),
            new Car("BMW", "X6", 2019),
            new Car("Audi", "A6L", 2019),
            new Car("Audi", "A8", 2023));

    public List<Car> getCars(int count) {
        return cars.subList(0, Math.min(count, cars.size()));
    }
    }





