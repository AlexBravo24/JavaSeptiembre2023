package com;

public class Ropa {
	
	private String prenda;
	private String medida;
	private String color;
	
	public Ropa() {}

	public Ropa(String prenda, String medida, String color) {
		super();
		this.prenda = prenda;
		this.medida = medida;
		this.color = color;
	}

	public String getPrenda() {
		return prenda;
	}

	public void setPrenda(String prenda) {
		this.prenda = prenda;
	}

	public String getMedida() {
		return medida;
	}

	public void setMedida(String medida) {
		this.medida = medida;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Ropa [prenda=" + prenda + ", medida=" + medida + ", color=" + color + "]";
	}
	
	

}
