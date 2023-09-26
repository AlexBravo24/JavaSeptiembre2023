package com;

public class Laptop {
	private String Modelo;
	private int año;
	private String color;
	
	
	public Laptop() {
		
	}


	public Laptop(String modelo, int año, String color) {
		super();
		Modelo = modelo;
		this.año = año;
		this.color = color;
	}


	public String getModelo() {
		return Modelo;
	}


	public void setModelo(String modelo) {
		Modelo = modelo;
	}


	public int getAño() {
		return año;
	}


	public void setAño(int año) {
		this.año = año;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	@Override
	public String toString() {
		return "Laptop [Modelo=" + Modelo + ", año=" + año + ", color=" + color + "]";
	}
	
	
	

}
