package com.banco;

import java.util.Date;

public class Ticket {

	// este va ha responder unobjeto para responder
	// si una operacion se ralizo con exito
	// crear un metodo en muestra un cajero qu devuelva
	// el valo ticket
	//ejemplo creamos un metodo public ticket depositar()
	//en la clase cajerp
	private int folio;
	private Date fecha_hora;
	private int num_cuenta;
	private int saldo;
	private String sucursal_string;
	private int id_cajero;

	public Ticket() {
	}

	public Ticket(int folio, Date fecha_hora, int num_cuenta, int saldo, String sucursal_string, int id_cajero) {
		super();
		this.folio = folio;
		this.fecha_hora = fecha_hora;
		this.num_cuenta = num_cuenta;
		this.saldo = saldo;
		this.sucursal_string = sucursal_string;
		this.id_cajero = id_cajero;
	}

	public int getFolio() {
		return folio;
	}

	public void setFolio(int folio) {
		this.folio = folio;
	}

	public Date getFecha_hora() {
		return fecha_hora;
	}

	public void setFecha_hora(Date fecha_hora) {
		this.fecha_hora = fecha_hora;
	}

	public int getNum_cuenta() {
		return num_cuenta;
	}

	public void setNum_cuenta(int num_cuenta) {
		this.num_cuenta = num_cuenta;
	}

	public int getSaldo() {
		return saldo;
	}

	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}

	public String getSucursal_string() {
		return sucursal_string;
	}

	public void setSucursal_string(String sucursal_string) {
		this.sucursal_string = sucursal_string;
	}

	public int getId_cajero() {
		return id_cajero;
	}

	public void setId_cajero(int id_cajero) {
		this.id_cajero = id_cajero;
	}

	@Override
	public String toString() {
		return "Ticket [folio=" + folio + ", fecha_hora=" + fecha_hora + ", num_cuenta=" + num_cuenta + ", saldo="
				+ saldo + ", sucursal_string=" + sucursal_string + ", id_cajero=" + id_cajero + "]";
	}

}
