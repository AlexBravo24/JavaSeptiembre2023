package com;

public class Basesconstruccion {

	
	private int pisos;
	private int ventanas;
	private String acabados;
	
	public Basesconstruccion() {
		
	}

	public Basesconstruccion(int pisos, int ventanas, String acabados) {
		super();
		this.pisos = pisos;
		this.ventanas = ventanas;
		this.acabados = acabados;
	}

	public int getPisos() {
		return pisos;
	}

	public void setPisos(int pisos) {
		this.pisos = pisos;
	}

	public int getVentanas() {
		return ventanas;
	}

	public void setVentanas(int ventanas) {
		this.ventanas = ventanas;
	}

	public String getAcabados() {
		return acabados;
	}

	public void setAcabados(String acabados) {
		this.acabados = acabados;
	}

	@Override
	public String toString() {
		return "Basesconstruccion [pisos=" + pisos + ", ventanas=" + ventanas + ", acabados=" + acabados + "]";
	}
	
	
}
