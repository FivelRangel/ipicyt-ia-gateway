package com.company.microservice.model;

import jakarta.persistence.*;

@Entity
public class Sensor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Lob
    @Column(columnDefinition = "TEXT")
    private String contenidoJson;

    public Sensor() {}

    public Sensor(String contenidoJson) {
        this.contenidoJson = contenidoJson;
    }

    public Long getId() {
        return id;
    }

    public String getContenidoJson() {
        return contenidoJson;
    }

    public void setContenidoJson(String contenidoJson) {
        this.contenidoJson = contenidoJson;
    }
}
