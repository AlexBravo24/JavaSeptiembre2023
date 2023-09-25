package com;

public class Camas {

	private int almohadas;
	private String tamaño;
	private String acabado;
	
	
	
	
	public Camas() {
		
	}




	public Camas(int almohadas, String tamaño, String acabado) {
		super();
		this.almohadas = almohadas;
		this.tamaño = tamaño;
		this.acabado = acabado;
	}




	public int getAlmohadas() {
		return almohadas;
	}




	public void setAlmohadas(int almohadas) {
		this.almohadas = almohadas;
	}




	public String getTamaño() {
		return tamaño;
	}




	public void setTamaño(String tamaño) {
		this.tamaño = tamaño;
	}




	public String getAcabado() {
		return acabado;
	}




	public void setAcabado(String acabado) {
		this.acabado = acabado;
	}




	@Override
	public String toString() {
		return "Camas [almohadas=" + almohadas + ", tamaño=" + tamaño + ", acabado=" + acabado + "]";
	}
	
	
}
