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
		return data.findActive();
	}

	@Override
	public TipoHabitacion listarId(int id) {
		
		return data.findById(id).get();
	}

	@Override
	public TipoHabitacion save(TipoHabitacion th) {
		return data.save(th);
	}

	@Override
	public TipoHabitacion delete(TipoHabitacion th) {
		return data.save(th);
		
	}

	@Override
	public TipoHabitacion update(TipoHabitacion th) {
		return data.save(th);
		
	}

//	@Override
//	public List<TipoHabitacion> search(String palabra) {
//		
//		return data.search(palabra);
//	}

}
