package com.sv.hotelprimavera.interfaces;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.sv.hotelprimavera.models.TipoUsuario;

public interface InterfaceTipoUsuario extends JpaRepository<TipoUsuario,Integer>{
	@Query(value="select * from tipousuario where estadotipousuario=1",nativeQuery = true)
	List<TipoUsuario> findActive();
}
