package com;

public class Direccion {
	
	private String modelo;
	private String tipo;
	
	public Direccion() {}

	public Direccion(String modelo, String tipo) {
		super();
		this.modelo = modelo;
		this.tipo = tipo;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "Direccion [modelo=" + modelo + ", tipo=" + tipo + "]";
	}
	
	

}
