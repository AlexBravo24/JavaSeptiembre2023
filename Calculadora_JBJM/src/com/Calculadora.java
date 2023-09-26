package com;

public abstract class Calculadora {
	
	//Atributos de mi calculadora 

	private String marca;
	private String color;
	
	//Metodos constructores
	
	public Calculadora () {}

	public Calculadora(String marca, String color) {
		super();
		this.marca = marca;
		this.color = color;
	}

	//Getters  Setters
	
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Calculadora [marca=" + marca + ", color=" + color + "]";
	}
	
	//Como quiero volver abstracta ami clase Calculadora 
	// Necesito por lo menos un metodo abstracto
	
	//Crear un metodo con retorno, para sumar ()
	//Si quiero crear un metodo con retorno necesito indicar 
	//el tipo de dato a retornar
	
	public abstract int sumar(int a, int b); 
	
	//Declarar un metodo restar () sin retorno de valor
	
	public abstract void restar(int a, int b);
	
	//Crear un metodo con retorno para multlipicar() 
	public abstract double multiplicar (double a, double b);
	
	public abstract double division (double a, double b);
	

	
	
	
	
	

	

	
	


}

