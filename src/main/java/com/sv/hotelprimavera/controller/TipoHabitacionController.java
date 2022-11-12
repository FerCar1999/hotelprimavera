package com.sv.hotelprimavera.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sv.hotelprimavera.models.TipoHabitacion;
import com.sv.hotelprimavera.serviceInterface.ITipoHabitacionService;

@Controller
@RequestMapping
public class TipoHabitacionController {
	
	@Autowired
	private ITipoHabitacionService service;
	
	@GetMapping("/listar")
	public String listar(Model model) {
		List<TipoHabitacion> tipoHabitacion = service.listar();
		model.addAttribute("tipohabitacion", tipoHabitacion);
		return "index";
		
	}
}
