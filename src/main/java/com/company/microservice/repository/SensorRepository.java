
package com.company.microservice.repository;

import com.company.microservice.model.Sensor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SensorRepository extends JpaRepository<Sensor, Long> {
}
