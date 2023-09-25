package com;

public class Arboles {
	
	private String fruta;
	private int cantidad;
	private int precio;
	
	public Arboles() {}

	public Arboles(String fruta, int cantidad, int precio) {
		super();
		this.fruta = fruta;
		this.cantidad = cantidad;
		this.precio = precio;
	}

	public String getFruta() {
		return fruta;
	}

	public void setFruta(String fruta) {
		this.fruta = fruta;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Arboles [fruta= " + fruta + ", cantidad= " + cantidad + "Kg" + ", precio= $" + precio + "]";
	}
	
	

}
