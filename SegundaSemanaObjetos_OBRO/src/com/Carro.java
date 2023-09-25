package com;

public class Carro {
	
	private String modelo;
	private String color;
	private int año;
	
	public Carro() {}

	public Carro(String modelo, String color, int año) {
		super();
		this.modelo = modelo;
		this.color = color;
		this.año = año;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
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
		return "Carro [modelo=" + modelo + ", color=" + color + ", año=" + año + "]";
	}
	
	

	

}
