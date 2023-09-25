package com;

public class Jugador extends Futbolista{
	
	private String posicion;
	private double salario;
	private String fichaTecnica;
	
	
	public Jugador () {}


	public Jugador(String nombre, int edad, String genero, String ciudad, String posicion, double salario,
			String fichaTecnica) {
		super(nombre, edad, genero, ciudad);
		this.posicion = posicion;
		this.salario = salario;
		this.fichaTecnica = fichaTecnica;
	}


	public String getPosicion() {
		return posicion;
	}


	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}


	public double getSalario() {
		return salario;
	}


	public void setSalario(double salario) {
		this.salario = salario;
	}


	public String getFichaTecnica() {
		return fichaTecnica;
	}


	public void setFichaTecnica(String fichaTecnica) {
		this.fichaTecnica = fichaTecnica;
	}


	@Override
	public String toString() {
		return "Jugador  posicion= " + posicion + ",\nsalario= " + salario + ", \nfichaTecnica= " + fichaTecnica
				+ ", toString()= " + super.toString() + " ";
	}
	
	
	

}
