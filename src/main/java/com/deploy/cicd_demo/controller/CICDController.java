package com.deploy.cicd_demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CICDController {
	
	@GetMapping("/")
	public String automate() {
		return "Automated Deployment Using CICD ...";
	}

}
