package com.example.cuchausoft.repository;

import com.example.cuchausoft.entity.Car;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICar extends CrudRepository<Car, Integer> {
}
