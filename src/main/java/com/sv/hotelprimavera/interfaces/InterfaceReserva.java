package com.sv.hotelprimavera.interfaces;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.sv.hotelprimavera.models.Reserva;


public interface InterfaceReserva extends JpaRepository <Reserva, Integer> {
	@Query(value="select * from reserva order by fechaFin",nativeQuery = true)
	List<Reserva> findOrdered();

	@Query(value="select * from reserva where idUsuario=?1",nativeQuery = true)
	List<Reserva> findByUsuario(int id);
}
