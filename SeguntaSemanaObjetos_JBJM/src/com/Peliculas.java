package com;

public class Peliculas {
	private String nombre;
	private String Genero;
	private int A�o;
	private String Director;
	
	public Peliculas() {}

	public Peliculas(String nombre, String genero, int a�o, String director) {
		super();
		this.nombre = nombre;
		Genero = genero;
		A�o = a�o;
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

	public int getA�o() {
		return A�o;
	}

	public void setA�o(int a�o) {
		A�o = a�o;
	}

	public String getDirector() {
		return Director;
	}

	public void setDirector(String director) {
		Director = director;
	}

	@Override
	public String toString() {
		return "Peliculas [nombre=" + nombre + ", Genero=" + Genero + ", A�o=" + A�o + ", Director=" + Director + "]";
	}
	
	

	
	

}
