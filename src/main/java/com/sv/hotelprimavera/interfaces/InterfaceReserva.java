package com.sv.hotelprimavera.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sv.hotelprimavera.models.Reserva;

public interface InterfaceReserva extends JpaRepository <Reserva, Integer> {

}
