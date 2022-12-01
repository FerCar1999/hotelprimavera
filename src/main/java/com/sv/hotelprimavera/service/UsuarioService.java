package com.sv.hotelprimavera.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sv.hotelprimavera.interfaces.InterfaceUsuario;
import com.sv.hotelprimavera.models.Usuario;
import com.sv.hotelprimavera.serviceInterface.IUsuarioService;
@Service
public class UsuarioService implements IUsuarioService{

	@Autowired 
	private InterfaceUsuario data;
	@Override
	public List<Usuario> listar() {
		return data.findActive();
	}

	@Override
	public Usuario listarId(int id) {
		// TODO Auto-generated method stub
		return data.findById(id).get();
	}

	@Override
	public Usuario save(Usuario u) {
		// TODO Auto-generated method stub
		
		return data.save(u);
	}

	@Override
	public Usuario update(Usuario u) {
		// TODO Auto-generated method stub
		return data.save(u);
	}

	@Override
	public Usuario delete(Usuario u) {
		// TODO Auto-generated method stub
		return data.save(u);
	}

}
