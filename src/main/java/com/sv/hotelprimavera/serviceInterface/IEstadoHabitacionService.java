package com.sv.hotelprimavera.serviceInterface;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sv.hotelprimavera.models.EstadoHabitacion;


@Service
public interface IEstadoHabitacionService {

	public List<EstadoHabitacion> listar();
	public EstadoHabitacion listarId(int id);
	public EstadoHabitacion save (EstadoHabitacion eh);
	public EstadoHabitacion update (EstadoHabitacion eh);
	public void delete (int id);
}
