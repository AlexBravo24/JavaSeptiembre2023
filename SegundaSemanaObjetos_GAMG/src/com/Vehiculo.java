package com;

public class Vehiculo {

	private String tipo;
	private String marca;
	private int a�o;
	private String modelo;
	private int pasajeros;
	
	public Vehiculo() {
		
	}

	public Vehiculo(String tipo, String marca, int a�o, String modelo, int pasajeros) {
		super();
		this.tipo = tipo;
		this.marca = marca;
		this.a�o = a�o;
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

	public int getA�o() {
		return a�o;
	}

	public void setA�o(int a�o) {
		this.a�o = a�o;
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
		return "Vehiculo [tipo=" + tipo + ", marca=" + marca + ", a�o=" + a�o + ", modelo=" + modelo + ", pasajeros="
				+ pasajeros + "]";
	}
	
	
}
