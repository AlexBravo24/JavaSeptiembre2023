package com;

public class Perros {
	
	private String raza;
	private String tama�o;
	private int edad;
	private String nombre;
	
	public Perros () {}

	public Perros(String raza, String tama�o, int edad, String nombre) {
		super();
		this.raza = raza;
		this.tama�o = tama�o;
		this.edad = edad;
		this.nombre = nombre;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public String getTama�o() {
		return tama�o;
	}

	public void setTama�o(String tama�o) {
		this.tama�o = tama�o;
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
		return "Perros [raza=" + raza + ", tama�o=" + tama�o + ", edad=" + edad + ", nombre=" + nombre + "]";
	}
	
	
	

}
