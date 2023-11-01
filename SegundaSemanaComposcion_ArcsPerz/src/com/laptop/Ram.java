package com.laptop;

public class Ram {
private String marca;
private double capacidad;
 private double frecuencia;
public Ram() {
	super();
}
public Ram(String marca, double capacidad, double frecuencia) {
	super();
	this.marca = marca;
	this.capacidad = capacidad;
	this.frecuencia = frecuencia;
}
public String getMarca() {
	return marca;
}
public void setMarca(String marca) {
	this.marca = marca;
}
public double getCapacidad() {
	return capacidad;
}
public void setCapacidad(double capacidad) {
	this.capacidad = capacidad;
}
public double getFrecuencia() {
	return frecuencia;
}
public void setFrecuencia(double frecuencia) {
	this.frecuencia = frecuencia;
}
@Override
public String toString() {
	return "Ram [marca=" + marca + ", capacidad=" + capacidad + ", frecuencia=" + frecuencia + "]";
}

 
 
}
