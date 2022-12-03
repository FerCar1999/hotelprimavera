package com.sv.hotelprimavera.models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="reserva")
public class Reserva {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idReserva;
	@ManyToOne
    @JoinColumn(name = "idUsuario")
	private Usuario idUsuario;
	@ManyToOne
    @JoinColumn(name = "idHabitacion")
	private Habitacion idHabitacion;
	private double totalPago;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date fechaInicio;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date fechaFin;
	
	public Reserva() {
		super();
	}
	public Reserva(int idReserva, Usuario idUsuario, Habitacion idHabitacion, double totalPago,
			Date fechaInicio, Date fechaFin) {
		super();
		this.idReserva = idReserva;
		this.idUsuario = idUsuario;
		this.idHabitacion = idHabitacion;
		this.totalPago = totalPago;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
	}
	public int getIdReserva() {
		return idReserva;
	}
	public void setIdReserva(int idReserva) {
		this.idReserva = idReserva;
	}
	public Usuario getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(Usuario idUsuario) {
		this.idUsuario = idUsuario;
	}
	public Habitacion getIdHabitacion() {
		return idHabitacion;
	}
	public void setIdHabitacion(Habitacion idHabitacion) {
		this.idHabitacion = idHabitacion;
	}
	public double getTotalPago() {
		return totalPago;
	}
	public void setTotalPago(double totalPago) {
		this.totalPago = totalPago;
	}
	public Date getFechaInicio() {
		return fechaInicio;
	}
	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}
	public Date getFechaFin() {
		return fechaFin;
	}
	public void setFechaFin(Date fechaFin) {
		this.fechaFin = fechaFin;
	}
	
	
	
}
