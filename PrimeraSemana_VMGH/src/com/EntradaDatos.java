package com;

import java.util.Scanner;

public class EntradaDatos {

	public static void main(String[] args) {
		// Entrada de Datos
		//Introducir Datos por teclado
		
		int numero, numero2;
		Scanner entrada = new Scanner(System.in);
		//Scanner nos permite introducir valores por teclado
		System.out.println("Introduce el primer número: ");
		numero = entrada.nextInt();
		System.out.println("El cuadrado de " + numero + " es: " + (numero*numero));
		System.out.println("Introduce el segundo número: ");
		numero2 = entrada.nextInt();
		
		//Cerramos la función Scanner para dejar de consumir memoria
		System.out.println("La suma de los dos valores es de: " + (numero + numero2));
		
		int num2;
		System.out.println("Introduce un segundo número");
		num2 = entrada.nextInt();
		int res = (numero + num2);
		System.out.println("La suma del numero 1 y 2 es: " + res);
		entrada.close();

	}

}
