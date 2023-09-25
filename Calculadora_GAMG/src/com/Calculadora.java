package com;

public abstract class Calculadora {
	
	//Atributos de mi calculadora
	private String marca;
	private String modelo;
	
	//Método contructores
	public Calculadora() {}

	public Calculadora(String marca, String modelo) { 
		super();
		this.marca = marca;
		this.modelo = modelo;
	}

	//Getters y Setters
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	
	//Método toString
	@Override
	public String toString() {
		return "Calculadora [marca=" + marca + ", modelo=" + modelo + "]";
	}

	//Como quiero volver abstracta a mi clase Calculadora
	//Necesito por lo menos un método abstracto
	
	//Crear un método con retorno para sumar()
	//Si quiero crear un método con retorno, necesito indicar
	//el tipo de dato a retornar
	public abstract double sumar(double numero1, double numero2);
	
	//Declarar un método de restar() sin retorno de valor
	public abstract void restar(double numero1, double numero2);
	
	//Crear un método con un retorno para multiplicar
	public abstract double multiplicar(double numero1, double numero2);
	
	public abstract void dividir(double numero1, double numero2);
	

}
