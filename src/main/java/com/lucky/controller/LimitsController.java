package com.lucky.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lucky.bean.Limits;
import com.lucky.configuration.LimitConfiguration;

@RestController
public class LimitsController {
	
	@Autowired
	private LimitConfiguration limits;
	
	@GetMapping("/limits")
	public Limits retrieveLimits() {
		return new Limits(limits.getMinimum(),limits.getMaximum());
	}
}
