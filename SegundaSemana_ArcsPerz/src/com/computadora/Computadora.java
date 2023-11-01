package com.computadora;

public class Computadora {
	private String marca_compu;
	private String modelo_comp;
	private double precio_compu;
	private String disco_compu;

	public Computadora() {

	}

	public Computadora(String marca_compu, String modelo_comp, double precio_compu, String disco_compu) {
		super();
		this.marca_compu = marca_compu;
		this.modelo_comp = modelo_comp;
		this.precio_compu = precio_compu;
		this.disco_compu = disco_compu;
	}

	public String getMarca_compu() {
		return marca_compu;
	}

	public void setMarca_compu(String marca_compu) {
		this.marca_compu = marca_compu;
	}

	public String getModelo_comp() {
		return modelo_comp;
	}

	public void setModelo_comp(String modelo_comp) {
		this.modelo_comp = modelo_comp;
	}

	public double getPrecio_compu() {
		return precio_compu;
	}

	public void setPrecio_compu(double precio_compu) {
		this.precio_compu = precio_compu;
	}

	public String getDisco_compu() {
		return disco_compu;
	}

	public void setDisco_compu(String disco_compu) {
		this.disco_compu = disco_compu;
	}

	@Override
	public String toString() {
		return "Computadora [Marca =" + marca_compu + ", modelo =" + modelo_comp + ", precio = $"
				+ precio_compu + ", tamaño de disco=" + disco_compu + "]";
	}

}
