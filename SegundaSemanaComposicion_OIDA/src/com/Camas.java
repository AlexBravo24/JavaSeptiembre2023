package com;

public class Camas {

	private int almohadas;
	private String tama�o;
	private String acabado;
	
	
	
	
	public Camas() {
		
	}




	public Camas(int almohadas, String tama�o, String acabado) {
		super();
		this.almohadas = almohadas;
		this.tama�o = tama�o;
		this.acabado = acabado;
	}




	public int getAlmohadas() {
		return almohadas;
	}




	public void setAlmohadas(int almohadas) {
		this.almohadas = almohadas;
	}




	public String getTama�o() {
		return tama�o;
	}




	public void setTama�o(String tama�o) {
		this.tama�o = tama�o;
	}




	public String getAcabado() {
		return acabado;
	}




	public void setAcabado(String acabado) {
		this.acabado = acabado;
	}




	@Override
	public String toString() {
		return "Camas [almohadas=" + almohadas + ", tama�o=" + tama�o + ", acabado=" + acabado + "]";
	}
	
	
}
