package com.persona;


public class Empleado extends Personas{
//clase hija
	//se realiza con la palabre reservada extends

	//herencias los atributos de persona
	//ya no es necesario agregarlos 
	//sin ebargo, podemos poner atributos
	//propios de esta clase si fueran necesario
	
	private String cargo_;
	private double salario;
	private String rfc_;
	public Empleado() {
		
	}
	public Empleado(String nombre_string, int edad_int, String genero_string, String email_string, String ciudad_string,
			String cargo_, double salario, String rfc_) {
		super(nombre_string, edad_int, genero_string, email_string, ciudad_string);
		this.cargo_ = cargo_;
		this.salario = salario;
		this.rfc_ = rfc_;
	}
	public String getCargo_() {
		return cargo_;
	}
	public void setCargo_(String cargo_) {
		this.cargo_ = cargo_;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public String getRfc_() {
		return rfc_;
	}
	public void setRfc_(String rfc_) {
		this.rfc_ = rfc_;
	}
	@Override
	public String toString() {
		return "Empleado [cargo_=" + cargo_ + ", salario=" + salario + ", rfc_=" + rfc_ + ", toString()="
				+ super.toString() + "]";
	}
	@Override
	public void caminarc() {
		// TODO Auto-generated method stub
		System.out.println("Caminando ...");
	}
	
}
