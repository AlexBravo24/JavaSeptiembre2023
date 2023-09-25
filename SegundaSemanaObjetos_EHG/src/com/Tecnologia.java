package com;

public class Tecnologia {
	
	
	private String equipo;
	private String modelo;
	private double precio;
	
	
	public Tecnologia () {
		
	}
	
	
	
	public Tecnologia(String equipo, String modelo, double precio) {
		super();
		this.equipo = equipo;
		this.modelo = modelo;
		this.precio = precio;
	}



	public String getEquipo() {
		return equipo;
	}



	public void setEquipo(String equipo) {
		this.equipo = equipo;
	}



	public String getModelo() {
		return modelo;
	}



	public void setModelo(String modelo) {
		this.modelo = modelo;
	}



	public double getPrecio() {
		return precio;
	}



	public void setPrecio(double precio) {
		this.precio = precio;
	}



	@Override
	public String toString() {
		return "Tecnologia [equipo=" + equipo + ", modelo=" + modelo + ", precio=" + precio + "]";
	}
	
	
	
	
	
	
	
	

}
