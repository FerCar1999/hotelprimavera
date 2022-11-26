package com.sv.hotelprimavera.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sv.hotelprimavera.interfaces.InterfaceEstadoHabitacion;
import com.sv.hotelprimavera.models.EstadoHabitacion;
import com.sv.hotelprimavera.serviceInterface.IEstadoHabitacionService;

@Service
public class EstadoHabitacionService  implements IEstadoHabitacionService{

	@Autowired
	private InterfaceEstadoHabitacion data;

	@Override
	public List<EstadoHabitacion> listar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<EstadoHabitacion> listarId(int id) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public int save(EstadoHabitacion eh) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

	
}
