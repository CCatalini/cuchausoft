package com.example.cuchausoft.exception;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class ModelNotFoundException extends Exception{

    public ModelNotFoundException(String message){
        super(message);
    }
}
