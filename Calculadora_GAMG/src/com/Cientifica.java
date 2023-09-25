package com;

public class Cientifica extends Calculadora implements ITermometro, ITelevisor {
	//Al heredar de Calculadora, aunque es una clase abstracta Calculadora
	//no significa que no pueda heredar sus atributos y sus comportamientos.
	//(m�todos)
	//Al heredar de una clase abstracta, si esta cuenta con m�todos 
	//no definidos (abstractos), hay que definir c�mo se van a hacer, 
	//en la clase que hereda ese c�digo
	
	//A esta clase, para generarle sus constructores, getters y setters
	//puedo declararle por lo menos un atributo
	
	private boolean celdaSolar;
	
	public Cientifica () {}
	
	public Cientifica(String marca, String modelo, boolean celdaSolar) {
		super(marca, modelo);
		this.celdaSolar = celdaSolar;
	}

	public boolean isCeldaSolar() {
		return celdaSolar;
	}

	public void setCeldaSolar(boolean celdaSolar) {
		this.celdaSolar = celdaSolar;
	}

		
	
	@Override
	public String toString() {
		return "Cientifica [celdaSolar=" + celdaSolar + ", toString()=" + super.toString() + "]";
	}

	@Override
	public double sumar(double numero1, double numero2) {
		return numero1+numero2;
	}

	@Override
	public void restar(double numero1, double numero2) {
		//double resultado = numero1-numero2;
		System.out.println("La resta es: "+ (numero1-numero2));
	}

	@Override
	public double multiplicar(double numero1, double numero2) {
		return numero1*numero2;
	}

	@Override
	public void dividir(double numero1, double numero2) {
		System.out.println("La division es: "+ (numero1 / numero2));
	}

	//Aqu� implementamos el m�todo de la interface ITermometro
	@Override
	public void tomarTemperatura() {
		System.out.println("La temperatura ambiente es de 30�C");
		
	}

	//Ejemplo de un m�todo implementado de otra interfase ITelevisor
	@Override
	public void verTV() {
	}

	//Una clase puede implementar una o m�s interfases
	
	//�De d�nde adquieren o tomar comportamientos una clase?
	//De 3 lugares: 
	//1. De m�todos propios
	//2. De otras clases por herencia, incluyendo clases abstractas
	//3. De interfases
	
}

