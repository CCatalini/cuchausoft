package com.example.cuchausoft.controller;


import com.example.cuchausoft.dtos.UserDto;
import com.example.cuchausoft.service.UserServiceImp;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/registro")
public class RegisterController {

    private UserServiceImp userServiceImp;

    public RegisterController(UserServiceImp userServiceImp) {
        this.userServiceImp = userServiceImp;
    }

    @ModelAttribute("attribute")
    public UserDto newUser(){
        return new UserDto();
    }


}
