package web.Service;

import model.Car;

import java.util.List;

public interface CarService {

    public List<Car> carsGet(List<Car> cars, int number);
}
