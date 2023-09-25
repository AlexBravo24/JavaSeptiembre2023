package com;

public class Alumno {

	private String nombre;
	private String carrera;
	private int matricula;
	private int semestre;
	private int anoIngreso;
	
	public Alumno() {
		
	}

	public Alumno(String nombre, String carrera, int matricula, int semestre, int anoIngreso) {
		super();
		this.nombre = nombre;
		this.carrera = carrera;
		this.matricula = matricula;
		this.semestre = semestre;
		this.anoIngreso = anoIngreso;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCarrera() {
		return carrera;
	}

	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public int getSemestre() {
		return semestre;
	}

	public void setSemestre(int semestre) {
		this.semestre = semestre;
	}

	public int getAnoIngreso() {
		return anoIngreso;
	}

	public void setAnoIngreso(int anoIngreso) {
		this.anoIngreso = anoIngreso;
	}

	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + ", carrera=" + carrera + ", matricula=" + matricula + ", semestre="
				+ semestre + ", anoIngreso=" + anoIngreso + "]";
	}
	
	
}
