package com.sv.hotelprimavera.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sv.hotelprimavera.interfaces.InterfaceTipoUsuario;
import com.sv.hotelprimavera.models.TipoUsuario;
import com.sv.hotelprimavera.serviceInterface.ITipoUsuarioService;

@Service
public class TipoUsuarioService implements ITipoUsuarioService{

	@Autowired
	private InterfaceTipoUsuario data;
	@Override
	public List<TipoUsuario> listar() {
		// TODO Auto-generated method stub
		return data.findActive();
	}

	@Override
	public TipoUsuario listarId(int id) {
		// TODO Auto-generated method stub
		return data.findById(id).get();
	}

	@Override
	public TipoUsuario save(TipoUsuario tu) {
		// TODO Auto-generated method stub
		return data.save(tu);
	}

	@Override
	public TipoUsuario update(TipoUsuario tu) {
		// TODO Auto-generated method stub
		return data.save(tu);
	}

	@Override
	public TipoUsuario delete(TipoUsuario tu) {
		// TODO Auto-generated method stub
		return data.save(tu);
	}

}
