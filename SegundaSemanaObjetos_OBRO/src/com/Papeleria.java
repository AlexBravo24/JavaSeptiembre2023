package com;

public class Papeleria {
	
	private String tama�o;
	private String color;
	private int precio;
	
	public Papeleria() {}

	public Papeleria(String tama�o, String color, int precio) {
		super();
		this.tama�o = tama�o;
		this.color = color;
		this.precio = precio;
	}

	public String getTama�o() {
		return tama�o;
	}

	public void setTama�o(String tama�o) {
		this.tama�o = tama�o;
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
		return "Papeleria [tama�o=" + tama�o + ", color=" + color + ", precio=$" + precio + "]";
	}
	
	
	

}
