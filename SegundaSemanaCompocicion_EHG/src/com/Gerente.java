package com;

public class Gerente {
	
	private String nombre;
	private int edad;
	private String cargo;
	
	
	
	public Gerente() {
		
	}



	public Gerente(String nombre, int edad, String cargo) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.cargo = cargo;
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public int getEdad() {
		return edad;
	}



	public void setEdad(int edad) {
		this.edad = edad;
	}



	public String getCargo() {
		return cargo;
	}



	public void setCargo(String cargo) {
		this.cargo = cargo;
	}



	@Override
	public String toString() {
		return " Gerente nombre = " + nombre + ", edad = " + edad + ", cargo = " + cargo + " ";
	}
	
	
	
	
	
	

}
