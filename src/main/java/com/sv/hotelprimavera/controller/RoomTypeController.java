package com.sv.hotelprimavera.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="/room-types")
public class RoomTypeController {

	@GetMapping("/index")
	public String index() {
		return "room_type/index";
	}
	
	@GetMapping("/insert")
	public String insert() {
		return "room_type/insert";
	}
}
