package com;

public class Empleado extends Persona {
	
	//Clase Hija - HERENCIA
	//Se realiza con la palabra reservada "extends"
	//Al heredar los atributos de Persona
	//ya no es necesario agregarlos
	//Sin embargo, podemos poner atributos
	//propios de esta clase, si fueran 
	//necesarios
	
	private String cargo;
	private double salario;
	private String rfc;
	
	public Empleado() { }

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

	//Cuando heredamos de una clase abstracta
	//Las clases hijas se encargarán de definir cómo se realizarán 
	//estas acciones, sobreescribiendo así los métodos
	@Override
	public void caminar() { //Este es un método o comportamiento
		//adquirido de mi clase abstracta
		System.out.println("Caminando...");
		
	}
	
	

}
