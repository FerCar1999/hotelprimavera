package com.sv.hotelprimavera.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sv.hotelprimavera.interfaces.InterfaceHabitacion;
import com.sv.hotelprimavera.models.Habitacion;
import com.sv.hotelprimavera.serviceInterface.IHabitacionService;
@Service
public class HabitacionService implements IHabitacionService{
	
	@Autowired
	private InterfaceHabitacion data;

	@Override
	public List<Habitacion> listar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Habitacion> listarId(int id) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public int save(Habitacion h) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}
	
	
	

}
