package com;

public class Comidas {
	
	private String nombre;
	private String color;
	private int NumIngredientes;
	
	
	public Comidas () {
		
	}


	public Comidas(String nombre, String color, int numIngredientes) {
		super();
		this.nombre = nombre;
		this.color = color;
		NumIngredientes = numIngredientes;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public int getNumIngredientes() {
		return NumIngredientes;
	}


	public void setNumIngredientes(int numIngredientes) {
		NumIngredientes = numIngredientes;
	}


	@Override
	public String toString() {
		return "Comidas [nombre=" + nombre + ", color=" + color + ", NumIngredientes=" + NumIngredientes + "]";
	}
	
	
	
	
	

}
