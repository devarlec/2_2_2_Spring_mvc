package web.controller;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;

import java.util.ArrayList;
import java.util.List;

@ComponentScan("web")
@Controller
public class CarController {

    private final CarService carService;

    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping(value = "/")
    public String printWelcome(ModelMap model) {
        List<String> messages = new ArrayList<>();
        messages.add("Hello!");
        messages.add("I'm Spring MVC application");
        messages.add("'Test: print five or less cars'");
        model.addAttribute("messages", messages);
        return "index";
    }


    @GetMapping(value = "/cars")
    public String printCars(@RequestParam(required = false) Integer count, ModelMap model) {

        List<Car> allCars = carService.getCars(count);

        model.addAttribute("cars", allCars);
        return "cars";
    }
}