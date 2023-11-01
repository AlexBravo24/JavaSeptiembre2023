package com;

public class Icemaker {

	private String marca;
	private String modelo;
	private String tipo;
	private String tama�o;
	
	public Icemaker () {}

	public Icemaker(String marca, String modelo, String tipo, String tama�o) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.tipo = tipo;
		this.tama�o = tama�o;
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

	public String getTama�o() {
		return tama�o;
	}

	public void setTama�o(String tama�o) {
		this.tama�o = tama�o;
	}

	@Override
	public String toString() {
		return "Icemaker [marca=" + marca + ", modelo=" + modelo + ", tipo=" + tipo + ", tama�o=" + tama�o + "]";
	}
	
	
}
