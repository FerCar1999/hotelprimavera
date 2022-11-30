package com.sv.hotelprimavera.serviceInterface;

import java.util.List;
import java.util.Optional;
import com.sv.hotelprimavera.models.TipoHabitacion;

public interface ITipoHabitacionService {
	public List<TipoHabitacion> listar();
	public TipoHabitacion listarId(int id);
	public TipoHabitacion save (TipoHabitacion th);
	public TipoHabitacion update(TipoHabitacion th);
	public TipoHabitacion delete (TipoHabitacion th);
	//public List<TipoHabitacion> search(String palabra);

}
