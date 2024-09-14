package web.controller;
import model.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.Service.CarServiceImpl;


import java.util.ArrayList;
import java.util.List;

@Controller
public class CarsController {

    private CarServiceImpl carService;

    @Autowired
    public CarsController(CarServiceImpl carService) {
        this.carService = carService;
    }


    @GetMapping(value = "/cars")
    public String showCars(@RequestParam (value = "count", defaultValue = "5") int count, ModelMap model) {
        List<Car> carList = carService.carsGet(carService.getCars(), count);
        model.addAttribute("carList", carList);
        return "cars";
    }
}
