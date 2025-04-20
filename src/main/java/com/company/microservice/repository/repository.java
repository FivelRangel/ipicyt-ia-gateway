package com.company.microservice.repository;

import com.company.microservice.model.Medicion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedicionRepository extends JpaRepository<Medicion, Long> {
}
