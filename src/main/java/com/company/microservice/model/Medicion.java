package com.company.microservice.model;

import jakarta.persistence.*;

@Entity
public class Medicion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String valor;

    public Medicion() {}

    public Medicion(String valor) {
        this.valor = valor;
    }

    public Long getId() {
        return id;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }
}
