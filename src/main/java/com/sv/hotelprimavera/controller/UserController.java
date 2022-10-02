package com.sv.hotelprimavera.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="/users")
public class UserController {

	@GetMapping("/index")
	public String index() {
		return "user/index";
	}
	
	@GetMapping("/insert")
	public String insert() {
		return "user/insert";
	}
}
