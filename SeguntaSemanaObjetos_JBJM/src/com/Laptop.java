package com;

public class Laptop {
	private String Modelo;
	private int a�o;
	private String color;
	
	
	public Laptop() {
		
	}


	public Laptop(String modelo, int a�o, String color) {
		super();
		Modelo = modelo;
		this.a�o = a�o;
		this.color = color;
	}


	public String getModelo() {
		return Modelo;
	}


	public void setModelo(String modelo) {
		Modelo = modelo;
	}


	public int getA�o() {
		return a�o;
	}


	public void setA�o(int a�o) {
		this.a�o = a�o;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	@Override
	public String toString() {
		return "Laptop [Modelo=" + Modelo + ", a�o=" + a�o + ", color=" + color + "]";
	}
	
	
	

}
