/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sv.hotelprimavera.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Luis Bernal
 */
@Entity
@Table(name="tipousuario")
public class TipoUsuario {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    private int idTipoUsuario;
    private String tipoUsuario;
    private int estadoTipoUsuario;

    public TipoUsuario() {
    }

    public TipoUsuario(int idTipoUsuario, String tipoUsuario,int estadoTipoUsuario) {
        this.idTipoUsuario = idTipoUsuario;
        this.tipoUsuario = tipoUsuario;
        this.estadoTipoUsuario = estadoTipoUsuario;
    }

    public int getIdTipoUsuario() {
        return idTipoUsuario;
    }

    public void setIdTipoUsuario(int idTipoUsuario) {
        this.idTipoUsuario = idTipoUsuario;
    }

    public String getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

	public int getEstadoTipoUsuario() {
		return estadoTipoUsuario;
	}

	public void setEstadoTipoUsuario(int estadoTipoUsuario) {
		this.estadoTipoUsuario = estadoTipoUsuario;
	}
    
}
