package com;

public class Hotel {

	private String ubicacion;
	private int pisos;
	private int areasrecreativas;
	
	
	private Habitaciones habitaciones;
	private Camas camas;
	
	public Hotel(){
		
	}

	public Hotel(String ubicacion, int pisos, int areasrecreativas, Habitaciones habitaciones, Camas camas) {
		super();
		this.ubicacion = ubicacion;
		this.pisos = pisos;
		this.areasrecreativas = areasrecreativas;
		this.habitaciones = habitaciones;
		this.camas = camas;
	}

	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	public int getPisos() {
		return pisos;
	}

	public void setPisos(int pisos) {
		this.pisos = pisos;
	}

	public int getAreasrecreativas() {
		return areasrecreativas;
	}

	public void setAreasrecreativas(int areasrecreativas) {
		this.areasrecreativas = areasrecreativas;
	}

	public Habitaciones getHabitaciones() {
		return habitaciones;
	}

	public void setHabitaciones(Habitaciones habitaciones) {
		this.habitaciones = habitaciones;
	}

	public Camas getCamas() {
		return camas;
	}

	public void setCamas(Camas camas) {
		this.camas = camas;
	}

	@Override
	public String toString() {
		return "Hotel [ubicacion=" + ubicacion + ", pisos=" + pisos + ", areasrecreativas=" + areasrecreativas
				+ ", habitaciones=" + habitaciones + ", camas=" + camas + "]";
	}

	
	
	
	
}
