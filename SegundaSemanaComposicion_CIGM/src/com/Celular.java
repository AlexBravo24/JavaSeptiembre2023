package com;

public class Celular {
 
	
private String pantalla;
private String camara;
private String marca;
private String SistemaOperativo;
private double precio;

private RAM ram;
private Procesador procesador;
private Almacenamiento almacenamiento;

public Celular(String pantalla, String camara, String marca, String sistemaOperativo, double precio, RAM ram,
		Procesador procesador, Almacenamiento almacenamiento) {
	super();
	this.pantalla = pantalla;
	this.camara = camara;
	this.marca = marca;
	this.SistemaOperativo = sistemaOperativo;
	this.precio = precio;
	this.ram = ram;
	this.procesador = procesador;
	this.almacenamiento = almacenamiento;
}
public String getPantalla() {
	return pantalla;
}
public void setPantalla(String pantalla) {
	this.pantalla = pantalla;
}
public String getCamara() {
	return camara;
}
public void setCamara(String camara) {
	this.camara = camara;
}
public String getMarca() {
	return marca;
}
public void setMarca(String marca) {
	this.marca = marca;
}
public String getSistemaOperativo() {
	return SistemaOperativo;
}
public void setSistemaOperativo(String sistemaOperativo) {
	SistemaOperativo = sistemaOperativo;
}
public double getPrecio() {
	return precio;
}
public void setPrecio(double precio) {
	this.precio = precio;
}
public RAM getRam() {
	return ram;
}
public void setRam(RAM ram) {
	this.ram = ram;
}
public Procesador getProcesador() {
	return procesador;
}
public void setProcesador(Procesador procesador) {
	this.procesador = procesador;
}
public Almacenamiento getAlmacenamiento() {
	return almacenamiento;
}
public void setAlmacenamiento(Almacenamiento almacenamiento) {
	this.almacenamiento = almacenamiento;
}
@Override
public String toString() {
	return "Celular [pantalla=" + pantalla + ", camara=" + camara + ", marca=" + marca + ", SistemaOperativo="
			+ SistemaOperativo + ", precio=" + precio + ", ram=" + ram + ", procesador=" + procesador
			+ ", almacenamiento=" + almacenamiento + "]";
}







}
