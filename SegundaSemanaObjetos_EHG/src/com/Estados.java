package com;

public class Estados {
	
	private String nombre;
	private double NumHabit;
	private double ExtencTerri;
	
	
	
	public Estados() {
		
	}



	public Estados(String nombre, double numHabit, double extencTerri) {
		super();
		this.nombre = nombre;
		NumHabit = numHabit;
		ExtencTerri = extencTerri;
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public double getNumHabit() {
		return NumHabit;
	}



	public void setNumHabit(double numHabit) {
		NumHabit = numHabit;
	}



	public double getExtencTerri() {
		return ExtencTerri;
	}



	public void setExtencTerri(double extencTerri) {
		ExtencTerri = extencTerri;
	}



	@Override
	public String toString() {
		return "Estados nombre= " + nombre + ", NumHabit= " + NumHabit + " millones"+ ", ExtencTerri= " + ExtencTerri + "km2";
	}
	
	
	

}
