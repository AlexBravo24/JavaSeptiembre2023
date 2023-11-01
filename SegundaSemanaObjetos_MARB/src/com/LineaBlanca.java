package com;

public class LineaBlanca {
	
	private String marca;
	private int capacidad;
	private String color;
	private String recursoConsumible;
	
	public LineaBlanca () {}

	public LineaBlanca(String marca, int capacidad, String color, String recursoConsumible) {
		super();
		this.marca = marca;
		this.capacidad = capacidad;
		this.color = color;
		this.recursoConsumible = recursoConsumible;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getRecursoConsumible() {
		return recursoConsumible;
	}

	public void setRecursoConsumible(String recursoConsumible) {
		this.recursoConsumible = recursoConsumible;
	}

	@Override
	public String toString() {
		return "LineaBlanca [marca=" + marca + ", capacidad=" + capacidad + ", color=" + color + ", recursoConsumible="
				+ recursoConsumible + "]";
	}
	
	
	

}
