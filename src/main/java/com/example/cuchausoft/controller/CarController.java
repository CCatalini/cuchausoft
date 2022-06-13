package com.example.cuchausoft.controller;

import com.example.cuchausoft.entity.Car;
import com.example.cuchausoft.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping
public class CarController {

    @Autowired
    private CarService carService;

    @GetMapping("/listar")
    public String listar(Model model ){

        List<Car> cars = carService.listar();
        model.addAttribute("cars", cars);
        // retorna el nombre del archivo HTML
        return "index";
    }

    @GetMapping("/new")
    public String add(Model model){
        model.addAttribute("car", new Car());

        return "form";
    }

    public String save(Car car, Model model){
        carService.save(car);
        return "redirect:/ listar";
    }


}