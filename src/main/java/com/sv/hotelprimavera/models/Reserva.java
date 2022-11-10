package com.sv.hotelprimavera.models;

import java.sql.Date;
import java.util.LinkedList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="reserva")
public class Reserva {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idReserva;
	@OneToMany
    @JoinColumn(name = "idUsuario")
	private List<Usuario> idUsuario=new LinkedList<>();
	@OneToMany
    @JoinColumn(name = "idHabitacion")
	private List<Habitacion> idHabitacion=new LinkedList<>();
	private double totalPago;
	private Date fechaInicio;
	private Date fechaFin;
	
	public Reserva(int idReserva, List<Usuario> idUsuario, List<Habitacion> idHabitacion, double totalPago,
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
	public List<Usuario> getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(List<Usuario> idUsuario) {
		this.idUsuario = idUsuario;
	}
	public List<Habitacion> getIdHabitacion() {
		return idHabitacion;
	}
	public void setIdHabitacion(List<Habitacion> idHabitacion) {
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
