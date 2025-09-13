package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;



@Controller
public class CarController {
    public final CarService carService;
 public CarController(CarService carService) {
     this.carService = carService;

 }

    @GetMapping("/cars")
    public String showCars(@RequestParam(value = "count", required = false)  Integer count, ModelMap model) {
     int carCount = (count != null) ? count : 5;
     model.addAttribute("cars", carService.getCars(carCount) );
     return "cars";
    }
}
