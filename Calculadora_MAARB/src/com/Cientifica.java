package com;

public class Cientifica extends Calculadora implements ITermometro {
	//Al heredar de Calculadora, aunque es una clase abstracta Calculadora 
	//no significa que no pueda hereda sus atributos y sus comportamientos 
	//(metodos)
	
	//Al heredar de una clase abstracta, si esta cuenta con metodos 
	//no definidos (abstractos), hay que definir 
	//en la clase que hereda ese codigo
	
	private String funciones;
	private String memoria;
	private String entradas;
	private int teclas;
	
	public Cientifica () {}

	public Cientifica(String funciones, String memoria, String entradas, int teclas) {
		super();
		this.funciones = funciones;
		this.memoria = memoria;
		this.entradas = entradas;
		this.teclas = teclas;
	}

	public String getFunciones() {
		return funciones;
	}

	public void setFunciones(String funciones) {
		this.funciones = funciones;
	}

	public String getMemoria() {
		return memoria;
	}

	public void setMemoria(String memoria) {
		this.memoria = memoria;
	}

	public String getEntradas() {
		return entradas;
	}

	public void setEntradas(String entradas) {
		this.entradas = entradas;
	}

	public int getTeclas() {
		return teclas;
	}

	public void setTeclas(int teclas) {
		this.teclas = teclas;
	}

	@Override
	public String toString() {
		return "Cientifica [funciones=" + funciones + ", memoria=" + memoria + ", entradas=" + entradas + ", teclas="
				+ teclas + "]";
	}
	
	

	@Override
	public void Suma(int numero1,int numero2) {
		// TODO Auto-generated method stub
		System.out.println("El resultado es: "+(numero1+numero2));
	}

	@Override
	public void Resta(int numero1,int numero2) {
		// TODO Auto-generated method stub
		System.out.println("El resultado es: "+(numero1-numero2));
	}

	@Override
	public void Multiplicacion(int numero1,int numero2) {
		// TODO Auto-generated method stub
		System.out.println("El resultado es: "+(numero1*numero2));
	}

	@Override
	public void Division(int numero1,int numero2) {
		// TODO Auto-generated method stub
		System.out.println("El resultado es: "+(numero1/numero2));
	}
	
	
    //Aqui implementamos el metodo de la interface ITermometro
	@Override
	public void tomarTemperatura() {
		System.out.println("La temperatura ambiente es 30 ºC");
		
		
	}
	
	//¿De donde adquieren o toman comportamientos una clase?
	//1. De 3 lugares 
	//1.- De metodos propios 
	//2.- De otros clases por herencia, incluyendo clases abstractas
	//3.- De interfaces 
	
	



		


}
