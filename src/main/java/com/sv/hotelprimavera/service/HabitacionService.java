package com.sv.hotelprimavera.service;

import java.util.List;


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
		return data.findActive();
	}

	@Override
	public List<Habitacion> listarlimpias() {
		return data.findActiveUser();
	}

	@Override
	public Habitacion listarId(int id) {
		// TODO Auto-generated method stub
		return data.findById(id).get();
	}

	@Override
	public Habitacion save(Habitacion h) {
		// TODO Auto-generated method stub
		return data.save(h);
	}



	@Override
	public Habitacion update(Habitacion h) {
		// TODO Auto-generated method stub
		return data.save(h);
	}
	
	
	

}
