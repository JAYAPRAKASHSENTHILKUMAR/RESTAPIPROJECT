package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {
	Logger logger =LoggerFactory.getLogger(Controller.class);
	@GetMapping("/test")
	public String hello()
	{
		logger.trace("A TRACE Message");
		logger.debug("A TRACE Message");
		logger.info("A TRACE Message");
		logger.warn("A TRACE Message");
		logger.error("A TRACE Message");
		return "Hello Scaler!";
		
	}
}
