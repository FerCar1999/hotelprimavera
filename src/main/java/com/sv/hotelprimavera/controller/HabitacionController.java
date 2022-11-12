package com.sv.hotelprimavera.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


import com.sv.hotelprimavera.models.Habitacion;
import com.sv.hotelprimavera.serviceInterface.IHabitacionService;

@Controller
@RequestMapping
public class HabitacionController {

	@Autowired
	private IHabitacionService service;
	
	@GetMapping("/listar")
	public String listar(Model model) {
		List<Habitacion> habitaciones = service.listar();
		model.addAttribute("habitaciones", habitaciones);
		return "index";
	}
}
