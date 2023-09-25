package com;

public class Laptop {
	
	//Definir atributos para crear una laptop
	
	private String marca;
	private String modelo; 
	private double precio;
	private String color; 
	private boolean camara;
	
	
	//Atributos que son objetos que forman parte de
	//uno m�s grande, en este caso una Laptop
	//Necesitamos crear las clases para definir estos objetos
	//Y una vez que las creamos, si est�n dentro del mismo paquete
	//Se detectan en autom�tico como tipo de dato que ser� 
	//atributo aqu�
	private RAM ram; 
	private Almacenamiento disco;
	private Procesador cpu;
	
    public Laptop() {}

	
	public Laptop(String marca, String modelo, double precio, String color, boolean camara, RAM ram,
			Almacenamiento disco, Procesador cpu) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.precio = precio;
		this.color = color;
		this.camara = camara;
		this.ram = ram;
		this.disco = disco;
		this.cpu = cpu;
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

	public RAM getRam() {
		return ram;
	}

	public void setRam(RAM ram) {
		this.ram = ram;
	}

	public Almacenamiento getDisco() {
		return disco;
	}

	public void setDisco(Almacenamiento disco) {
		this.disco = disco;
	}

	public Procesador getCpu() {
		return cpu;
	}

	public void setCpu(Procesador cpu) {
		this.cpu = cpu;
	}
	
	public boolean isCamara() {
		return camara;
	}


	public void setCamara(boolean camara) {
		this.camara = camara;
	}


	@Override
	public String toString() {
		return "Laptop [marca=" + marca + ", modelo=" + modelo + ", precio=" + precio + ", color=" + color + ", camara="
				+ camara + ", ram=" + ram + ", disco=" + disco + ", cpu=" + cpu + "]";
	}


	
    
    
}
