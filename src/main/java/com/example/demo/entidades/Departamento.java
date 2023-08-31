package com.example.demo.entidades;

public class Departamento {
    // os atributos precisam ficar privados, sendo acessados só pelos getters and setters
    private Long id;
    private String name;

    public void Departamento (){} //

    public Departamento(Long id, String name) {
        this.id = id;
        this.name = name;
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
}
