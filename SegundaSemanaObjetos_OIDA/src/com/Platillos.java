package com;

public class Platillos {

	
	private String nombre;
	private String picante;
	private int limones;
	
	
	public Platillos() {
		
	}


	public Platillos(String nombre, String picante, int limones) {
		super();
		this.nombre = nombre;
		this.picante = picante;
		this.limones = limones;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getPicante() {
		return picante;
	}


	public void setPicante(String picante) {
		this.picante = picante;
	}


	public int getLimones() {
		return limones;
	}


	public void setLimones(int limones) {
		this.limones = limones;
	}


	@Override
	public String toString() {
		return "Platillos [nombre=" + nombre + ", picante=" + picante + ", limones=" + limones + "]";
	}
	
	
}
