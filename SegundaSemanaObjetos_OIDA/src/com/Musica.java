package com;

public class Musica {

	
	private String titulo;
	private int minutos;
	private String genero;
	private String plataforma;
	
	
	public Musica() {
		
	}


	public Musica(String titulo, int minutos, String genero, String plataforma) {
		super();
		this.titulo = titulo;
		this.minutos = minutos;
		this.genero = genero;
		this.plataforma = plataforma;
	}


	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public int getMinutos() {
		return minutos;
	}


	public void setMinutos(int minutos) {
		this.minutos = minutos;
	}


	public String getGenero() {
		return genero;
	}


	public void setGenero(String genero) {
		this.genero = genero;
	}


	public String getPlataforma() {
		return plataforma;
	}


	public void setPlataforma(String plataforma) {
		this.plataforma = plataforma;
	}


	@Override
	public String toString() {
		return "Musica [titulo=" + titulo + ", minutos=" + minutos + ", genero=" + genero + ", plataforma=" + plataforma
				+ "]";
	}
	
	
	
}
