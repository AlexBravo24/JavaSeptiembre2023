package com.laptop;

import javax.crypto.spec.RC2ParameterSpec;

public class Laptop {
	/**
	 * @desc y una vez
	 * 
	 */
	private String marca;
	private String modelo;
	private double precio;
	private String color;
	private boolean camara;

	
	//para hace funcionar esto se crea una clase con el 
	//tipo de dato en este caso llamada ram
	private Ram ram;
	private Almacenamiento almacenamento_;
	private Procesador procesador;

	public Laptop() {
		super();
	}



	public Laptop(String marca, String modelo, double precio, String color, boolean camara, Ram ram,
			Almacenamiento almacenamento_, Procesador procesador) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.precio = precio;
		this.color = color;
		this.camara = camara;
		this.ram = ram;
		this.almacenamento_ = almacenamento_;
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

	public boolean isCamara() {
		return camara;
	}

	public void setCamara(boolean camara) {
		this.camara = camara;
	}

	public Ram getRam() {
		return ram;
	}

	public void setRam(Ram ram) {
		this.ram = ram;
	}

	public Almacenamiento getAlmacenamento_() {
		return almacenamento_;
	}

	public void setAlmacenamento_(Almacenamiento almacenamento_) {
		this.almacenamento_ = almacenamento_;
	}



	public Procesador getProcesador() {
		return procesador;
	}



	public void setProcesador(Procesador procesador) {
		this.procesador = procesador;
	}



	@Override
	public String toString() {
		return "Laptop [marca=" + marca + ", modelo=" + modelo + ", precio=" + precio + ", color=" + color + ", camara="
				+ camara + ", ram=" + ram + ", almacenamento_=" + almacenamento_ + ", procesador=" + procesador + "]";
	}
	

}
