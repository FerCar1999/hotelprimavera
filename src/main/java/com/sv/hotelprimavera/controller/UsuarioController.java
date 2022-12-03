package com.sv.hotelprimavera.controller;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sv.hotelprimavera.models.DetalleUsuario;
import com.sv.hotelprimavera.models.TipoUsuario;
import com.sv.hotelprimavera.models.Usuario;
import com.sv.hotelprimavera.serviceInterface.IDetalleUsuarioService;
import com.sv.hotelprimavera.serviceInterface.ITipoUsuarioService;
import com.sv.hotelprimavera.serviceInterface.IUsuarioService;

@Controller
@RequestMapping
public class UsuarioController {
	@Autowired
	private IUsuarioService service;
	
	@Autowired
	private ITipoUsuarioService servicetu;
	
	@Autowired
	private IDetalleUsuarioService servicedu;
	@GetMapping("/usuariocrud")
	public String listar(Model model) {
		List<Usuario> usuario = service.listar();
		model.addAttribute("usuario", usuario);
		return "usuariocrud/index";

	}
	@GetMapping("usuariocrud/insert")
	public String formularioNuevoUsuario(Model modelo) {
		List<TipoUsuario> tu=servicetu.listar();
		List<DetalleUsuario> du=servicedu.listar();
		modelo.addAttribute("usuario",new Usuario());
		modelo.addAttribute("tipousuario",tu);
		modelo.addAttribute("detalleusuario",du);
		return "usuariocrud/insert";
	}
	@PostMapping("usuariocrud/guardar")
	public String guardarNuevoUsuario(Usuario usuario) {
		//encriptando
		String hash=service.getMd5(usuario.getContraUsuario());
		usuario.setContraUsuario(hash);
		java.util.Date date = new java.util.Date();  
		usuario.setFechaRegistro(date);
		usuario.setIdEstadoUsuario(1);
		//guardando
		servicedu.save(usuario.getIdDetalleUsuario());
		service.save(usuario);
		return "redirect:/usuariocrud";
	}


	@GetMapping("usuariocrud/update/{id}")
	public String formularioActualizarUsuario(@PathVariable("id") int id,Model modelo) {
		Usuario u=service.listarId(id);
		List<TipoUsuario> tu=servicetu.listar();
		List<DetalleUsuario> du=servicedu.listar();
		modelo.addAttribute("usuario",u);
		modelo.addAttribute("tipousuario",tu);
		modelo.addAttribute("detalleusuario",du);
		return "usuariocrud/update";
	}
	@PostMapping("usuariocrud/actualizar/{id}")
	public String actualizarUsuario(@PathVariable int id,@ModelAttribute("Usuario")Usuario usuario) {
		Usuario uex=service.listarId(id);
		DetalleUsuario duex=servicedu.listarId(uex.getIdDetalleUsuario().getIdDetalleUsuario());
		uex.setIdUsuario(id);
		uex.setEmailUsuario(usuario.getEmailUsuario());
		uex.setIdTipoUsuario(usuario.getIdTipoUsuario());
		duex.setIdDetalleUsuario(uex.getIdDetalleUsuario().getIdDetalleUsuario());
		duex.setNombresUsuario(usuario.getIdDetalleUsuario().getNombresUsuario());
		duex.setApellidosUsuario(usuario.getIdDetalleUsuario().getApellidosUsuario());
		duex.setDireccionUsuario(usuario.getIdDetalleUsuario().getDireccionUsuario());
		duex.setTelefonoUsuario(usuario.getIdDetalleUsuario().getTelefonoUsuario());
		duex.setFechaNacUsuario(usuario.getIdDetalleUsuario().getFechaNacUsuario());
		servicedu.save(duex);
		service.save(uex);
		return "redirect:/usuariocrud";
	}
	@GetMapping("usuariocrud/delete/{id}")
	public String borrarUsuario(@PathVariable int id) {
		Usuario u=service.listarId(id);
		u.setIdEstadoUsuario(0);
		service.save(u);
		return "redirect:/usuariocrud";
	}
	@GetMapping("usuariocrud/updatepw/{id}")
	public String formularioActualizarUsuarioPassword(@PathVariable("id") int id,Model modelo) {
		Usuario u=service.listarId(id);
		modelo.addAttribute("usuario",u);
		return "usuariocrud/updatepw";
	}
	@PostMapping("usuariocrud/actualizarpw/{id}")
	public String actualizarUsuarioPassword(@PathVariable int id,@ModelAttribute("Usuario")Usuario usuario) {
		Usuario uex=service.listarId(id);
		uex.setIdUsuario(id);
		String hash=service.getMd5(usuario.getContraUsuario());
		uex.setContraUsuario(hash);
		service.save(uex);
		return "redirect:/usuariocrud";
	}


}
