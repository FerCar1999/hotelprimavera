package com.sv.hotelprimavera.interfaces;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.sv.hotelprimavera.models.TipoHabitacion;

public interface InterfaceTipoHabitacion extends JpaRepository<TipoHabitacion,Integer>{

	@Query(value="select * from tipohabitacion where estadotipohabitacion=1",nativeQuery = true)
	List<TipoHabitacion> findActive();
	
//	@Query(value="select * from tipohabitacion where estadohabitacion like %?1%",nativeQuery = true)
//	List<TipoHabitacion> search(String palabra);
}
