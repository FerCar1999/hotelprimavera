package com.sv.hotelprimavera.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="/user-types")
public class UserTypeController {

	@GetMapping("/index")
	public String index() {
		return "user_type/index";
	}
	
	@GetMapping("/insert")
	public String insert() {
		return "user_type/insert";
	}
}
