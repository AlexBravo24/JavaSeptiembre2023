package com;

public class Videojuegos {

	private String titulo;
	private int tama�ogb;
	private String genero;
	private int jugadores;
	
	
	
	
	public Videojuegos () {
		
	}




	public Videojuegos(String titulo, int tama�ogb, String genero, int jugadores) {
		super();
		this.titulo = titulo;
		this.tama�ogb = tama�ogb;
		this.genero = genero;
		this.jugadores = jugadores;
	}




	public String getTitulo() {
		return titulo;
	}




	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}




	public int getTama�ogb() {
		return tama�ogb;
	}




	public void setTama�ogb(int tama�ogb) {
		this.tama�ogb = tama�ogb;
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
		return "Videojuegos [titulo=" + titulo + ", tama�ogb=" + tama�ogb + ", genero=" + genero + ", jugadores="
				+ jugadores + "]";
	}
	
	
}
