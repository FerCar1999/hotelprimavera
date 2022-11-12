package com.sv.hotelprimavera.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sv.hotelprimavera.interfaces.InterfaceTipoHabitacion;
import com.sv.hotelprimavera.models.TipoHabitacion;
import com.sv.hotelprimavera.serviceInterface.ITipoHabitacionService;

@Service
public class TipoHabitacionService  implements ITipoHabitacionService{

	@Autowired
	private InterfaceTipoHabitacion data;
	
	@Override
	public List<TipoHabitacion> listar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<TipoHabitacion> listarId(int id) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public int save(TipoHabitacion th) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

}
