package com.company.microservice.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/")
    public ResponseEntity<String> get() {
        return ResponseEntity.ok("Hello from Railway + Spring!");
    }

     @PostMapping("/medicion")
    public ResponseEntity<Medicion> registrarMedicion(@RequestBody Medicion medicion) {
        Medicion guardada = medicionRepository.save(medicion);
        return ResponseEntity.ok(guardada);
    }

    @GetMapping("/mediciones")
    public ResponseEntity<List<Medicion>> obtenerTodas() {
        return ResponseEntity.ok(medicionRepository.findAll());
    }
}
