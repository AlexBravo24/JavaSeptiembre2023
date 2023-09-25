package com;

public class Videojuegos {

	private String titulo;
	private int tamañogb;
	private String genero;
	private int jugadores;
	
	
	
	
	public Videojuegos () {
		
	}




	public Videojuegos(String titulo, int tamañogb, String genero, int jugadores) {
		super();
		this.titulo = titulo;
		this.tamañogb = tamañogb;
		this.genero = genero;
		this.jugadores = jugadores;
	}




	public String getTitulo() {
		return titulo;
	}




	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}




	public int getTamañogb() {
		return tamañogb;
	}




	public void setTamañogb(int tamañogb) {
		this.tamañogb = tamañogb;
	}




	public String getGenero() {
		return genero;
	}




	public void setGenero(String genero) {
		this.genero = genero;
	}




	public int getJugadores() {
		return jugadores;
	}




	public void setJugadores(int jugadores) {
		this.jugadores = jugadores;
	}




	@Override
	public String toString() {
		return "Videojuegos [titulo=" + titulo + ", tamañogb=" + tamañogb + ", genero=" + genero + ", jugadores="
				+ jugadores + "]";
	}
	
	
}
