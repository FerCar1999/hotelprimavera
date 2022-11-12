package com.sv.hotelprimavera.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sv.hotelprimavera.models.EstadoHabitacion;
import com.sv.hotelprimavera.serviceInterface.IEstadoHabitacionService;


@Controller
@RequestMapping
public class EstadoHabitacionController {

	@Autowired
	private IEstadoHabitacionService service;
	
	@GetMapping("/listar")
	public String listar(Model model) {
		List<EstadoHabitacion> estadoHabitacion = service.listar();
		model.addAttribute("estadoHabitacion", estadoHabitacion);
		
		return "index";
	}
	
}
