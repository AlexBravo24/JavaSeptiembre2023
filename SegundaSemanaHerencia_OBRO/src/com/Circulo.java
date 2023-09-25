package com;

public class Circulo extends Figura {
	
	//Clase Hija
	
	private int radio;
	private int diametro;
	private double area;
	
	public Circulo () {}

	public Circulo(String nombre, int lados, int aristas, int radio, int diametro, double area) {
		super(nombre, lados, aristas);
		this.radio = radio;
		this.diametro = diametro;
		this.area = area;
	}

	public int getRadio() {
		return radio;
	}

	public void setRadio(int radio) {
		this.radio = radio;
	}

	public int getDiametro() {
		return diametro;
	}

	public void setDiametro(int diametro) {
		this.diametro = diametro;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	@Override
	public String toString() {
		return super .toString() + "Datos para generar area [radio=" + radio + ", diametro=" + diametro + ", area=" + area + 
				 "]";
	}

	

}
