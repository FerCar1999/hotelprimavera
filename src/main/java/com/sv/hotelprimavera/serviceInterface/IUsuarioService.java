package com.sv.hotelprimavera.serviceInterface;

import java.util.List;

import com.sv.hotelprimavera.models.Usuario;

public interface IUsuarioService {
	public List<Usuario> listar();
	public Usuario listarId(int id);
	public Usuario save (Usuario u);
	public Usuario update(Usuario u);
	public Usuario delete (Usuario u);
	public Usuario listarPorEmail(String correo);
	public  String getMd5(String input);
}
