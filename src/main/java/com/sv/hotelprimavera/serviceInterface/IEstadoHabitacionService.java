package com.sv.hotelprimavera.serviceInterface;

import java.util.List;
import java.util.Optional;

import com.sv.hotelprimavera.models.EstadoHabitacion;


public interface IEstadoHabitacionService {

	public List<EstadoHabitacion> listar();
	public Optional<EstadoHabitacion>listarId(int id);
	public int save (EstadoHabitacion eh);
	public void delete (int id);
}
