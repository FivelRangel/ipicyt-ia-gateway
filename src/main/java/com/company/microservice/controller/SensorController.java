package com.company.microservice.controller;

import com.company.microservice.model.Sensor;
import com.company.microservice.repository.SensorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.Map;
import com.fasterxml.jackson.databind.ObjectMapper; 
import java.util.Map;                                
import java.util.stream.Collectors;                  
import java.util.ArrayList;



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



@GetMapping("/sensores")
public ResponseEntity<List<Map<String, Object>>> obtenerTodos() {
    Pageable limit = PageRequest.of(0, 50, Sort.by(Sort.Direction.DESC, "id"));
    List<Sensor> sensores = repository.findAll(limit).getContent();

    ObjectMapper mapper = new ObjectMapper();
    List<Map<String, Object>> resultado = new ArrayList<>();

    for (Sensor sensor : sensores) {
        try {
            Map<String, Object> map = mapper.readValue(sensor.getContenidoJson(), Map.class);
            resultado.add(map);
        } catch (Exception e) {
            e.printStackTrace(); // o manejarlo mejor
        }
    }

    return ResponseEntity.ok(resultado);
}



    // Nuevo método para traer absolutamente todos los sensores
    @GetMapping("/todos")
    public ResponseEntity<List<Sensor>> obtenerTodosSinLimite() {
        List<Sensor> sensores = repository.findAll();
        return ResponseEntity.ok(sensores);
    }
}
