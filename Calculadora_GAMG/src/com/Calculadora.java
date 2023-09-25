package com;

public abstract class Calculadora {
	
	//Atributos de mi calculadora
	private String marca;
	private String modelo;
	
	//M�todo contructores
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

	
	//M�todo toString
	@Override
	public String toString() {
		return "Calculadora [marca=" + marca + ", modelo=" + modelo + "]";
	}

	//Como quiero volver abstracta a mi clase Calculadora
	//Necesito por lo menos un m�todo abstracto
	
	//Crear un m�todo con retorno para sumar()
	//Si quiero crear un m�todo con retorno, necesito indicar
	//el tipo de dato a retornar
	public abstract double sumar(double numero1, double numero2);
	
	//Declarar un m�todo de restar() sin retorno de valor
	public abstract void restar(double numero1, double numero2);
	
	//Crear un m�todo con un retorno para multiplicar
	public abstract double multiplicar(double numero1, double numero2);
	
	public abstract void dividir(double numero1, double numero2);
	

}
