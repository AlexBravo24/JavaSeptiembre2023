package com;

public abstract class Calculadora {
	
	
	private String marca;
	private String color;
	private String modelo;
	private String tipo;
	private String alimentacion;
	
	public Calculadora () {}

	public Calculadora(String marca, String color, String modelo, String tipo, String alimentacion) {
		super();
		this.marca = marca;
		this.color = color;
		this.modelo = modelo;
		this.tipo = tipo;
		this.alimentacion = alimentacion;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
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

	public String getAlimentacion() {
		return alimentacion;
	}

	public void setAlimentacion(String alimentacion) {
		this.alimentacion = alimentacion;
	}

	@Override
	public String toString() {
		return "Calculadora [marca=" + marca + ", color=" + color + ", modelo=" + modelo + ", tipo=" + tipo
				+ ", alimentacion=" + alimentacion + "]";
	}
	
	public abstract void Suma(int numero1,int numero2);	
	public abstract void Resta(int numero1,int numero2);
	public abstract void Multiplicacion(int numero1,int numero2);
	public abstract void Division(int numero1,int numero2);
}
