package com.example.cuchausoft.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

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

    @ManyToMany(fetch= FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable(
                name = "roles de usuarios",
                joinColumns = @JoinColumn(
                                            name = "user_id",
                                            referencedColumnName = "id"
                ), inverseJoinColumns = @JoinColumn(
                                                    name = "rol_id", referencedColumnName = "id")
    )
    private Collection<Role> roles;

    public User(Integer id, String name, String password, String mail, Collection<Role> roles) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.mail = mail;
        this.roles = roles;
    }

    public User() {

    }


}
