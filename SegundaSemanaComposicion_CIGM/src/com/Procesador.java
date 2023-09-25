package com;

public class Procesador {
private String fabricante;
private String modelo;
private double frecuencia;


public Procesador(String fabricante, String modelo, double frecuencia) {
	super();
	this.fabricante = fabricante;
	this.modelo = modelo;
	this.frecuencia = frecuencia;
}


public String getFabricante() {
	return fabricante;
}


public void setFabricante(String fabricante) {
	this.fabricante = fabricante;
}


public String getModelo() {
	return modelo;
}


public void setModelo(String modelo) {
	this.modelo = modelo;
}


public double getFrecuencia() {
	return frecuencia;
}


public void setFrecuencia(double frecuencia) {
	this.frecuencia = frecuencia;
}


@Override
public String toString() {
	return "Procesador [fabricante=" + fabricante + ", modelo=" + modelo + ", frecuencia=" + frecuencia + "]";
}



}
