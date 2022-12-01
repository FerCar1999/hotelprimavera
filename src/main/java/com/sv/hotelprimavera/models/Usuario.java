/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sv.hotelprimavera.models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author Luis Bernal
 */
@Entity
@Table(name="usuario")
public class Usuario {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    private int idUsuario;
    private String emailUsuario;
    private String contraUsuario;
    private Date fechaRegistro;
    @OneToOne
    @JoinColumn(name = "idDetalleUsuario")
    private DetalleUsuario idDetalleUsuario;
    @OneToOne
    @JoinColumn(name = "idTipoUsuario")
    private TipoUsuario idTipoUsuario;
    private int estadoUsuario;

    public Usuario() {
    }

    public Usuario(int idUsuario, String emailUsuario, String contraUsuario, Date fechaRegistro, DetalleUsuario idDetalleUsuario, TipoUsuario idTipoUsuario, int estadoUsuario) {
        this.idUsuario = idUsuario;
        this.emailUsuario = emailUsuario;
        this.contraUsuario = contraUsuario;
        this.fechaRegistro = fechaRegistro;
        this.idDetalleUsuario = idDetalleUsuario;
        this.idTipoUsuario = idTipoUsuario;
        this.estadoUsuario = estadoUsuario;
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

    public int getIdEstadoUsuario() {
        return estadoUsuario;
    }

    public void setIdEstadoUsuario(int idEstadoUsuario) {
        this.estadoUsuario = idEstadoUsuario;
    }
    
}
