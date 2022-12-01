package com.sv.hotelprimavera.interfaces;


import com.sv.hotelprimavera.models.Habitacion;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
public interface InterfaceHabitacion extends JpaRepository<Habitacion, Integer>{
	@Query(value="SELECT * FROM habitacion order by idEstadoHabitacion desc",nativeQuery = true)
	List<Habitacion> findActive();
}
