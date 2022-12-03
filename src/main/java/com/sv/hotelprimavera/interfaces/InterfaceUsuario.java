package com.sv.hotelprimavera.interfaces;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


import com.sv.hotelprimavera.models.Usuario;

public interface InterfaceUsuario extends JpaRepository<Usuario, Integer>{
	@Query(value="select * from usuario where estadousuario=1",nativeQuery = true)
	List<Usuario> findActive();

	@Query(value="select * from usuario where emailUsuario=?1",nativeQuery = true)
	Usuario findCorreo(String correo);
}
