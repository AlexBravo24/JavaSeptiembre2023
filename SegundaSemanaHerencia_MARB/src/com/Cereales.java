package com;

public class Cereales {
	
	private String tipo;
	private double precio;
	private String empaque;
	
	public Cereales () {}

	public Cereales(String tipo, double precio, String empaque) {
		super();
		this.tipo = tipo;
		this.precio = precio;
		this.empaque = empaque;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getEmpaque() {
		return empaque;
	}

	public void setEmpaque(String empaque) {
		this.empaque = empaque;
	}

	@Override
	public String toString() {
		return "Cereales [tipo=" + tipo + ", precio=" + precio + ", empaque=" + empaque + "]";
	}
	
	

}
