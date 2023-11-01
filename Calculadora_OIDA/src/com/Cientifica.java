package com;

import java.util.Scanner;

public class Cientifica extends Calculadora implements ITermometro{

	
	
	private String tama�o;
	
	public Cientifica() {
		
	}
	
	public Cientifica(String tama�o) {
		super();
		this.tama�o = tama�o;
	}
	
	
	

	public String getTama�o() {
		return tama�o;
	}

	public void setTama�o(String tama�o) {
		this.tama�o = tama�o;
	}

	
	
	@Override
	public String toString() {
		return "Cientifica [tama�o=" + tama�o + ", toString()=" + super.toString() + "]";
	}

	
	

	//El public void resta inicialmente puede funcionar asi 
	@Override
	public void resta() {
		int numero1;
		int numero2;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce el primero numero");
		numero1= entrada.nextInt();
		System.out.println("Introduce el segundo numero");
		numero2= entrada.nextInt();
		System.out.println("El resultado de la resta es: " + (numero1-numero2));
		entrada.close();
	}
	
	//este public void resta con argumentos fue agregado despues del original (digo original porque el metodo abstracto est� sin argumentos en la clase padre)
	
	public void resta(double numero1, double numero2) {
		System.out.println("El resultado de la resta es: " + (numero1-numero2));
	}

	@Override
	public void multiplicacion() {
		
		int numero1;
		int numero2;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce el primero numero");
		numero1= entrada.nextInt();
		System.out.println("Introduce el segundo numero");
		numero2= entrada.nextInt();
		System.out.println("El resultado de la multiplicacion es: " + (numero1*numero2));
		entrada.close();
		
	}
	public void multiplicacion(double numero1, double numero2) {
		System.out.println("El resultado de la multiplicacion es: " + (numero1*numero2));
	}

	@Override
	public void division() {
		int numero1;
		int numero2;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce el primero numero");
		numero1= entrada.nextInt();
		System.out.println("Introduce el segundo numero");
		numero2= entrada.nextInt();
		System.out.println("El resultado de la division es: " + (numero1/numero2));
		entrada.close();
	}
	public void division(double numero1, double numero2) {
		System.out.println("El resultado de la division es: " + (numero1/numero2));
	}

	@Override
	public void suma() {
		int numero1;
		int numero2;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce el primero numero");
		numero1= entrada.nextInt();
		System.out.println("Introduce el segundo numero");
		numero2= entrada.nextInt();
		System.out.println("El resultado de la suma es: " + (numero1+numero2));
		entrada.close();
	}
	public void suma(double numero1, double numero2) {
		System.out.println("El resultado de la suma es: " + (numero1+numero2));
	}

	@Override
	public void tomarTemperatura() {
		System.out.println("La temperatura ambiente es 30�C");
		
	}
	
	//de donde toma comportamiento una clase 
	
	
}
