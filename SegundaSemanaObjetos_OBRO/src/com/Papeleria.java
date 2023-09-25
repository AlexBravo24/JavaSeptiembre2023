package com;

public class Papeleria {
	
	private String tamaño;
	private String color;
	private int precio;
	
	public Papeleria() {}

	public Papeleria(String tamaño, String color, int precio) {
		super();
		this.tamaño = tamaño;
		this.color = color;
		this.precio = precio;
	}

	public String getTamaño() {
		return tamaño;
	}

	public void setTamaño(String tamaño) {
		this.tamaño = tamaño;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Papeleria [tamaño=" + tamaño + ", color=" + color + ", precio=$" + precio + "]";
	}
	
	
	

}
