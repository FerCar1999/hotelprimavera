/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hotel.reserva.models;

/**
 *
 * @author Luis Bernal
 */
public class Habitacion {
    private int idHabitacion;
    private String nombreHabitacion;
    private int pisoHabitacion;
    private int capacidadHabitacion;
    private String descripcionHabitacion;
    private TipoHabitacion idTipoHabitacion;
    private EstadoHabitacion idEstadoHabitacion;

    public Habitacion() {
    }

    public Habitacion(int idHabitacion, String nombreHabitacion, int pisoHabitacion, int capacidadHabitacion, String descripcionHabitacion, TipoHabitacion idTipoHabitacion, EstadoHabitacion idEstadoHabitacion) {
        this.idHabitacion = idHabitacion;
        this.nombreHabitacion = nombreHabitacion;
        this.pisoHabitacion = pisoHabitacion;
        this.capacidadHabitacion = capacidadHabitacion;
        this.descripcionHabitacion = descripcionHabitacion;
        this.idTipoHabitacion = idTipoHabitacion;
        this.idEstadoHabitacion = idEstadoHabitacion;
    }

    public int getIdHabitacion() {
        return idHabitacion;
    }

    public void setIdHabitacion(int idHabitacion) {
        this.idHabitacion = idHabitacion;
    }

    public String getNombreHabitacion() {
        return nombreHabitacion;
    }

    public void setNombreHabitacion(String nombreHabitacion) {
        this.nombreHabitacion = nombreHabitacion;
    }

    public int getPisoHabitacion() {
        return pisoHabitacion;
    }

    public void setPisoHabitacion(int pisoHabitacion) {
        this.pisoHabitacion = pisoHabitacion;
    }

    public int getCapacidadHabitacion() {
        return capacidadHabitacion;
    }

    public void setCapacidadHabitacion(int capacidadHabitacion) {
        this.capacidadHabitacion = capacidadHabitacion;
    }

    public String getDescripcionHabitacion() {
        return descripcionHabitacion;
    }

    public void setDescripcionHabitacion(String descripcionHabitacion) {
        this.descripcionHabitacion = descripcionHabitacion;
    }

    public TipoHabitacion getIdTipoHabitacion() {
        return idTipoHabitacion;
    }

    public void setIdTipoHabitacion(TipoHabitacion idTipoHabitacion) {
        this.idTipoHabitacion = idTipoHabitacion;
    }

    public EstadoHabitacion getIdEstadoHabitacion() {
        return idEstadoHabitacion;
    }

    public void setIdEstadoHabitacion(EstadoHabitacion idEstadoHabitacion) {
        this.idEstadoHabitacion = idEstadoHabitacion;
    }
    
    
}
