package com;

public class Refrigerador {
	
	private String marca;
	private String modelo;
	private double capacidad;
	private int puertas;
	
	private Compresor comp;
	private Filtro filt;
	private Icemaker hielo;
	
	public Refrigerador() {}

	public Refrigerador(String marca, String modelo, double capacidad, int puertas, Compresor comp, Filtro filt,
			Icemaker hielo) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.capacidad = capacidad;
		this.puertas = puertas;
		this.comp = comp;
		this.filt = filt;
		this.hielo = hielo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public double getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(double capacidad) {
		this.capacidad = capacidad;
	}

	public int getPuertas() {
		return puertas;
	}

	public void setPuertas(int puertas) {
		this.puertas = puertas;
	}

	public Compresor getComp() {
		return comp;
	}

	public void setComp(Compresor comp) {
		this.comp = comp;
	}

	public Filtro getFilt() {
		return filt;
	}

	public void setFilt(Filtro filt) {
		this.filt = filt;
	}

	public Icemaker getHielo() {
		return hielo;
	}

	public void setHielo(Icemaker hielo) {
		this.hielo = hielo;
	}

	@Override
	public String toString() {
		return "Refrigerador [marca=" + marca + ", modelo=" + modelo + ", capacidad=" + capacidad + ", puertas="
				+ puertas + ", comp=" + comp + ", filt=" + filt + ", hielo=" + hielo + "]";
	}
	
	
	
	

}
