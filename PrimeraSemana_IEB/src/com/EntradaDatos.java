package com;

import java.util.Scanner;

public class EntradaDatos {
	public static void main(String[] args) {
		int numero, numero2;

		Scanner scanner = new Scanner(System.in);

		System.out.print("Introduce un número: ");
		numero = scanner.nextInt();

		System.out.println("El cuadrado de " + numero + " es: " + (numero * numero));

		System.out.print("Introduce otro número: ");
		numero2 = scanner.nextInt();

		System.out.println("La suma del primer número con el segundo es: " + (numero + numero2));

		scanner.close();

		/*
		 * Operador módulo: % Nos da el resultado del residuo de una división
		 */

		int n = 10;

		int resultado = n % 2;

		System.out.println(resultado);
	}
}
