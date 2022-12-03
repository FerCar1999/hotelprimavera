package com.sv.hotelprimavera.controller;

import com.mysql.cj.Session;
import com.sv.hotelprimavera.models.DetalleUsuario;
import com.sv.hotelprimavera.models.SessionHandler;
import com.sv.hotelprimavera.models.TipoUsuario;
import com.sv.hotelprimavera.models.Usuario;
import com.sv.hotelprimavera.serviceInterface.IDetalleUsuarioService;
import com.sv.hotelprimavera.serviceInterface.ITipoUsuarioService;
import com.sv.hotelprimavera.serviceInterface.IUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
@RequestMapping
public class LoginController {

	@Autowired
	private IUsuarioService service;

	@Autowired
	private ITipoUsuarioService servicetu;

	@Autowired
	private IDetalleUsuarioService servicedu;
	@GetMapping("/login")
	public String index(Model modelo) {
		if(SessionHandler.correo==null){
			modelo.addAttribute("usuario",new Usuario());
			return "login";
		}else{
			if(SessionHandler.tipo==1){
				System.out.println("paso 1");
				return "redirect:/reservacrud/";
			} else if (SessionHandler.tipo==2) {
				System.out.println("paso 2");
				return "redirect:/reservacrud/";
			}else{
				System.out.println("paso 3");
				return "redirect:/cliente/index";
			}
		}
	}
	@GetMapping("cliente/logout")
	public String logout(Model modelo) {
		SessionHandler.id=0;
		SessionHandler.pw=null;
		SessionHandler.correo=null;
		SessionHandler.tipo=0;
		modelo.addAttribute("usuario",new Usuario());
		return "login";
	}
	@GetMapping("/register")
	public String registrar(Model modelo) {
		if(SessionHandler.id==0){
			List<TipoUsuario> tu=servicetu.listar();
			List<DetalleUsuario> du=servicedu.listar();
			modelo.addAttribute("usuario",new Usuario());
			modelo.addAttribute("tipousuario",tu);
			modelo.addAttribute("detalleusuario",du);
			return "register";
		}else{
			if(SessionHandler.tipo==1){
				System.out.println("paso 1");
				return "redirect:/reservacrud/";
			} else if (SessionHandler.tipo==2) {
				System.out.println("paso 2");
				return "redirect:/reservacrud/";
			}else{
				System.out.println("paso 3");
				return "redirect:/cliente/index";
			}
		}
	}
	@PostMapping("login/registrar")
	public String guardarNuevoUsuario(Usuario usuario) {
		//encriptando
		String hash=service.getMd5(usuario.getContraUsuario());
		usuario.setContraUsuario(hash);
		java.util.Date date = new java.util.Date();
		usuario.setFechaRegistro(date);
		usuario.setIdEstadoUsuario(1);
		usuario.setIdTipoUsuario(servicetu.listarId(3));
		//guardando
		servicedu.save(usuario.getIdDetalleUsuario());
		service.save(usuario);
		return "redirect:/login";
	}


	@PostMapping("/login/inicio")
	public String logPost(@ModelAttribute("Usuario")Usuario usuario, RedirectAttributes redirAtt,Model modelo) throws Exception {
		Usuario u=service.listarPorEmail(usuario.getEmailUsuario());
		if(u==null){
			modelo.addAttribute("usuario",new Usuario());
			redirAtt.addFlashAttribute("errorcorreo","Usuario no encontrado");
			System.out.println("error 1");
			return "login";
		}else{

			usuario.setContraUsuario(service.getMd5(usuario.getContraUsuario()));
			System.out.println(usuario.getEmailUsuario());
			System.out.println(u.getEmailUsuario());
			System.out.println(usuario.getContraUsuario());
			System.out.println(u.getContraUsuario());
			System.out.println(u.getIdTipoUsuario().getIdTipoUsuario());
			if (u.getEmailUsuario().equals(usuario.getEmailUsuario())&&u.getContraUsuario().equals(usuario.getContraUsuario())){
				SessionHandler.id=u.getIdUsuario();
				SessionHandler.pw=u.getContraUsuario();
				SessionHandler.correo=u.getEmailUsuario();
				SessionHandler.tipo=u.getIdTipoUsuario().getIdTipoUsuario();

				if(SessionHandler.tipo==1){
					System.out.println("paso 1");
					return "redirect:/reservacrud/";
				} else if (SessionHandler.tipo==2) {
					System.out.println("paso 2");
					return "redirect:/reservacrud/";
				}else{
					System.out.println("paso 3");
					return "redirect:/cliente/index";
				}

			}else{
				System.out.println("error 2");
				modelo.addAttribute("usuario",new Usuario());
				redirAtt.addFlashAttribute("errorcorreo","Datos incorrectos");
				return "login";
			}

		}

	}
}
