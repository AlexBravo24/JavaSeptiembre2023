package com.TablaMultiplicar;

import java.util.Iterator;
import java.util.Scanner;

public class TablaDeMultiplicar {
//- Programa un algoritmo que realice la tabla de multiplicar del 12
	public void multiplicacion(int size, int value) {
		int operacion = 0;
		for (int i = 0; i <= size; i++) {
			System.err.println(value + " * " + i + " = " + value * i);
		}
		System.out.println(" ");
		while (operacion < size) {
			operacion += 1;
			System.out.println(value + " * " + operacion + " = " + (value * operacion));
		}
	}

	// Ejercicios 2
	/*
	 * Programa un algoritmo que realice la tabla de multiplicar de un numero
	 * introducido desde teclado, hasta la iteración deseada por el usuario.
	 * Ejemplo, tabla de 23 hasta el 95. 23 x 95 = ???
	 */
	public void multiplicacionDeIteracion() {
		System.err.println("*** Tabla de multiplicación de iteracion que desea el usuario ***");
		Scanner entradScanner = new Scanner(System.in);
		System.out.println(" Ingresa el primer valor donde desea iniciar ");
		int value = entradScanner.nextInt();
		System.out.println(" Ingresa el segundo valor donde desea finalizar");
		int value1 = entradScanner.nextInt();
		if (value1 > value) {
			for (int i = value; i <= value1; i++) {
				System.out.println(value + " * " + i + " = " + (value * i));
			}
		} else {
			System.err.println("El valor " + value1 + " tiene que ser mayor que " + value);
		}

	}

	// Realiza un programa para determinar si un String es palíndromo
	public String Palindromo(String palabra) {
		String textoString = palabra.toUpperCase();
		char datCharacter;
		String acumulador = "";
		for (int i = textoString.length() - 1; i >= 0; i--) {
			datCharacter = textoString.charAt(i);
			acumulador += datCharacter;
		}
		// System.err.println(acumulador);
		// System.err.println(textoString);
		return acumulador.equals(textoString) ? "Es un palidromo" : "No es un palindromo";
	}

	// Dibuja un cuadrado, como en la imagen que acompaña, introducir desde teclado
	// el
	// ancho y el alto. Ejemplo: 8 x 8 un triangulo va dismunulledo i
	public void Cuadrado(int value) {
		for (int i = 0; i < value; i++) {
			for (int j = 0; j < i; j++) {
				System.err.print("*");
			}
			System.err.println("");
			System.err.println("");
		}
		System.out.println(" ");
		for (int i = 0; i < value; i++) {
			for (int j = 0; j < value; j++) {
				System.err.print("*");
			}
			System.err.println("");
		}
	}
	
}