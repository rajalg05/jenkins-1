package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Jenkins1ApplicationTests {
	public static Logger logger = LoggerFactory.getLogger("Jenkins1ApplicationTests");
	
	@Test
	void contextLoads() {
		logger.info("1 Pipeline Test");
		assertEquals(true, true);
	}

}
