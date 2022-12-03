package com.sv.hotelprimavera.serviceInterface;

import java.util.List;


import org.springframework.stereotype.Service;

import com.sv.hotelprimavera.models.Reserva;
@Service
public interface IReservaService {
	
	public List<Reserva> listar();
	public void delete (int id);
	public List<Reserva> listarPorUsuario(int id);
	public Reserva save(Reserva r);

}
