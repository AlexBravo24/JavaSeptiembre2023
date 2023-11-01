package com;

public class Ingrediente {
	
	private String nombre;
	private Double cantidad;
	private String tipo;
	
	public Ingrediente() {
		
	}

	public Ingrediente(String nombre, Double cantidad, String tipo) {
		super();
		this.nombre = nombre;
		this.cantidad = cantidad;
		this.tipo = tipo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Double getCantidad() {
		return cantidad;
	}

	public void setCantidad(Double cantidad) {
		this.cantidad = cantidad;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "Ingrediente [nombre=" + nombre + ", cantidad=" + cantidad + ", tipo=" + tipo + "]";
	}

	
}
