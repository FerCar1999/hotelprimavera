/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hotel.reserva.models;

import java.util.Date;

/**
 *
 * @author Luis Bernal
 */
public class Usuario {
    private int idUsuario;
    private String emailUsuario;
    private String contraUsuario;
    private Date fechaRegistro;
    private DetalleUsuario idDetalleUsuario;
    private TipoUsuario idTipoUsuario;
    private EstadoUsuario idEstadoUsuario;

    public Usuario() {
    }

    public Usuario(int idUsuario, String emailUsuario, String contraUsuario, Date fechaRegistro, DetalleUsuario idDetalleUsuario, TipoUsuario idTipoUsuario, EstadoUsuario idEstadoUsuario) {
        this.idUsuario = idUsuario;
        this.emailUsuario = emailUsuario;
        this.contraUsuario = contraUsuario;
        this.fechaRegistro = fechaRegistro;
        this.idDetalleUsuario = idDetalleUsuario;
        this.idTipoUsuario = idTipoUsuario;
        this.idEstadoUsuario = idEstadoUsuario;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getEmailUsuario() {
        return emailUsuario;
    }

    public void setEmailUsuario(String emailUsuario) {
        this.emailUsuario = emailUsuario;
    }

    public String getContraUsuario() {
        return contraUsuario;
    }

    public void setContraUsuario(String contraUsuario) {
        this.contraUsuario = contraUsuario;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public DetalleUsuario getIdDetalleUsuario() {
        return idDetalleUsuario;
    }

    public void setIdDetalleUsuario(DetalleUsuario idDetalleUsuario) {
        this.idDetalleUsuario = idDetalleUsuario;
    }

    public TipoUsuario getIdTipoUsuario() {
        return idTipoUsuario;
    }

    public void setIdTipoUsuario(TipoUsuario idTipoUsuario) {
        this.idTipoUsuario = idTipoUsuario;
    }

    public EstadoUsuario getIdEstadoUsuario() {
        return idEstadoUsuario;
    }

    public void setIdEstadoUsuario(EstadoUsuario idEstadoUsuario) {
        this.idEstadoUsuario = idEstadoUsuario;
    }
    
}
