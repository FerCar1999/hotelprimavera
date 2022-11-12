package com.sv.hotelprimavera.serviceInterface;

import java.util.List;
import java.util.Optional;

import com.sv.hotelprimavera.models.Habitacion;

public interface IHabitacionService {

	public List<Habitacion> listar();
	public Optional<Habitacion>listarId(int id);
	public int save (Habitacion h);
	public void delete (int id);
}
