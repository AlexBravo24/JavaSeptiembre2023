package com;

public class Carro {
	
	private String puertas;
	private String llantas;
	private String motor;
	private String color;
	private String asientos;
	
	public Carro () {}

	public Carro(String puertas, String llantas, String motor, String color, String asientos) {
		super();
		this.puertas = puertas;
		this.llantas = llantas;
		this.motor = motor;
		this.color = color;
		this.asientos = asientos;
	}

	public String getPuertas() {
		return puertas;
	}

	public void setPuertas(String puertas) {
		this.puertas = puertas;
	}

	public String getLlantas() {
		return llantas;
	}

	public void setLlantas(String llantas) {
		this.llantas = llantas;
	}

	public String getMotor() {
		return motor;
	}

	public void setMotor(String motor) {
		this.motor = motor;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getAsientos() {
		return asientos;
	}

	public void setAsientos(String asientos) {
		this.asientos = asientos;
	}

	@Override
	public String toString() {
		return "Carro [puertas=" + puertas + ", llantas=" + llantas + ", motor=" + motor + ", color=" + color
				+ ", asientos=" + asientos + "]";
	}
	
	
	

}
