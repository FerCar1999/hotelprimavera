package com.sv.hotelprimavera.interfaces;

import org.springframework.data.repository.CrudRepository;

import com.sv.hotelprimavera.models.Reserva;

public interface InterfaceReserva extends CrudRepository <Reserva, Integer> {

}
