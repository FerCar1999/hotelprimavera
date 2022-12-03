package com.sv.hotelprimavera.controller;

import java.util.List;

import com.mysql.cj.Session;
import com.sv.hotelprimavera.models.SessionHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sv.hotelprimavera.models.Reserva;
import com.sv.hotelprimavera.serviceInterface.IReservaService;

@Controller
@RequestMapping
public class ReservaController {

	@Autowired
	private IReservaService service;
	
	@GetMapping("/reservacrud")
	public String listar(Model model) {
		if (SessionHandler.tipo==1||SessionHandler.tipo==2){
			List<Reserva>reservas=service.listar();
			model.addAttribute("reserva", reservas);
			System.out.println(SessionHandler.id);
			return "reservacrud/index";
		}else{
			return "redirect:/cliente/index";
		}

	}
	@GetMapping("reservacrud/delete/{id}")
	public String borrarReserva(@PathVariable int id) {
		service.delete(id);
		return "redirect:/reservacrud";
	}

}
