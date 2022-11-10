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
import javax.persistence.Table;

/**
 *
 * @author Luis Bernal
 */
@Entity
@Table(name="detalleusuario")
public class DetalleUsuario {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    private int idDetalleUsuario;
    private String nombresUsuario;
    private String apellidosUsuario;
    private String direccionUsuario;
    private String telefonoUsuario;
    private Date fechaNacUsuario;

    public DetalleUsuario() {
    }

    public DetalleUsuario(int idDetalleUsuario, String nombresUsuario, String apellidosUsuario, String direccionUsuario, String telefonoUsuario, Date fechaNacUsuario) {
        this.idDetalleUsuario = idDetalleUsuario;
        this.nombresUsuario = nombresUsuario;
        this.apellidosUsuario = apellidosUsuario;
        this.direccionUsuario = direccionUsuario;
        this.telefonoUsuario = telefonoUsuario;
        this.fechaNacUsuario = fechaNacUsuario;
    }

    public int getIdDetalleUsuario() {
        return idDetalleUsuario;
    }

    public void setIdDetalleUsuario(int idDetalleUsuario) {
        this.idDetalleUsuario = idDetalleUsuario;
    }

    public String getNombresUsuario() {
        return nombresUsuario;
    }

    public void setNombresUsuario(String nombresUsuario) {
        this.nombresUsuario = nombresUsuario;
    }

    public String getApellidosUsuario() {
        return apellidosUsuario;
    }

    public void setApellidosUsuario(String apellidosUsuario) {
        this.apellidosUsuario = apellidosUsuario;
    }

    public String getDireccionUsuario() {
        return direccionUsuario;
    }

    public void setDireccionUsuario(String direccionUsuario) {
        this.direccionUsuario = direccionUsuario;
    }

    public String getTelefonoUsuario() {
        return telefonoUsuario;
    }

    public void setTelefonoUsuario(String telefonoUsuario) {
        this.telefonoUsuario = telefonoUsuario;
    }

    public Date getFechaNacUsuario() {
        return fechaNacUsuario;
    }

    public void setFechaNacUsuario(Date fechaNacUsuario) {
        this.fechaNacUsuario = fechaNacUsuario;
    }
    
}
