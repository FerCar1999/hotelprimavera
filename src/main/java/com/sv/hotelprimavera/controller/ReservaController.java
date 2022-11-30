package com.sv.hotelprimavera.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sv.hotelprimavera.models.Reserva;
import com.sv.hotelprimavera.serviceInterface.IReservaService;

@Controller
@RequestMapping
public class ReservaController {

//	@Autowired
//	private IReservaService service;
//	
//	@GetMapping("/listarReserva")
//	public String listar(Model model) {
//		List<Reserva>reservas=service.listar();
//		model.addAttribute("reservas", reservas);
//		return "index";
//	}

}
