package com;

public class RAM {
	
	//Definir una plantilla para crear
	//objetos RAM, que es una clase personalizada
	//que formará parte de Laptop como un tipo
	//de dato
	
	private String marca;
	private double capacidad;
	private double frecuencia;
	
	public RAM() {}

	public RAM(String marca, double capacidad, double frecuencia) {
		super();
		this.marca = marca;
		this.capacidad = capacidad;
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

	public double getFrecuencia() {
		return frecuencia;
	}

	public void setFrecuencia(double frecuencia) {
		this.frecuencia = frecuencia;
	}

	@Override
	public String toString() {
		return "RAM [marca=" + marca + ", capacidad=" + capacidad + ", frecuencia=" + frecuencia + "]";
	};
	
	
	

}
