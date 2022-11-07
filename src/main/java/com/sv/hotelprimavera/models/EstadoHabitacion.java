/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hotel.reserva.models;

/**
 *
 * @author Luis Bernal
 */
public class EstadoHabitacion {
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
