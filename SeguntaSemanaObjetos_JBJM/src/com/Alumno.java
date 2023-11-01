package com;

public class Alumno {
	private String nombre;
	private int NumControl;
	private String carrera;
	
	public Alumno() {
		
	}

	public Alumno(String nombre, int numControl, String carrera) {
		super();
		this.nombre = nombre;
		NumControl = numControl;
		this.carrera = carrera;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNumControl() {
		return NumControl;
	}

	public void setNumControl(int numControl) {
		NumControl = numControl;
	}

	public String getCarrera() {
		return carrera;
	}

	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}

	@Override
	public String toString() {
		return "Alumno [\n nombre=" + nombre + ", \n NumControl=" + NumControl + ",\n carrera=" + carrera + "]";
	}
	
	
	

}
