package ciclos;

import java.util.Scanner;

public class Ciclos10_IEB {
	public static void main(String[] args) {
		/*
		 * 10. Programa que lea 20 n�meros e indique si son positivos o negativos y
		 * pares o impares y adem�s muestre la sumatoria de los positivos y sumatoria de
		 * los impares.
		 */

		Scanner scanner = new Scanner(System.in);

		int cantidadNumeros = 20;
		int sumaPositivos = 0;
		int sumaImpares = 0;

		for (int i = 1; i <= cantidadNumeros; i++) {
			System.out.print("Introduce el n�mero " + i + ": ");
			int numero = scanner.nextInt();

			// Verificar si es positivo o negativo
			if (numero > 0) {
				System.out.println("El n�mero es positivo.");
				sumaPositivos += numero;
			} else if (numero < 0) {
				System.out.println("El n�mero es negativo.");
			} else {
				System.out.println("El n�mero es cero.");
			}

			// Verificar si es par o impar
			if (numero % 2 == 0) {
				System.out.println("El n�mero es par.");
			} else {
				System.out.println("El n�mero es impar.");
				sumaImpares += numero;
			}
		}

		System.out.println("Suma de n�meros positivos: " + sumaPositivos);
		System.out.println("Suma de n�meros impares: " + sumaImpares);

		scanner.close();
	}
}
