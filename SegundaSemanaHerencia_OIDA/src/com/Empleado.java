package com;

public class Empleado extends Persona{

	//Clase hija - Herencia 
	
	//se realiza con la palabra reservada extends "nombre de la clase padre"
	
	//al heredar los atributos de persona, ya no es necesario agregarlos 
	//sin embargo podemos poner atributos propios de esta clase si fueran necesarios
	
	
	private String cargo;
	private double salario;
	private String rfc;
	
	public Empleado() {
		
		
	}

	public Empleado(String nombre, int edad, String genero, String email, String ciudad, String cargo, double salario,
			String rfc) {
		super(nombre, edad, genero, email, ciudad);
		this.cargo = cargo;
		this.salario = salario;
		this.rfc = rfc;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getRfc() {
		return rfc;
	}

	public void setRfc(String rfc) {
		this.rfc = rfc;
	}

	@Override
	public String toString() {
		return "Empleado [cargo=" + cargo + ", salario=" + salario + ", rfc=" + rfc + ", toString()=" + super.toString()
				+ "]";
	}

	//cuando heredamos de una clase abstracta, las clases hijas se encargaran de definir como se realizaran estas acciones 
	//sobreescribiendo asi los metodos
	@Override
	public void caminar() {
		System.out.println("Caminando");
		
	}
	
	
	
	
}
