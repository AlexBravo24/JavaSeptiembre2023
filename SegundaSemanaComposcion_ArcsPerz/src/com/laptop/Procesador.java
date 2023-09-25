package com.laptop;

public class Procesador {
	private String fabricante;
	private String modeloString;
	private double frecuencia;

	public Procesador() {
		super();
	}

	public Procesador(String fabricante, String modeloString, double frecuencia) {
		super();
		this.fabricante = fabricante;
		this.modeloString = modeloString;
		this.frecuencia = frecuencia;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public String getModeloString() {
		return modeloString;
	}

	public void setModeloString(String modeloString) {
		this.modeloString = modeloString;
	}

	public double getFrecuencia() {
		return frecuencia;
	}

	public void setFrecuencia(double frecuencia) {
		this.frecuencia = frecuencia;
	}

	@Override
	public String toString() {
		return "Procesador [fabricante=" + fabricante + ", modeloString=" + modeloString + ", frecuencia=" + frecuencia
				+ "]";
	}

}
