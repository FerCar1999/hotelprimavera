package com.sv.hotelprimavera.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sv.hotelprimavera.models.TipoHabitacion;
import com.sv.hotelprimavera.serviceInterface.ITipoHabitacionService;

@Controller
@RequestMapping(value="/tipohabitacion")
public class TipoHabitacionController {
	
	@Autowired
	private ITipoHabitacionService service;
	
	@GetMapping("/")
	public String listar(Model model) {
		List<TipoHabitacion> tipoHabitacion = service.listar();
		model.addAttribute("tipohabitacion", tipoHabitacion);
		return "tipohabitacion/index";
	}
	/*
	@GetMapping("/")
	 * public String search(Model model,@Param("palabraclave")String palabra) {
	 * List<TipoHabitacion> tipoHabitacion = service.search(palabra);
	 * model.addAttribute("palabraClave",palabra);
	 * model.addAttribute("tipohabitacion", tipoHabitacion); return
	 * "tipohabitacion/index"; }
	 */
	@GetMapping("/insert")
	public String crearTipoHabitacionForm(Model modelo) {
		TipoHabitacion th=new TipoHabitacion();
		modelo.addAttribute("tipohabitacion",th);
		return "tipohabitacion/insert";
	}
	@PostMapping("/guardar")
	public String guardarTipoHabitacion(@ModelAttribute("TipoHabitacion") TipoHabitacion th) {
		service.save(th);
		return "redirect:/tipohabitacion/";
	}
	@GetMapping("/update/{id}")
	public String actualizarTipoHabitacionForm(@PathVariable int id, Model modelo) {
		modelo.addAttribute("tipohabitacion",service.listarId(id));
		return "tipohabitacion/update";
	}
	@PostMapping("/actualizar/{id}")
	public String actualizarTipoHabitacion(@PathVariable int id,@ModelAttribute("TipoHabitacion")TipoHabitacion th) {
		TipoHabitacion thex=service.listarId(id);
		thex.setIdTipoHabitacion(id);
		thex.setTipoHabitacion(th.getTipoHabitacion());
		thex.setEstadoTipoHabitacion(thex.getEstadoTipoHabitacion());
		service.update(thex);
		return "redirect:/tipohabitacion/";
	}
	@GetMapping("/delete/{id}")
	public String borrarTipoHabitacion(@PathVariable int id) {
		TipoHabitacion thex=service.listarId(id);
		thex.setIdTipoHabitacion(id);
		thex.setTipoHabitacion(thex.getTipoHabitacion());
		thex.setEstadoTipoHabitacion(0);
		service.update(thex);
		return "redirect:/tipohabitacion/";
	}
}
