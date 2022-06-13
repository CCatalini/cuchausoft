package com.example.cuchausoft.interfaceService;

import com.example.cuchausoft.entity.Car;

import java.util.List;
import java.util.Optional;

public interface ICarService {

    public List<Car> listar();
    public Optional<Car> listarID( int id );
    public int save( Car car );
    public void delete( int id );


}
