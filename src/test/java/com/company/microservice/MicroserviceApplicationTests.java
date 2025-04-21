package com.company.microservice;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest
@ActiveProfiles("railway") // 🔥 ESTA LÍNEA ACTIVA TU `application-railway.yml`
class MicroserviceApplicationTests {

	@Test
	void contextLoads() {
	}
}
