package com;

public class Habitaciones {

	private String tama�o;
    private int sillones;
	private String ventanas;
	
	
	public Habitaciones(){
		
	}


	public Habitaciones(String tama�o, int sillones, String ventanas) {
		super();
		this.tama�o = tama�o;
		this.sillones = sillones;
		this.ventanas = ventanas;
	}


	public String getTama�o() {
		return tama�o;
	}


	public void setTama�o(String tama�o) {
		this.tama�o = tama�o;
	}


	public int getSillones() {
		return sillones;
	}


	public void setSillones(int sillones) {
		this.sillones = sillones;
	}


	public String getVentanas() {
		return ventanas;
	}


	public void setVentanas(String ventanas) {
		this.ventanas = ventanas;
	}


	@Override
	public String toString() {
		return "Habitaciones [tama�o=" + tama�o + ", sillones=" + sillones + ", ventanas=" + ventanas + "]";
	}


	
	
	
}
