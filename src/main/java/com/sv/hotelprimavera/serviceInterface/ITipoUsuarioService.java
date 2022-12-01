package com.sv.hotelprimavera.serviceInterface;

import java.util.List;

import com.sv.hotelprimavera.models.TipoUsuario;

public interface ITipoUsuarioService {
	public List<TipoUsuario> listar();
	public TipoUsuario listarId(int id);
	public TipoUsuario save (TipoUsuario tu);
	public TipoUsuario update(TipoUsuario tu);
	public TipoUsuario delete (TipoUsuario tu);
}
