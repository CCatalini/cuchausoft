package com.example.cuchausoft.controller;

import com.example.cuchausoft.entity.Car;
import com.example.cuchausoft.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping
public class CarController {

    @Autowired
    private CarService carService;

    @GetMapping("/listar")
    public String listar(Model model ){

        List<Car> carList = carService.listar();
        model.addAttribute("cars", carList);
        // retorna el nombre del archivo HTML
        return "index";
    }

    @GetMapping("/new")
    public String add(Model model){
        model.addAttribute("car", new Car());
        return "form";
    }

    @PostMapping("/save")
    public String save(Car car, Model model){
        carService.save(car);
        return "redirect:/listar";
    }

    @PostMapping("/update/{id}")
    public String update(@PathVariable int id, Model model){
        Optional<Car> car = carService.listarID(id);
        model.addAttribute("car", car);
        return "form";
    }

    public String delete(@PathVariable int id, Model model){
        carService.delete(id);
        return "redirect:/listar";
    }

}
