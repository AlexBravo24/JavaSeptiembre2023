package com;

import java.util.Scanner;

public class EntradaDatos {
	public static void main(String[] args) {
		int numero, numero2;

		Scanner scanner = new Scanner(System.in);

		System.out.print("Introduce un n�mero: ");
		numero = scanner.nextInt();

		System.out.println("El cuadrado de " + numero + " es: " + (numero * numero));

		System.out.print("Introduce otro n�mero: ");
		numero2 = scanner.nextInt();

		System.out.println("La suma del primer n�mero con el segundo es: " + (numero + numero2));

		scanner.close();

		/*
		 * Operador m�dulo: % Nos da el resultado del residuo de una divisi�n
		 */

		int n = 10;

		int resultado = n % 2;

		System.out.println(resultado);
	}
}
