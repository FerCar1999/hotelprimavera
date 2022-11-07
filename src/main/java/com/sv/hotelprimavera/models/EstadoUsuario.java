/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hotel.reserva.models;

/**
 *
 * @author Luis Bernal
 */
public class EstadoUsuario {
    private int idEstadoUsuario;
    private String estadoUsuario;

    public EstadoUsuario(int idEstadoUsuario, String estadoUsuario) {
        this.idEstadoUsuario = idEstadoUsuario;
        this.estadoUsuario = estadoUsuario;
    }

    public EstadoUsuario() {
    }

    public int getIdEstadoUsuario() {
        return idEstadoUsuario;
    }

    public void setIdEstadoUsuario(int idEstadoUsuario) {
        this.idEstadoUsuario = idEstadoUsuario;
    }

    public String getEstadoUsuario() {
        return estadoUsuario;
    }

    public void setEstadoUsuario(String estadoUsuario) {
        this.estadoUsuario = estadoUsuario;
    }
    
    
}
