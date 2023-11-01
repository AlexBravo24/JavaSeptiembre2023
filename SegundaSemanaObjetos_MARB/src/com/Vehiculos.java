package com;

public class Vehiculos {
	
	private String tipo;
	private String medio;
	private String combustible;
	private String conduccion;
	
	
	public Vehiculos () {}


	public Vehiculos(String tipo, String medio, String combustible, String conduccion) {
		super();
		this.tipo = tipo;
		this.medio = medio;
		this.combustible = combustible;
		this.conduccion = conduccion;
	}


	public String getTipo() {
		return tipo;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	public String getMedio() {
		return medio;
	}


	public void setMedio(String medio) {
		this.medio = medio;
	}


	public String getCombustible() {
		return combustible;
	}


	public void setCombustible(String combustible) {
		this.combustible = combustible;
	}


	public String getConduccion() {
		return conduccion;
	}


	public void setConduccion(String conduccion) {
		this.conduccion = conduccion;
	}


	@Override
	public String toString() {
		return "Vehiculos [tipo=" + tipo + ", medio=" + medio + ", combustible=" + combustible + ", conduccion="
				+ conduccion + "]";
	}
	
	
	

}
