package com.sv.hotelprimavera.serviceInterface;

import java.util.List;

import com.sv.hotelprimavera.models.DetalleUsuario;

public interface IDetalleUsuarioService {
	public List<DetalleUsuario> listar();
	public DetalleUsuario listarId(int id);
	public DetalleUsuario save (DetalleUsuario du);
}
