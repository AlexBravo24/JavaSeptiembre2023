package com;

public class Libros {
	private String nombre;
	private int NumEjemplares;
	private String Genero;
	private String Autor;
	
	public Libros () {}

	public Libros(String nombre, int numEjemplares, String genero, String autor) {
		super();
		this.nombre = nombre;
		NumEjemplares = numEjemplares;
		Genero = genero;
		Autor = autor;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNumEjemplares() {
		return NumEjemplares;
	}

	public void setNumEjemplares(int numEjemplares) {
		NumEjemplares = numEjemplares;
	}

	public String getGenero() {
		return Genero;
	}

	public void setGenero(String genero) {
		Genero = genero;
	}

	public String getAutor() {
		return Autor;
	}

	public void setAutor(String autor) {
		Autor = autor;
	}

	@Override
	public String toString() {
		return "Libros [nombre=" + nombre + ", NumEjemplares=" + NumEjemplares + ", Genero=" + Genero + ", Autor="
				+ Autor + "]";
	}
	
	

}
