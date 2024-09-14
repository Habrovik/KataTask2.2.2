package web.Service;

import model.Car;

import model.Car;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarServiceImpl implements CarService{

    public CarServiceImpl(){}

    private List <Car> cars;

    {
        cars = new ArrayList<>();

        cars.add(new Car("Jiguli", "Black", 1999));
        cars.add(new Car("Kopeyka", "Gray", 1981));
        cars.add(new Car("Granta", "Silver", 2007));
        cars.add(new Car("Mersedes", "Blue", 2011));
        cars.add(new Car("BMW", "Red", 2019));

    }

    public List<Car> getCars() {
        return cars;
    }

    @Override
    public List<Car> carsGet(List<Car> cars, int number) {
        List<Car> ourCars = cars.subList(0, Math.min(number, cars.size()));
        return ourCars;
    }
}
