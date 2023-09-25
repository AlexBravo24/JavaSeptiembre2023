package com;

public class Futbolista {
	
	private String nombre;
	private int edad;
	private String genero; 
	private String ciudad;
	
	public Futbolista() {}

	public Futbolista(String nombre, int edad, String genero, String ciudad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.genero = genero;
		this.ciudad = ciudad;
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

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	@Override
	public String toString() {
		return "Futbolista nombre= " + nombre + ", \nedad= " + edad + ", \ngenero= " + genero + ", \nciudad= " + ciudad + " ";
	}
	
	
	

}
