package com.sv.hotelprimavera.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sv.hotelprimavera.interfaces.InterfaceDetalleUsuario;
import com.sv.hotelprimavera.models.DetalleUsuario;
import com.sv.hotelprimavera.serviceInterface.IDetalleUsuarioService;
@Service
public class DetalleUsuarioService implements IDetalleUsuarioService{
	@Autowired
	private InterfaceDetalleUsuario data;
	@Override
	public List<DetalleUsuario> listar() {
		// TODO Auto-generated method stub
		return data.findAll();
	}

	@Override
	public DetalleUsuario listarId(int id) {
		// TODO Auto-generated method stub
		return data.findById(id).get();
	}

	@Override
	public DetalleUsuario save(DetalleUsuario du) {
		return data.save(du);
	}



}
