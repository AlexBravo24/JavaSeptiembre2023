package com;

public class Vehiculos {

	private String nombre; 
	private int asientos;
	private String motor;
	private String color;
	
	
	
	public Vehiculos() {
		
	}



	public Vehiculos(String nombre, int asientos, String motor, String color) {
		super();
		this.nombre = nombre;
		this.asientos = asientos;
		this.motor = motor;
		this.color = color;
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public int getAsientos() {
		return asientos;
	}



	public void setAsientos(int asientos) {
		this.asientos = asientos;
	}



	public String getMotor() {
		return motor;
	}



	public void setMotor(String motor) {
		this.motor = motor;
	}



	public String getColor() {
		return color;
	}



	public void setColor(String color) {
		this.color = color;
	}



	@Override
	public String toString() {
		return "Vehiculos [nombre=" + nombre + ", asientos=" + asientos + ", motor=" + motor + ", color=" + color + "]";
	}
	
	
	
	
}
