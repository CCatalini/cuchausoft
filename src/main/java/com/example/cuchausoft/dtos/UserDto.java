package com.example.cuchausoft.dtos;

import com.example.cuchausoft.entity.Role;

import java.util.Collection;
import java.util.UUID;

/**
 *
 */
public class UserDto {

    private Integer id;

    private String name;

    private String password;

    private String mail;


    public UserDto(Integer id, String name, String password, String mail) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.mail = mail;
    }

    public UserDto(String mail) {
        this.mail = mail;
    }

    public UserDto() {
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public String getMail() {
        return mail;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }
}
