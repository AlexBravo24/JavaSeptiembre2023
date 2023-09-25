package com;

public class Figura {
	
	//Clase Padre
	
	private String nombre;
	private int lados;
	private int aristas;
	
	public Figura() {}
	
	public Figura(String nombre, int lados, int aristas) {
		super();
		this.nombre = nombre;
		this.lados = lados;
		this.aristas = aristas;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getLados() {
		return lados;
	}

	public void setLados(int lados) {
		this.lados = lados;
	}

	public int getAristas() {
		return aristas;
	}

	public void setAristas(int aristas) {
		this.aristas = aristas;
	}

	@Override
	public String toString() {
		return "Figura [nombre=" + nombre + ", lados=" + lados + ", aristas=" + aristas + "]";
	}
	
	
	
}
