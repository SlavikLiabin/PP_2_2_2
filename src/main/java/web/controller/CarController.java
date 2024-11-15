package web.controller;

import web.model.Car;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarServiceImp;


import java.util.List;

@Controller
@RequestMapping(value = "/cars")
public class CarController {
    private CarServiceImp carServiceImp;

    public CarController(CarServiceImp carServiceImp) {
        this.carServiceImp = carServiceImp;
    }

    @GetMapping
    public String cars(@RequestParam(value = "count", defaultValue = "5") int count, Model model) {
        List<Car> carList = carServiceImp.getListсount(count);
        model.addAttribute("cars", carList);
        return "cars";
    }

}
