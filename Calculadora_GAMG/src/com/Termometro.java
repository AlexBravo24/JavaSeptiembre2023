package com;

public abstract class Termometro {
	
	private String tipo;
	private String marca;
	
	public Termometro() {}

	public Termometro(String tipo, String marca) {
		super();
		this.tipo = tipo;
		this.marca = marca;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	@Override
	public String toString() {
		return "Termometro [tipo=" + tipo + ", marca=" + marca + "]";
	}
	
	public abstract void tomarTemperatura();
	

}
