package com.sv.hotelprimavera.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


import com.sv.hotelprimavera.models.TipoUsuario;

import com.sv.hotelprimavera.serviceInterface.ITipoUsuarioService;

@Controller
@RequestMapping(value="/tipousuario")
public class TipoUsuarioController {
	@Autowired
	private ITipoUsuarioService service;
	
	@GetMapping("/")
	public String listar(Model model) {
		List<TipoUsuario> tipoUsuario = service.listar();
		model.addAttribute("tipousuario", tipoUsuario);
		return "tipousuario/index";
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
	public String crearTipoUsuarioForm(Model modelo) {
		TipoUsuario tu=new TipoUsuario();
		modelo.addAttribute("tipousuario",tu);
		return "tipousuario/insert";
	}
	@PostMapping("/guardar")
	public String guardarTipoUsuario(@ModelAttribute("TipoUsuario") TipoUsuario tu) {
		service.save(tu);
		return "redirect:/tipousuario/";
	}
	@GetMapping("/update/{id}")
	public String actualizarTipoUsuarioForm(@PathVariable int id, Model modelo) {
		modelo.addAttribute("tipousuario",service.listarId(id));
		return "tipousuario/update";
	}
	@PostMapping("/actualizar/{id}")
	public String actualizarTipoUsuario(@PathVariable int id,@ModelAttribute("TipoUsuario")TipoUsuario tu) {
		TipoUsuario tuex=service.listarId(id);
		tuex.setIdTipoUsuario(id);
		tuex.setTipoUsuario(tu.getTipoUsuario());
		tuex.setEstadoTipoUsuario(tuex.getEstadoTipoUsuario());
		service.update(tuex);
		return "redirect:/tipousuario/";
	}
	@GetMapping("/delete/{id}")
	public String borrarTipoUsuario(@PathVariable int id) {
		TipoUsuario tuex=service.listarId(id);
		tuex.setIdTipoUsuario(id);
		tuex.setTipoUsuario(tuex.getTipoUsuario());
		tuex.setEstadoTipoUsuario(0);
		service.update(tuex);
		return "redirect:/tipousuario/";
	}
}
