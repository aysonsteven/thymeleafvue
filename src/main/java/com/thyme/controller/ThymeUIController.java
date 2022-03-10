package com.thyme.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ThymeUIController {

	@GetMapping("/thyme")
	public String getIndx() {
		return "testui";
	}
}
