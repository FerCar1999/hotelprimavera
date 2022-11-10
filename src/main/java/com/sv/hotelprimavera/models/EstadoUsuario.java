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
@Table(name="estadousuario")
public class EstadoUsuario {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
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
