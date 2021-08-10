package com.example.selfintroapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SelfintroAppController {
	
	@RequestMapping("/list")
	public String list() {
		return "list";
		
	}
	
	
	

}
