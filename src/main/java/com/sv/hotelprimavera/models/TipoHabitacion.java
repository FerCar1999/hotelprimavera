/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hotel.reserva.models;

/**
 *
 * @author Luis Bernal
 */
public class TipoHabitacion {
    private int idTipoHabitacion;
    private String TipoHabitacion;

    public TipoHabitacion() {
    }

    
    public TipoHabitacion(int idTipoHabitacion, String TipoHabitacion) {
        this.idTipoHabitacion = idTipoHabitacion;
        this.TipoHabitacion = TipoHabitacion;
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

    public void setTipoHabitacion(String TipoHabitacion) {
        this.TipoHabitacion = TipoHabitacion;
    }
    
    
}
