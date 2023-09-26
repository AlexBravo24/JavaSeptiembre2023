package com;

public class Peliculas {
	private String nombre;
	private String Genero;
	private int Año;
	private String Director;
	
	public Peliculas() {}

	public Peliculas(String nombre, String genero, int año, String director) {
		super();
		this.nombre = nombre;
		Genero = genero;
		Año = año;
		Director = director;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getGenero() {
		return Genero;
	}

	public void setGenero(String genero) {
		Genero = genero;
	}

	public int getAño() {
		return Año;
	}

	public void setAño(int año) {
		Año = año;
	}

	public String getDirector() {
		return Director;
	}

	public void setDirector(String director) {
		Director = director;
	}

	@Override
	public String toString() {
		return "Peliculas [nombre=" + nombre + ", Genero=" + Genero + ", Año=" + Año + ", Director=" + Director + "]";
	}
	
	

	
	

}
