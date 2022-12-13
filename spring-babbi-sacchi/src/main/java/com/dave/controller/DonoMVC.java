package com.dave.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("doni")
public class DonoMVC {

	@GetMapping
	public String getPaginaDoni() {
		return "doni-th";
	}
	
}
