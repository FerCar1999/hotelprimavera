package com.sv.hotelprimavera.serviceInterface;

import java.util.List;
import java.util.Optional;

import com.sv.hotelprimavera.models.Reserva;

public interface IReservaService {
	
	public List<Reserva> listar();
	public Optional<Reserva>listarId(int id);
	public int save (Reserva r);
	public void delete (int id);

}
