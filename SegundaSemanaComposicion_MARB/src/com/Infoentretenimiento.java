package com;

public class Infoentretenimiento {
	
	private String marca;
	private double cantidadAltavoz;
	private String consola;
	
	public Infoentretenimiento () {}

	public Infoentretenimiento(String marca, double cantidadAltavoz, String consola) {
		super();
		this.marca = marca;
		this.cantidadAltavoz = cantidadAltavoz;
		this.consola = consola;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public double getCantidadAltavoz() {
		return cantidadAltavoz;
	}

	public void setCantidadAltavoz(double cantidadAltavoz) {
		this.cantidadAltavoz = cantidadAltavoz;
	}

	public String getConsola() {
		return consola;
	}

	public void setConsola(String consola) {
		this.consola = consola;
	}

	@Override
	public String toString() {
		return "Infoentretenimiento [marca=" + marca + ", cantidadAltavoz=" + cantidadAltavoz + ", consola=" + consola
				+ "]";
	}
	
	

}
