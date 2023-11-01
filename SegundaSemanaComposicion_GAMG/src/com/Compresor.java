package com;

public class Compresor {

	private String marca;
	private String modelo;
	private double hp;
	
	public Compresor() {}

	public Compresor(String marca, String modelo, double hp) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.hp = hp;
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

	public double getHp() {
		return hp;
	}

	public void setHp(double hp) {
		this.hp = hp;
	}

	@Override
	public String toString() {
		return "Compresor [marca=" + marca + ", modelo=" + modelo + ", hp=" + hp + "]";
	}

	
	
	 
	
	
}
