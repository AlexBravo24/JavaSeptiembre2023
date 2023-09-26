package com;

public class Reproduccion {
	
	private String Metodo;
	private String Tipo;
	
	public Reproduccion () {}

	public Reproduccion(String metodo, String tipo) {
		super();
		Metodo = metodo;
		Tipo = tipo;
	}

	public String getMetodo() {
		return Metodo;
	}

	public void setMetodo(String metodo) {
		Metodo = metodo;
	}

	public String getTipo() {
		return Tipo;
	}

	public void setTipo(String tipo) {
		Tipo = tipo;
	}

	@Override
	public String toString() {
		return "Reproduccion [Metodo=" + Metodo + ", Tipo=" + Tipo + "]";
	}
	
	

}
