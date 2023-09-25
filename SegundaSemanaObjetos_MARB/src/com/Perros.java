package com;

public class Perros {
	
	private String raza;
	private String tamaño;
	private int edad;
	private String nombre;
	
	public Perros () {}

	public Perros(String raza, String tamaño, int edad, String nombre) {
		super();
		this.raza = raza;
		this.tamaño = tamaño;
		this.edad = edad;
		this.nombre = nombre;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public String getTamaño() {
		return tamaño;
	}

	public void setTamaño(String tamaño) {
		this.tamaño = tamaño;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Perros [raza=" + raza + ", tamaño=" + tamaño + ", edad=" + edad + ", nombre=" + nombre + "]";
	}
	
	
	

}
