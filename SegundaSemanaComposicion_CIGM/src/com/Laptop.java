package com;

public class Laptop {

	// definir atributos para el objeto
	
	private String marca;
	private String modelo;
	private double precio;
	private String color;
	
	//
	private RAM ram;
	private Almacenamiento disco;
	private Procesador procesador;



public Laptop(String marca, String modelo, double precio, String color, RAM ram, Almacenamiento disco,
		Procesador procesador) {
	super();
	this.marca = marca;
	this.modelo = modelo;
	this.precio = precio;
	this.color = color;
	this.ram = ram;
	this.disco = disco;
	this.procesador = procesador;
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


public double getPrecio() {
	return precio;
}


public void setPrecio(double precio) {
	this.precio = precio;
}


public String getColor() {
	return color;
}


public void setColor(String color) {
	this.color = color;
}


public RAM getRam() {
	return ram;
}


public void setRam(RAM ram) {
	this.ram = ram;
}


public Almacenamiento getDisco() {
	return disco;
}


public void setDisco(Almacenamiento disco) {
	this.disco = disco;
}


public Procesador getProcesador() {
	return procesador;
}


public void setProcesador(Procesador procesador) {
	this.procesador = procesador;
}


@Override
public String toString() {
	return "Laptop [marca=" + marca + ", modelo=" + modelo + ", precio=" + precio + ", color=" + color + ", ram=" + ram
			+ "]";
}
}