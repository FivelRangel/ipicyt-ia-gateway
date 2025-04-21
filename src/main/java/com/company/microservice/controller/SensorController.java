package com.company.microservice.controller;

import com.company.microservice.model.Sensor;
import com.company.microservice.repository.SensorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/sensores")
public class SensorController {

    @Autowired
    private SensorRepository repository;

    @PostMapping
    public ResponseEntity<String> recibirJson(@RequestBody String rawJson) {
        Sensor sensor = new Sensor(rawJson);
        repository.save(sensor);
        return ResponseEntity.ok("✅ JSON recibido y guardado en la tabla 'sensores'");
    }
}
