package com.sv.hotelprimavera.serviceInterface;

import java.util.List;
import java.util.Optional;
import com.sv.hotelprimavera.models.TipoHabitacion;

public interface ITipoHabitacionService {
	public List<TipoHabitacion> listar();
	public Optional<TipoHabitacion>listarId(int id);
	public int save (TipoHabitacion th);
	public void delete (int id);

}
