package com.example.cuchausoft.controller;

import com.example.cuchausoft.dtos.UserDto;
import com.example.cuchausoft.entity.User;
import com.example.cuchausoft.exception.ModelNotFoundException;
import com.example.cuchausoft.service.UserServiceImp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Servicio Rest
 *
 * @RestController
 *                  realiza la tarea de controlador
 *                  y la gestion de la comunicación entre el usuario y la aplicacion
 *
 * donde se encuentran los metodos http
 */

@RestController
@RequestMapping("/user")
public class UserController {

    /* Hay que acceder a las operaciones creadas en el service del negocio*/
   @Autowired
    private  UserServiceImp userServiceImp;

    //llamado con endpoints

    @PostMapping("/create")
    public ResponseEntity<UserDto> createUser (@RequestBody UserDto user ){
        return new ResponseEntity<>(userServiceImp.createUser(user), HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<UserDto> update (@RequestBody UserDto user){
        userServiceImp.update(user);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/listUsers")
    public ResponseEntity<List<UserDto>> findAll(){

        return new ResponseEntity<>((MultiValueMap<String, String>) userServiceImp.findAll(), HttpStatus.OK);
    }

    /** @PathVariable id se obtiene en la url del servicio*/
    @GetMapping("/findById/{id}")
    public ResponseEntity<UserDto> findById (@PathVariable("id") Integer id){
        //TODO: manejo de excepcion por si no existe el usuario
        return new ResponseEntity<>((MultiValueMap<String, String>) userServiceImp.findById(id), HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Object> delete(@PathVariable("id") Integer id) throws Exception {

        User user = userServiceImp.findById(id);
        if(user == null){
            throw new ModelNotFoundException("El usuario a eliminar no existe");
        }
        userServiceImp.delete(id);

        return new ResponseEntity<>(HttpStatus.OK);
    }



}


/*
* get para devolver de la bd
* post para postear en la bd
* put para reemplazar por completo una entidad
* patch cambia par
* delete
 */