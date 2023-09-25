package com;

import java.util.Scanner;

public class Cientifica extends Calculadora implements ITermometro, ITelevisor {
	
	private int operando1;
	private int operando2;
	private int resultado;
	
	@Override
	public void suma () {
		Scanner entrada = new Scanner (System.in);
		System.out.println("Introduce valor para la suma: ");
		operando1 = entrada.nextInt();
		System.out.println("Introduce segundo valor para la suma");
		operando2 = entrada.nextInt();
		
		resultado = operando1 + operando2;
		System.out.println("Tu resultado es: " + resultado);
	}
	@Override
	public void resta () {
		Scanner entrada = new Scanner (System.in);
		System.out.println("Introduce valor para la resta: ");
		operando1 = entrada.nextInt();
		System.out.println("Introduce segundo valor para la resta");
		operando2 = entrada.nextInt();
		
		resultado = operando1 - operando2;
		System.out.println("Tu resultado es: " + resultado);
		
	}
	@Override
	public void multiplicacion () {
		Scanner entrada = new Scanner (System.in);
		System.out.println("Introduce valor para la multiplicacion: ");
		operando1 = entrada.nextInt();
		System.out.println("Introduce segundo valor para la multiplicacion");
		operando2 = entrada.nextInt();
		
		resultado = operando1 * operando2;
		System.out.println("Tu resultado es: " + resultado);
		
	}
	@Override
	public void division () {
		Scanner entrada = new Scanner (System.in);
		System.out.println("Introduce valor para la division: ");
		operando1 = entrada.nextInt();
		System.out.println("Introduce segundo valor para la division");
		operando2 = entrada.nextInt();
		
		resultado = (operando1) / (operando2);
		System.out.println("Tu resultado es: " + resultado);
		entrada.close();
	}
	//Aqui implementamos el metodo de la interface ITermometro
	@Override
	public void tomarTemperatura() {
		System.out.println("La temperatura ambiente es 30°C");
		//¿De donde adquieren o toman comportamientos una clase?
		//De 3 lugares
		//1. de metodos propios
		//2. de otras clases por herencia, incluyendo clases abstractas
		//3.DE interfaces
		
	}
	//Ejemplo de un metodo implementado de una interface
	//Una clase puede implementar una o mas intefaces
	@Override
	public void verTV() {
		
		
	}
	
	
	
	
	

}
