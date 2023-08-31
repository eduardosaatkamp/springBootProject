package com.example.demo;

import com.example.demo.entidades.Departamento;

public class Product {

    private Long id;
    private String name;
    private Double  price;
    private Departamento departamento;

    public void Departamento (){}

    public void Departamento(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Product(){}

    public Product(Long id, String name, Double price, Departamento departamento) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.departamento = departamento;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }
}
