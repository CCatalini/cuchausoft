package com.example.cuchausoft.service;

import com.example.cuchausoft.dtos.UserDto;
import com.example.cuchausoft.entity.User;

import java.util.List;


public interface UserServiceInterface {

    UserDto createUser (UserDto user);

    UserDto update (UserDto user);

    User findById(Integer id);

    List<User> findAll();

    void delete (Integer id);

}
