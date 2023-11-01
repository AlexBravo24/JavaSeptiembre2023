package com;

public class Instrumento {
	
	String Tipo;
	String marca;
	String modelo;
	
	public Instrumento () {}

	public Instrumento(String tipo, String marca, String modelo) {
		super();
		Tipo = tipo;
		this.marca = marca;
		this.modelo = modelo;
	}

	public String getTipo() {
		return Tipo;
	}

	public void setTipo(String tipo) {
		Tipo = tipo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	@Override
	public String toString() {
		return "Instrumento [Tipo=" + Tipo + ", marca=" + marca + ", modelo=" + modelo + "]";
	}
	
	
	

}
