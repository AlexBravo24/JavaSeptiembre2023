package com;

public class RAM {
 // clase personalizada que forma parte de laptop 
	//esta clase tendra sus propios atributos
	
	private double frecuencia;
	private String marca;
	private double capacidad;
	
	
	public RAM(double frecuencia, String marca, double capacidad) {
		super();
		this.frecuencia = frecuencia;
		this.marca = marca;
		this.capacidad = capacidad;
	}


	public double getFrecuencia() {
		return frecuencia;
	}


	public void setFrecuencia(double frecuencia) {
		this.frecuencia = frecuencia;
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
		return "RAM [frecuencia=" + frecuencia + ", marca=" + marca + ", capacidad=" + capacidad + "]";
	}
	

	
}
