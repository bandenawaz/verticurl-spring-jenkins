package com.verticurl.jenkins.springjenkinsproject;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringJenkinsProjectApplicationTests {

	public static Logger logger = LoggerFactory.getLogger(SpringJenkinsProjectApplicationTests.class);
	@Test
	void contextLoads() {

		logger.info("Testcase executing...");
		logger.info("Testcase executing second log statement...");
		
		assertEquals(true, true);
	}

}
