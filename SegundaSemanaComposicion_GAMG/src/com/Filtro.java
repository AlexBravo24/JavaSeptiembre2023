package com;

public class Filtro {
	
	private String modelo;
	private String marca;
	private double capacidad;
	
	public Filtro() { }

	public Filtro(String modelo, String marca, double capacidad) {
		super();
		this.modelo = modelo;
		this.marca = marca;
		this.capacidad = capacidad;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public double getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(double capacidad) {
		this.capacidad = capacidad;
	}

	@Override
	public String toString() {
		return "Filtro [modelo=" + modelo + ", marca=" + marca + ", capacidad=" + capacidad + "]";
	}
	
	
	
	
	
	
	

}
