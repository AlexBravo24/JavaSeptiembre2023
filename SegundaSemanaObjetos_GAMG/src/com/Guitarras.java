package com;

public class Guitarras {
	
	private String Modelo;
	private String Marca;
	private String color;
	private int a�o;
	
	public Guitarras() {
	}

	public Guitarras(String modelo, String marca, String color, int a�o) {
		super();
		Modelo = modelo;
		Marca = marca;
		this.color = color;
		this.a�o = a�o;
	}

	public String getModelo() {
		return Modelo;
	}

	public void setModelo(String modelo) {
		Modelo = modelo;
	}

	public String getMarca() {
		return Marca;
	}

	public void setMarca(String marca) {
		Marca = marca;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getA�o() {
		return a�o;
	}

	public void setA�o(int a�o) {
		this.a�o = a�o;
	}

	@Override
	public String toString() {
		return "Guitarra [Modelo=" + Modelo + ", Marca=" + Marca + ", color=" + color + ", a�o=" + a�o + "]";
	}
	
	
	

}
