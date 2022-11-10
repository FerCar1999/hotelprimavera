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
@Table(name="estadohabitacion")
public class EstadoHabitacion {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    private int idEstadoHabitacion;
    private String estadoHabitacion;

    public EstadoHabitacion() {
    }

    public EstadoHabitacion(int idEstadoHabitacion, String estadoHabitacion) {
        this.idEstadoHabitacion = idEstadoHabitacion;
        this.estadoHabitacion = estadoHabitacion;
    }

    public int getIdEstadoHabitacion() {
        return idEstadoHabitacion;
    }

    public void setIdEstadoHabitacion(int idEstadoHabitacion) {
        this.idEstadoHabitacion = idEstadoHabitacion;
    }

    public String getEstadoHabitacion() {
        return estadoHabitacion;
    }

    public void setEstadoHabitacion(String estadoHabitacion) {
        this.estadoHabitacion = estadoHabitacion;
    }
    
}
