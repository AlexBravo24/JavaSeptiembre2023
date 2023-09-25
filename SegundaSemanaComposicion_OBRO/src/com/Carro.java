package com;

public class Carro {
	
	private String modelo;
	private String color;
	private int año;
	private int precio;
	
	private Traccion traccion;
	private Frenos frenado;
	private Direccion direccion;
	
	public Carro () {}

	public Carro(String modelo, String color, int año, int precio, Traccion traccion, Frenos frenado,
			Direccion direccion) {
		super();
		this.modelo = modelo;
		this.color = color;
		this.año = año;
		this.precio = precio;
		this.traccion = traccion;
		this.frenado = frenado;
		this.direccion = direccion;
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

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public Traccion getTraccion() {
		return traccion;
	}

	public void setTraccion(Traccion traccion) {
		this.traccion = traccion;
	}

	public Frenos getFrenado() {
		return frenado;
	}

	public void setFrenado(Frenos frenado) {
		this.frenado = frenado;
	}

	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}

	@Override
	public String toString() {
		return "Carro \n[modelo=" + modelo + ", color=" + color + ", año=" + año + ", precio= $" + precio + ", "
				+ traccion + ", " + frenado + ", " + direccion + "]";
	}
	
	

}
