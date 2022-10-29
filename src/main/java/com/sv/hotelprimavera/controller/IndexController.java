package com.sv.hotelprimavera.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

	@GetMapping("/")
	public String index() {
		return "room/index";
	}
	
	@GetMapping("/room-list")
	public String room_list() {
		return "room/list";
	}
	
	@GetMapping("/room-detail")
	public String detail() {
		return "room/detail";
	}
	
	@GetMapping("/register")
	public String register() {
		return "register";
	}
}
