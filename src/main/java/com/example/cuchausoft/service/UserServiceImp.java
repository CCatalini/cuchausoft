package com.example.cuchausoft.service;


import com.example.cuchausoft.dtos.UserDto;
import com.example.cuchausoft.entity.Role;
import com.example.cuchausoft.entity.User;
import com.example.cuchausoft.interfaceService.IUserService;
import com.example.cuchausoft.repository.IUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

// ej: user repetidos
// ej: contra de x caracteres

/**
 * llama a varios repositorios de manera simultánea
 *
 * su tarea principal es la de agregador

 * para la logic
 * expondría las operaciones definidas en el repositorio
 * gestiona las operaciones de negocio mas importantes
 *
 * implementaciones de cada una de las operaciones crud
 */
@Service
public class UserServiceImp implements IUserService {

    @Autowired
    private IUser userRepo;



    @Override
    public UserDto createUser(UserDto user) {
        User newUser = new User(user.getId(), user.getName(), user.getPassword(), user.getMail(), Arrays.asList(new Role("name")));

        //guarda usuario en la base de datos
        userRepo.save(newUser);

        return user;
    }

    @Override
    public UserDto update(UserDto user) {
        User newUser = new User(user.getId(), user.getName(), user.getPassword(), user.getMail(), Arrays.asList((new Role("name"))));

        userRepo.save(newUser);

        return user;
    }

    @Override
    public User findById(Integer id) {
        Optional<User> user = userRepo.findById(id);
        return user.orElse(null);
    }

    @Override
    public List<User> findAll() {
        return userRepo.findAll();
    }

    @Override
    public void delete(Integer id) {
        userRepo.deleteById(id);
    }
}
