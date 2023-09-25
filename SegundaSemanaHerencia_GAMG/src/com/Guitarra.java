package com;

public class Guitarra extends Instrumento {
	
	private String submarca;
	private String serie;
	private String color;
	
	public Guitarra () {}

	public Guitarra(String tipo, String marca, String modelo, String submarca, String serie, String color) {
		super(tipo, marca, modelo);
		this.submarca = submarca;
		this.serie = serie;
		this.color = color;
	}

	public String getSubmarca() {
		return submarca;
	}

	public void setSubmarca(String submarca) {
		this.submarca = submarca;
	}

	public String getSerie() {
		return serie;
	}

	public void setSerie(String serie) {
		this.serie = serie;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Guitarra [submarca=" + submarca + ", serie=" + serie + ", color=" + color + ", toString()="
				+ super.toString() + "]";
	}
	
	
	

}
