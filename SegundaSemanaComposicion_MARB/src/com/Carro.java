package com;

public class Carro {
	
	
	private String color;
	private String modelo;
	private String marca;
	
	private Llanta llanta;
	private Infoentretenimiento infoentretenimiento;
	
	public Carro () {}

	public Carro(String color, String modelo, String marca, Llanta llanta, Infoentretenimiento infoentretenimiento) {
		super();
		this.color = color;
		this.modelo = modelo;
		this.marca = marca;
		this.llanta = llanta;
		this.infoentretenimiento = infoentretenimiento;
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

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public Llanta getLlanta() {
		return llanta;
	}

	public void setLlanta(Llanta llanta) {
		this.llanta = llanta;
	}

	public Infoentretenimiento getInfoentretenimiento() {
		return infoentretenimiento;
	}

	public void setInfoentretenimiento(Infoentretenimiento infoentretenimiento) {
		this.infoentretenimiento = infoentretenimiento;
	}

	@Override
	public String toString() {
		return "Carro [color=" + color + ", modelo=" + modelo + ", marca=" + marca + ", llanta=" + llanta
				+ ", infoentretenimiento=" + infoentretenimiento + "]";
	}
	
	

}
