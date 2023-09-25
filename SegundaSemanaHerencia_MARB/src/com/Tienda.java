package com;

public class Tienda extends Cereales {
	
	private String frutas;
	private String verduras;
	private String lacteos;
	private String enlatados;
	
	public Tienda () {}

	public Tienda(String tipo, double precio, String empaque, String frutas, String verduras, String lacteos,
			String enlatados) {
		super(tipo, precio, empaque);
		this.frutas = frutas;
		this.verduras = verduras;
		this.lacteos = lacteos;
		this.enlatados = enlatados;
	}

	public String getFrutas() {
		return frutas;
	}

	public void setFrutas(String frutas) {
		this.frutas = frutas;
	}

	public String getVerduras() {
		return verduras;
	}

	public void setVerduras(String verduras) {
		this.verduras = verduras;
	}

	public String getLacteos() {
		return lacteos;
	}

	public void setLacteos(String lacteos) {
		this.lacteos = lacteos;
	}

	public String getEnlatados() {
		return enlatados;
	}

	public void setEnlatados(String enlatados) {
		this.enlatados = enlatados;
	}

	@Override
	public String toString() {
		return "Tienda [frutas=" + frutas + ", verduras=" + verduras + ", lacteos=" + lacteos + ", enlatados="
				+ enlatados + ", toString()=" + super.toString() + "]";
	}
	
	
	

}
