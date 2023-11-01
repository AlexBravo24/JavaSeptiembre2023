package com;

public class Coche  {
	private String Marca;
	private int Precio;
	private String Color;
	
	public Coche (){}

	public Coche(String marca, int precio, String color) {
		super();
		Marca = marca;
		Precio = precio;
		Color = color;
	}

	public String getMarca() {
		return Marca;
	}

	public void setMarca(String marca) {
		Marca = marca;
	}

	public int getPrecio() {
		return Precio;
	}

	public void setPrecio(int precio) {
		Precio = precio;
	}

	public String getColor() {
		return Color;
	}

	public void setColor(String color) {
		Color = color;
	}

	@Override
	public String toString() {
		return "Coche [Marca=" + Marca + ", Precio=" + Precio + ", Color=" + Color + "]";
	}
	
	

	
	
	

}
