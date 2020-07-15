package com.sap.cloud.customSpringApps.hrm.code.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloWorld {
	
	@RequestMapping("/helloworld")
	public String helloWorld() {
		return "Hello World with CI Automation !";
	}

}

