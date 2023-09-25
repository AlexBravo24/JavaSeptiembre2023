package com;

public class Llanta {
	
	private String marca;
	private String dimension;
	private String aplicacion;
	
	public Llanta () {}

	public Llanta(String marca, String dimension, String aplicacion) {
		super();
		this.marca = marca;
		this.dimension = dimension;
		this.aplicacion = aplicacion;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getDimension() {
		return dimension;
	}

	public void setDimension(String dimension) {
		this.dimension = dimension;
	}

	public String getAplicacion() {
		return aplicacion;
	}

	public void setAplicacion(String aplicacion) {
		this.aplicacion = aplicacion;
	}

	@Override
	public String toString() {
		return "Llanta [marca=" + marca + ", dimension=" + dimension + ", aplicacion=" + aplicacion + "]";
	}
	
	

}
