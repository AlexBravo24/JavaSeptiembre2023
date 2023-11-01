package com;

public class Icemaker {

	private String marca;
	private String modelo;
	private String tipo;
	private String tamaño;
	
	public Icemaker () {}

	public Icemaker(String marca, String modelo, String tipo, String tamaño) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.tipo = tipo;
		this.tamaño = tamaño;
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

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getTamaño() {
		return tamaño;
	}

	public void setTamaño(String tamaño) {
		this.tamaño = tamaño;
	}

	@Override
	public String toString() {
		return "Icemaker [marca=" + marca + ", modelo=" + modelo + ", tipo=" + tipo + ", tamaño=" + tamaño + "]";
	}
	
	
}
