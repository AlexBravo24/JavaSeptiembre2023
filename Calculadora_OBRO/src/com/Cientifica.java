package com;

import java.util.Scanner;

public class Cientifica extends Calculadora implements ITermometro,  ITelevisor {
	
	private String operaciones;
	
	public Cientifica() {}


	public Cientifica(String marca, String color, String modelo, String operaciones) {
		super(marca, color, modelo);
		this.operaciones = operaciones;
	}


	public String getOperaciones() {
		return operaciones;
	}


	public void setOperaciones(String operaciones) {
		this.operaciones = operaciones;
	}


	@Override
	public String toString() {
		return super.toString() +"Operaciones que incluye [operaciones=" + operaciones + "]";
	}
	
	

	@Override
	public void Suma() {
		int valor1;
		int valor2;
		int resta;
		System.out.println("SUMA");
		Scanner entrada2 = new Scanner(System.in);
		System.out.println("Introduce el primer valor:");
		valor1=entrada2.nextInt();
		
		System.out.println("Introduce el segundo valor:");
		valor2=entrada2.nextInt();
		resta=valor1+valor2;
		entrada2.close();
		
		System.out.println("La suma de los dos valores es: " + resta);
		
	}


	@Override
	public void Resta() {
		int valor3;
		int valor4;
		int resta;
		
		System.out.println("RESTA");
		Scanner entrada2 = new Scanner(System.in);
		System.out.println("Introduce el primer valor:");
		valor3=entrada2.nextInt();
		
		System.out.println("Introduce el segundo valor:");
		valor4=entrada2.nextInt();
		resta=valor3-valor4;
		entrada2.close();
		
		System.out.println("La resta de los dos valores es: " + resta);
	}


	@Override
	public void Multiplicacion() {
		int valor5;
		int valor6;
		int multiplicacion;
		
		System.out.println("MULTIPLICACION");
		Scanner entrada3 = new Scanner(System.in);
		System.out.println("Introduce el primer valor:");
		valor5=entrada3.nextInt();
		
		System.out.println("Introduce el segundo valor:");
		valor6=entrada3.nextInt();
		multiplicacion=valor5*valor6;
		entrada3.close();
		
		System.out.println("La multiplicacion de los dos valores es: " + multiplicacion);
		
	}


	@Override
	public void Division() {
		int valor7;
		int valor8;
		double division;
		
		System.out.println("DIVISION");
		Scanner entrada4 = new Scanner(System.in);
		System.out.println("Introduce el primer valor:");
		valor7=entrada4.nextInt();
		
		System.out.println("Introduce el segundo valor:");
		valor8=entrada4.nextInt();
		division=valor7/valor8;
		entrada4.close();
		
		System.out.println("La division de los dos valores es: " + division);
		
	}

////////////METODO DEL PROFESOR
	
	@Override
	public int sumar(int a, int b) {
		return a+b;
	}


	@Override
	public void restar(int a, int b) {
		int resultado=a-b;
		System.out.println(resultado);
	}


	@Override
	public double multiplicar(double a, double b) {
		
		return (a*b);
	}

///////////////////////////////////////
	//Aqui implementamos el metodo de la interface ITermometro
	
	@Override
	public void tomarTemperatura() {
		System.out.println("La temperatura ambiente es 30°C");
		
	}


	//Ejemplo de un metodo implementado de otra interface ITelevisor
	@Override
	public void verTV() {
		// TODO Auto-generated method stub
	
	}
	//Una clase puede implementar una o mas interfaces
	
	//¿De donde adquiereen o toman comportamientos una clase?
	//De tres lugares 
	//1. Metodos propios. 
	//2. De otras clases por herencia incluyendo clases abstractas
	//3. De interfaces
	
	
	
	




	
	
	

}
