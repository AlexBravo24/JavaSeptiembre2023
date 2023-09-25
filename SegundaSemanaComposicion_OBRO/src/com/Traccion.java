package com;

public class Traccion {
	
	private String marca;
	private String tipo;
	
	public Traccion() {}

	public Traccion(String marca, String tipo) {
		super();
		this.marca = marca;
		this.tipo = tipo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return tipo;
	}

	public void setModelo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "Traccion [marca=" + marca + ", tipo=" + tipo + "]";
	}
	
	

}
