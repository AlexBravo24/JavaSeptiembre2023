package com;

public class Casas extends Basesconstruccion{

	
	private String habitaciones;
	private int estacionamiento;
	private double precio;
	
	
	public Casas() {
		
	}


	public Casas(int pisos, int ventanas, String acabados, String habitaciones, int estacionamiento, double precio) {
		super(pisos, ventanas, acabados);
		this.habitaciones = habitaciones;
		this.estacionamiento = estacionamiento;
		this.precio = precio;
	}


	public String getHabitaciones() {
		return habitaciones;
	}


	public void setHabitaciones(String habitaciones) {
		this.habitaciones = habitaciones;
	}


	public int getEstacionamiento() {
		return estacionamiento;
	}


	public void setEstacionamiento(int estacionamiento) {
		this.estacionamiento = estacionamiento;
	}


	public double getPrecio() {
		return precio;
	}


	public void setPrecio(double precio) {
		this.precio = precio;
	}


	@Override
	public String toString() {
		return "Casas [habitaciones=" + habitaciones + ", estacionamiento=" + estacionamiento + ", precio=" + precio
				+ ", toString()=" + super.toString() + "]";
	}
	
	
	
}
