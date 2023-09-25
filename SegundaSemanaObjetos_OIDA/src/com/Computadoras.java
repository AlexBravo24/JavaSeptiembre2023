package com;

public class Computadoras {

	private String procesador; 
	private String grafica;
	private int ram;
	private int tamaņopantalla;
	
	
	public Computadoras() {
		
	}


	public Computadoras(String procesador, String grafica, int ram, int tamaņopantalla) {
		super();
		this.procesador = procesador;
		this.grafica = grafica;
		this.ram = ram;
		this.tamaņopantalla = tamaņopantalla;
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


	public int getTamaņopantalla() {
		return tamaņopantalla;
	}


	public void setTamaņopantalla(int tamaņopantalla) {
		this.tamaņopantalla = tamaņopantalla;
	}


	@Override
	public String toString() {
		return "Computadoras [procesador=" + procesador + ", grafica=" + grafica + ", ram=" + ram + ", tamaņopantalla="
				+ tamaņopantalla + "]";
	}
	
	
	
}
