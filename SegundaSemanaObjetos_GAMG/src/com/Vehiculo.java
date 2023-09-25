package com;

public class Vehiculo {

	private String tipo;
	private String marca;
	private int año;
	private String modelo;
	private int pasajeros;
	
	public Vehiculo() {
		
	}

	public Vehiculo(String tipo, String marca, int año, String modelo, int pasajeros) {
		super();
		this.tipo = tipo;
		this.marca = marca;
		this.año = año;
		this.modelo = modelo;
		this.pasajeros = pasajeros;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getAño() {
		return año;
	}

	public void setAño(int año) {
		this.año = año;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getPasajeros() {
		return pasajeros;
	}

	public void setPasajeros(int pasajeros) {
		this.pasajeros = pasajeros;
	}

	@Override
	public String toString() {
		return "Vehiculo [tipo=" + tipo + ", marca=" + marca + ", año=" + año + ", modelo=" + modelo + ", pasajeros="
				+ pasajeros + "]";
	}
	
	
}
