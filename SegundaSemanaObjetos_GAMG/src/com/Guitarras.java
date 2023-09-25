package com;

public class Guitarras {
	
	private String Modelo;
	private String Marca;
	private String color;
	private int año;
	
	public Guitarras() {
	}

	public Guitarras(String modelo, String marca, String color, int año) {
		super();
		Modelo = modelo;
		Marca = marca;
		this.color = color;
		this.año = año;
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

	public int getAño() {
		return año;
	}

	public void setAño(int año) {
		this.año = año;
	}

	@Override
	public String toString() {
		return "Guitarra [Modelo=" + Modelo + ", Marca=" + Marca + ", color=" + color + ", año=" + año + "]";
	}
	
	
	

}
