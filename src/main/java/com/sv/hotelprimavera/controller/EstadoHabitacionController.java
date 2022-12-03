package com.sv.hotelprimavera.controller;

import java.util.List;

import com.sv.hotelprimavera.models.Habitacion;
import com.sv.hotelprimavera.models.SessionHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sv.hotelprimavera.models.EstadoHabitacion;
import com.sv.hotelprimavera.serviceInterface.IEstadoHabitacionService;


@Controller
@RequestMapping
public class EstadoHabitacionController {

	@Autowired
	private IEstadoHabitacionService service;
	
	@GetMapping("/estadohabitacion")
	public String listar(Model model) {

		if (SessionHandler.tipo==1||SessionHandler.tipo==2){
			List<EstadoHabitacion> estadoHabitacion = service.listar();
			model.addAttribute("estadohabitacion", estadoHabitacion);
			return "estadohabitacion/index";
		}else{
			return "redirect:/cliente/index";
		}
	}
	@GetMapping("estadohabitacion/insert")
	public String crearTipoHabitacionForm(Model modelo) {
		EstadoHabitacion eh=new EstadoHabitacion();
		modelo.addAttribute("estadohabitacion",eh);
		return "estadohabitacion/insert";
	}
	@PostMapping("estadohabitacion/guardar")
	public String guardarTipoHabitacion(@ModelAttribute("EstadoHabitacion") EstadoHabitacion eh) {
		service.save(eh);
		return "redirect:/estadohabitacion";
	}
	@GetMapping("estadohabitacion/update/{id}")
	public String actualizarTipoHabitacionForm(@PathVariable int id, Model modelo) {
		modelo.addAttribute("estadohabitacion",service.listarId(id));
		return "estadohabitacion/update";
	}
	@PostMapping("estadohabitacion/actualizar/{id}")
	public String actualizarTipoHabitacion(@PathVariable int id,@ModelAttribute("EstadoHabitacion")EstadoHabitacion eh) {
		EstadoHabitacion ehex=service.listarId(id);
		ehex.setIdEstadoHabitacion(id);
		ehex.setEstadoHabitacion(eh.getEstadoHabitacion());
		service.update(ehex);
		return "redirect:/estadohabitacion";
	}
	@GetMapping("estadohabitacion/delete/{id}")
	public String borrarTipoHabitacion(@PathVariable int id) {
		service.delete(id);
		return "redirect:/estadohabitacion";
	}
}
