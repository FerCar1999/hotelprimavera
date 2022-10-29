package com.sv.hotelprimavera.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="/room-statuses")
public class RoomStatusController {

	@GetMapping("/index")
	public String index() {
		return "room_status/index";
	}
	
	@GetMapping("/insert")
	public String insert() {
		return "room_status/insert";
	}
}
