package com.thyme.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ThymeUIController {

	@GetMapping
	public String getIndx() {
		return "index";
	}
	
	@GetMapping("/about")
	public String getAbout() {
		return "about";
	}
}
