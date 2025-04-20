package com.company.microservice.controller;

import com.company.microservice.model.Medicion;
import com.company.microservice.repository.MedicionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/mediciones")
public class Controller {

    @Autowired
    private MedicionRepository medicionRepository;

    @PostMapping
    public ResponseEntity<Medicion> guardar(@RequestBody Medicion medicion) {
        return ResponseEntity.ok(medicionRepository.save(medicion));
    }

    @GetMapping
    public ResponseEntity<List<Medicion>> listar() {
        return ResponseEntity.ok(medicionRepository.findAll());
    }
}
