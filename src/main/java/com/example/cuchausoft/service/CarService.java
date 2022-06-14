package com.example.cuchausoft.service;

import com.example.cuchausoft.entity.Car;
import com.example.cuchausoft.interfaceService.ICarService;
import com.example.cuchausoft.repository.ICar;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CarService implements ICarService {

    @Autowired
    private ICar data;

    @Override
    public List<Car> listar() {
        return (List<Car>) data.findAll();
    }

    @Override
    public Optional<Car> listarID(int id) {
        return Optional.empty();
    }

    @Override
    public int save(Car car) {
        int pepe=0;
        Car carSaved = data.save(car);
        if(!carSaved.equals(null)) return pepe=1;
        return pepe;
    }

    @Override
    public void delete(int id) {

    }
}
