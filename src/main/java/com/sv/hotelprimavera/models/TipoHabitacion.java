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
@Table(name="tipohabitacion")
public class TipoHabitacion {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    private int idTipoHabitacion;
    private String TipoHabitacion;
    private int estadoTipoHabitacion=1;

    public TipoHabitacion() {
    }

	public TipoHabitacion(int idTipoHabitacion, String tipoHabitacion, int estadoHabitacion) {
		super();
		this.idTipoHabitacion = idTipoHabitacion;
		TipoHabitacion = tipoHabitacion;
		this.estadoTipoHabitacion = estadoHabitacion;
	}

	public int getIdTipoHabitacion() {
		return idTipoHabitacion;
	}

	public void setIdTipoHabitacion(int idTipoHabitacion) {
		this.idTipoHabitacion = idTipoHabitacion;
	}

	public String getTipoHabitacion() {
		return TipoHabitacion;
	}

	public void setTipoHabitacion(String tipoHabitacion) {
		TipoHabitacion = tipoHabitacion;
	}

	public int getEstadoTipoHabitacion() {
		return estadoTipoHabitacion;
	}

	public void setEstadoTipoHabitacion(int estadoHabitacion) {
		this.estadoTipoHabitacion = estadoHabitacion;
	}

    
   
    
    
}
