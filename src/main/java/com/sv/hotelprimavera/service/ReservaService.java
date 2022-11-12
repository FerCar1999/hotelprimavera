package com.sv.hotelprimavera.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.sv.hotelprimavera.interfaces.InterfaceReserva;
import com.sv.hotelprimavera.models.Reserva;
import com.sv.hotelprimavera.serviceInterface.IReservaService;

public class ReservaService implements IReservaService {

	@Autowired
	private InterfaceReserva data;
	
	@Override
	public List<Reserva> listar() {
		// TODO Auto-generated method stub
		return (List<Reserva>) data.findAll();
	}

	@Override
	public Optional<Reserva> listarId(int id) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public int save(Reserva r) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

}
