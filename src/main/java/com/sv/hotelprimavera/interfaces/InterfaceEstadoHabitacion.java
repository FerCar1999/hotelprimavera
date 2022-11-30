package com.sv.hotelprimavera.interfaces;



import org.springframework.data.jpa.repository.JpaRepository;

import com.sv.hotelprimavera.models.EstadoHabitacion;

public interface InterfaceEstadoHabitacion extends JpaRepository<EstadoHabitacion, Integer> {
	

}
