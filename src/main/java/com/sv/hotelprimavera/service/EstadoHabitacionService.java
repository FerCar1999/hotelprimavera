package com.sv.hotelprimavera.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sv.hotelprimavera.interfaces.InterfaceEstadoHabitacion;
import com.sv.hotelprimavera.models.EstadoHabitacion;
import com.sv.hotelprimavera.serviceInterface.IEstadoHabitacionService;
@Service
public class EstadoHabitacionService implements IEstadoHabitacionService{

	@Autowired
	private InterfaceEstadoHabitacion data;
	@Override
	public List<EstadoHabitacion> listar() {
		// TODO Auto-generated method stub
		return data.findAll();
	}

	@Override
	public EstadoHabitacion listarId(int id) {
		// TODO Auto-generated method stub
		return data.findById(id).get();
	}

	@Override
	public EstadoHabitacion save(EstadoHabitacion eh) {
		// TODO Auto-generated method stub
		return data.save(eh);
	}

	@Override
	public EstadoHabitacion update(EstadoHabitacion eh) {
		// TODO Auto-generated method stub
		return data.save(eh);
	}

	@Override
	public void delete(int id) {
		data.deleteById(id);
		
	}

}
