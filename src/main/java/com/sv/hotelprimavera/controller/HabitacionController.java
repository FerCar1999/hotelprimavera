package com.sv.hotelprimavera.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sv.hotelprimavera.models.EstadoHabitacion;
import com.sv.hotelprimavera.models.Habitacion;
import com.sv.hotelprimavera.models.TipoHabitacion;
import com.sv.hotelprimavera.serviceInterface.IEstadoHabitacionService;
import com.sv.hotelprimavera.serviceInterface.IHabitacionService;
import com.sv.hotelprimavera.serviceInterface.ITipoHabitacionService;

@Controller
@RequestMapping
public class HabitacionController {

	@Autowired
	private IHabitacionService service;
	@Autowired 
	private ITipoHabitacionService serviceth;
	@Autowired
	private IEstadoHabitacionService serviceeh;
	@GetMapping("/habitacioncrud")
	public String listar(Model model) {
		List<Habitacion> habitaciones = service.listar();
		model.addAttribute("habitacion", habitaciones);
		return "habitacioncrud/index";
	}
	@GetMapping("habitacioncrud/insert")
	public String formularioNuevaHabitacion(Model modelo) {
		List<TipoHabitacion> th=serviceth.listar();
		List<EstadoHabitacion> eh=serviceeh.listar();
		modelo.addAttribute("habitacion",new Habitacion());
		modelo.addAttribute("tipohabitacion",th);
		modelo.addAttribute("estadohabitacion",eh);
		return "habitacioncrud/insert";
	}
	@PostMapping("habitacioncrud/guardar")
	public String guardarNuevaHabitacion(Habitacion habitacion) {
		service.save(habitacion);
		return "redirect:/habitacioncrud";
	}
	@GetMapping("habitacioncrud/update/{id}")
	public String formularioActualizarHabitacion(@PathVariable("id") int id,Model modelo) {
		Habitacion h=service.listarId(id);
		List<TipoHabitacion> th=serviceth.listar();
		List<EstadoHabitacion> eh=serviceeh.listar();
		modelo.addAttribute("habitacion",h);
		modelo.addAttribute("tipohabitacion",th);
		modelo.addAttribute("estadohabitacion",eh);
		return "habitacioncrud/insert";
	}
	

}
