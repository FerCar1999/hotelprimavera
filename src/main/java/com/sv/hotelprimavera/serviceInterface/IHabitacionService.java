package com.sv.hotelprimavera.serviceInterface;

import java.util.List;


import com.sv.hotelprimavera.models.Habitacion;

public interface IHabitacionService {

	public List<Habitacion> listar();
	public Habitacion listarId(int id);
	public Habitacion save (Habitacion h);
	public Habitacion update (Habitacion h);
}
