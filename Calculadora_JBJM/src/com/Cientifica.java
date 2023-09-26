package com;

public class Cientifica extends Calculadora implements ITermometro, ITelevision{
	
	//A esta para generarle sus constructores, getters y setters 
	//puede declararle por lo menos un atributo
	//(metodos)
	//Al heredar de una clase abstracta, si esta cuenta con metodos
	//no definidos (abstractos), hay que definir COMO SE VAN A HACER,
	//en la clase que hereda ese codigo 
	
	//A esta clase para generarle sus contructores, getters y setters
	//puedo declararle por lo menos un atributo 
	
	private boolean celdaSolar;

	public Cientifica() {}

	public Cientifica(String marca, String color, boolean celdaSolar) {
		super(marca, color);
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
		return "Cientifica [celdaSolar=" + celdaSolar + "]";
	}

	//Metodos heredados de la clase Calculadora 
	
	@Override
	public int sumar(int a, int b) {
		
		return a+b;
	}

	@Override
	public void restar(int a, int b) {
		//int resultado=a-b; 
		System.out.println(a-b);
		
	}

	@Override
	public double multiplicar(double a, double b) {
		// TODO Auto-generated method stub
		return a*b;
	}
	
	public double division (double a, double b) {
		
		return a/b;
	}

	//Aqui implementamos el metodo de la interfaxe ITermometro
	
	@Override
	public void tomarTemperatura() {
		System.out.println("La Temperatura ambiente es 30 °C");
		
	}
	

	//Ejemplo de un metodo implementos de otras interfaces 
	@Override
	public void verTV() {
		// TODO Auto-generated method stub
		
	}
	
	//Una clase implements una o mas interfaces 
	
	//De donde adquieres o toman comportamientos una clase?
	//De 3 lugares:
	/*1. De metodos propios
	 * 2.De otras clases por herencia, incluyendo clases abstractas
	 * 3.De interfaces
	 */
	
	
	
	
	
	 
}
