package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;

import java.util.List;


@Controller
@RequestMapping("/cars")

public class CarController {

    private final CarService carService;

    @Autowired
    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping
    public String showAllCars(Model model) {
        List<Car> carsList = carService.getAllCars();
        model.addAttribute("cars", carsList);
        return "cars";

    }

    @GetMapping(params = "count")
    public String showCarsByCount(@RequestParam int count, Model model) {
        List<Car> carsList = carService.getCars(count);
        model.addAttribute("cars", carsList);

        return "cars";
    }

}
