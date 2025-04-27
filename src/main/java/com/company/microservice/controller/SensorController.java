package com.company.microservice.controller;

import com.company.microservice.model.Sensor;
import com.company.microservice.repository.SensorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SensorController {

    @Autowired
    private SensorRepository repository;

    @PostMapping("/sensores")
    public ResponseEntity<String> recibirJson(@RequestBody String rawJson) {
        Sensor sensor = new Sensor(rawJson);
        repository.save(sensor);
        return ResponseEntity.ok("✅ JSON recibido y guardado en la tabla 'sensores'");
    }

    // Mantener el nombre original: obtenerTodos() pero ahora limitando a los últimos 50
    @GetMapping("/sensores")
    public ResponseEntity<List<Sensor>> obtenerTodos() {
        Pageable limit = PageRequest.of(0, 50, Sort.by(Sort.Direction.DESC, "id"));
        List<Sensor> sensores = repository.findAll(limit).getContent();
        return ResponseEntity.ok(sensores);
    }

    // Nuevo método para traer absolutamente todos los sensores
    @GetMapping("/todos")
    public ResponseEntity<List<Sensor>> obtenerTodosSinLimite() {
        List<Sensor> sensores = repository.findAll();
        return ResponseEntity.ok(sensores);
    }
}
