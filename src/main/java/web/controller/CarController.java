package web.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import web.model.Car;
import web.service.CarService;

import java.util.ArrayList;
import java.util.List;

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
    // не нужен, т.к. даже если мы не получаем его - передается null дальше? - @RequestParam(required = false)
    public String printCars(Integer count, ModelMap model) {

        List<Car> allCars = carService.getCars(count);

        model.addAttribute("cars", allCars);
        return "cars";
    }
}