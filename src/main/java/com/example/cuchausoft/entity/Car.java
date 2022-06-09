package com.example.cuchausoft.entity;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table (name = "car")
public class Car {

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private UUID id;
    // strategy = generation.auto te lo da random
    // UUID es un tipo de dato

    private String marca;

    private String modelo;

    private String dominio;

    private int año;

    private double km;

    private String color;

    private double precio;


    public Car() {

    }

    public Car(UUID id, String marca, String modelo, String dominio, int año, double km, String color, double precio) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.dominio = dominio;
        this.año = año;
        this.km = km;
        this.color = color;
        this.precio = precio;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getDominio() {
        return dominio;
    }

    public void setDominio(String dominio) {
        this.dominio = dominio;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public double getKm() {
        return km;
    }

    public void setKm(double km) {
        this.km = km;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
