package com;

public class Computadoras {

	private String procesador; 
	private String grafica;
	private int ram;
	private int tama�opantalla;
	
	
	public Computadoras() {
		
	}


	public Computadoras(String procesador, String grafica, int ram, int tama�opantalla) {
		super();
		this.procesador = procesador;
		this.grafica = grafica;
		this.ram = ram;
		this.tama�opantalla = tama�opantalla;
	}


	public String getProcesador() {
		return procesador;
	}


	public void setProcesador(String procesador) {
		this.procesador = procesador;
	}


	public String getGrafica() {
		return grafica;
	}


	public void setGrafica(String grafica) {
		this.grafica = grafica;
	}


	public int getRam() {
		return ram;
	}


	public void setRam(int ram) {
		this.ram = ram;
	}


	public int getTama�opantalla() {
		return tama�opantalla;
	}


	public void setTama�opantalla(int tama�opantalla) {
		this.tama�opantalla = tama�opantalla;
	}


	@Override
	public String toString() {
		return "Computadoras [procesador=" + procesador + ", grafica=" + grafica + ", ram=" + ram + ", tama�opantalla="
				+ tama�opantalla + "]";
	}
	
	
	
}
