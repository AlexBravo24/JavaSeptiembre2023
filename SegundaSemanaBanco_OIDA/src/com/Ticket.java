package com;

import java.util.Date;

public class Ticket {

	//Este será un objeto para responder si un operacion se realizó con exito o no
	
	
	//crearemos metodos en nuestro cajero que devuelvan el valor de un ticket
	
	//ejemplo: creamos un metodo public ticket depositar () en la clase cajero
	private int folio;
	private Date fechaHora;
	private int numCuenta;
	private double saldo;
	private String sucursal;
	private int idCajero;
	
	
	public Ticket () {
		
	}


	public Ticket(int folio, Date fechaHora, int numCuenta, double saldo, String sucursal, int idCajero) {
		super();
		this.folio = folio;
		this.fechaHora = fechaHora;
		this.numCuenta = numCuenta;
		this.saldo = saldo;
		this.sucursal = sucursal;
		this.idCajero = idCajero;
	}


	public int getFolio() {
		return folio;
	}


	public void setFolio(int folio) {
		this.folio = folio;
	}


	public Date getFechaHora() {
		return fechaHora;
	}


	public void setFechaHora(Date fechaHora) {
		this.fechaHora = fechaHora;
	}


	public int getNumCuenta() {
		return numCuenta;
	}


	public void setNumCuenta(int numCuenta) {
		this.numCuenta = numCuenta;
	}


	public double getSaldo() {
		return saldo;
	}


	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}


	public String getSucursal() {
		return sucursal;
	}


	public void setSucursal(String sucursal) {
		this.sucursal = sucursal;
	}


	public int getIdCajero() {
		return idCajero;
	}


	public void setIdCajero(int idCajero) {
		this.idCajero = idCajero;
	}


	@Override
	public String toString() {
		return "Ticket [folio=" + folio + ", fechaHora=" + fechaHora + ", numCuenta=" + numCuenta + ", saldo=" + saldo
				+ ", sucursal=" + sucursal + ", idCajero=" + idCajero + "]";
	}
	
	
	
	
}
