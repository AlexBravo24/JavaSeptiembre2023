package com;

public class Empleados {

	private String nombre;
	private String puesto;
	private int añoIngreso;
	private String departamento;
	private double salario;
	
	public Empleados() {
		
	}

	public Empleados(String nombre, String puesto, int añoIngreso, String departamento, double salario) {
		super();
		this.nombre = nombre;
		this.puesto = puesto;
		this.añoIngreso = añoIngreso;
		this.departamento = departamento;
		this.salario = salario;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPuesto() {
		return puesto;
	}

	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}

	public int getAñoIngreso() {
		return añoIngreso;
	}

	public void setAñoIngreso(int añoIngreso) {
		this.añoIngreso = añoIngreso;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	@Override
	public String toString() {
		return "Empleados [nombre=" + nombre + ", puesto=" + puesto + ", añoIngreso=" + añoIngreso + ", departamento="
				+ departamento + ", salario=" + salario + "]";
	}
	
	
	
}
