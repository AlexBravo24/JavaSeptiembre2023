package com;

public class Cordinador {
	
	private String nombre;
	private String funciones;
	private String area;
	
	public Cordinador() {
		
	}

	public Cordinador(String nombre, String funciones, String area) {
		super();
		this.nombre = nombre;
		this.funciones = funciones;
		this.area = area;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getFunciones() {
		return funciones;
	}

	public void setFunciones(String funciones) {
		this.funciones = funciones;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	@Override
	public String toString() {
		return " Cordinador nombre= " + nombre + ", funciones= " + funciones + ", area= " + area + " ";
	}
	
	
	

}
