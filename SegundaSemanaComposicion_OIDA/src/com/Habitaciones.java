package com;

public class Habitaciones {

	private String tamaño;
    private int sillones;
	private String ventanas;
	
	
	public Habitaciones(){
		
	}


	public Habitaciones(String tamaño, int sillones, String ventanas) {
		super();
		this.tamaño = tamaño;
		this.sillones = sillones;
		this.ventanas = ventanas;
	}


	public String getTamaño() {
		return tamaño;
	}


	public void setTamaño(String tamaño) {
		this.tamaño = tamaño;
	}


	public int getSillones() {
		return sillones;
	}


	public void setSillones(int sillones) {
		this.sillones = sillones;
	}


	public String getVentanas() {
		return ventanas;
	}


	public void setVentanas(String ventanas) {
		this.ventanas = ventanas;
	}


	@Override
	public String toString() {
		return "Habitaciones [tamaño=" + tamaño + ", sillones=" + sillones + ", ventanas=" + ventanas + "]";
	}


	
	
	
}
