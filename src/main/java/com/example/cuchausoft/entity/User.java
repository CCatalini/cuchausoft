package com.example.cuchausoft.entity;

import javax.persistence.*;


@Entity
@Table (name = "user")
public class User {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Integer id;
    // strategy = generation.auto te lo da random
    // UUID es un tipo de dato

    private String name;

    private String password;

    private String mail;

    public User(Integer id, String name, String password, String mail) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.mail = mail;

    }

    public User() {

    }


}
