package com;

public class Empleado extends Persona {
	
	//Clase Hija - Herencia se realiza con la palabra reservada extends
	
	//Al heredar los atributos de persona ya no es necesario agregarlos
	//Sin embargo podemos poner atributos propios de esta clase, si fueran necesarios
	
	private String Cargo;
	private double Salario;
	private String RFC;
	
	public Empleado() {}

	public Empleado(String nombre, int edad, String genero, String email, String ciudad, String cargo, double salario,
			String rFC) {
		super(nombre, edad, genero, email, ciudad);
		Cargo = cargo;
		Salario = salario;
		RFC = rFC;
	}

	public String getCargo() {
		return Cargo;
	}

	public void setCargo(String cargo) {
		Cargo = cargo;
	}

	public double getSalario() {
		return Salario;
	}

	public void setSalario(double salario) {
		Salario = salario;
	}

	public String getRFC() {
		return RFC;
	}

	public void setRFC(String rFC) {
		RFC = rFC;
	}

	@Override
	public String toString() {
		return "Empleado [Cargo=" + Cargo + ", Salario=" + Salario + ", RFC=" + RFC + ", toString()=" + super.toString()
				+ "]";
	}

	//Cuando heredamos de una clase abstracta 
	//Las clases hijas se enecargaran de definir como se realizaran estas acciones
	//sobreescribiendo asi los metodos
	@Override
	public void caminar() {
		System.out.println("Caminando...");
		
	}
	
	
	

}
