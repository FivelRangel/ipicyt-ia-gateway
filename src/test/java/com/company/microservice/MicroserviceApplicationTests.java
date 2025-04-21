package com.company.microservice;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest
@ActiveProfiles("test") // ✅ Usa `application-test.yml` con H2 en memoria
class MicroserviceApplicationTests {

	@Test
	void contextLoads() {
	}
}
