package com;

import java.util.Date;

public class Ticket {

	
	
	private int folio;
	private Date fechaHora;
	private int NumCuenta;
	private double saldo;
	private String sucursal;
	private int idCajero;
	
	public Ticket(int folio, Date fechaHora, int numCuenta, double saldo, String sucursal, int idCajero) {
		super();
		this.folio = folio;
		this.fechaHora = fechaHora;
		NumCuenta = numCuenta;
		this.saldo = saldo;
		this.sucursal = sucursal;
		this.idCajero = idCajero;
	}
	
	
	
	
}
