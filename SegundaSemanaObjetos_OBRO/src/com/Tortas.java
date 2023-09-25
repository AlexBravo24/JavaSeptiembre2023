package com;

public class Tortas {
	
	private String nombre;
	private String ingrediente1;
	private String ingrediente2;
	private int precio;
	
	public Tortas() {}

	public Tortas(String nombre, String ingrediente1, String ingrediente2, int precio) {
		super();
		this.nombre = nombre;
		this.ingrediente1 = ingrediente1;
		this.ingrediente2 = ingrediente2;
		this.precio = precio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getIngrediente1() {
		return ingrediente1;
	}

	public void setIngrediente1(String ingrediente1) {
		this.ingrediente1 = ingrediente1;
	}

	public String getIngrediente2() {
		return ingrediente2;
	}

	public void setIngrediente2(String ingrediente2) {
		this.ingrediente2 = ingrediente2;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Tortas [nombre=" + nombre + ", ingrediente1=" + ingrediente1 + ", ingrediente2=" + ingrediente2
				+ ", precio= $" + precio + "]";
	}
	
	

}
