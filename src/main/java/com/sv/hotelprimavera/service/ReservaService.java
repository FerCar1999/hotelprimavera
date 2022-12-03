package com.sv.hotelprimavera.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sv.hotelprimavera.interfaces.InterfaceReserva;
import com.sv.hotelprimavera.models.Reserva;
import com.sv.hotelprimavera.serviceInterface.IReservaService;
@Service
public class ReservaService implements IReservaService {

	@Autowired
	private InterfaceReserva data;
	
	@Override
	public List<Reserva> listar() {
		// TODO Auto-generated method stub
		return data.findOrdered();
	}

	//usado como metodo para cancelar
	@Override
	public void delete(int id) {
		data.deleteById(id);
	}

	@Override
	public List<Reserva> listarPorUsuario(int id) {
		return data.findByUsuario(id);
	}

	@Override
	public Reserva save(Reserva r) {
		return data.save(r);
	}

}
