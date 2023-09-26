package com;

public class Plantas {
	
	private String nombre;
	private String Altura;
	private String color;
	
	private Rasgos rasgos;
	private Reproduccion Reproduccion;
	private Especie especie;
	
	public Plantas(String string, String string2, String string3, boolean b, Especie helecho, com.Reproduccion autogamia) {}

	public Plantas(String nombre, String altura, String color, Rasgos rasgos, com.Reproduccion reproduccion,
			Especie especie) {
		super();
		this.nombre = nombre;
		Altura = altura;
		this.color = color;
		this.rasgos = rasgos;
		Reproduccion = reproduccion;
		this.especie = especie;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getAltura() {
		return Altura;
	}

	public void setAltura(String altura) {
		Altura = altura;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Rasgos getRasgos() {
		return rasgos;
	}

	public void setRasgos(Rasgos rasgos) {
		this.rasgos = rasgos;
	}

	public Reproduccion getReproduccion() {
		return Reproduccion;
	}

	public void setReproduccion(Reproduccion reproduccion) {
		Reproduccion = reproduccion;
	}

	public Especie getEspecie() {
		return especie;
	}

	public void setEspecie(Especie especie) {
		this.especie = especie;
	}

	@Override
	public String toString() {
		return "Plantas [nombre=" + nombre + ", Altura=" + Altura + ", color=" + color + ", rasgos=" + rasgos
				+ ", Reproduccion=" + Reproduccion + ", especie=" + especie + "]";
	}

		
}
