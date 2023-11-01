package com;

public class EstructurasCondicionales {

	public static void main(String[] args) {
		// Estructuras de decisi�n
		// Si la condici�n se cumple, ese ejecuta el bloque de c�digo y si no, se
		// ejecuta otro bloque

		int x = 9;

		if (x <= 9) {
			System.out.println("S� se cumple");
		} else {
			System.out.println("No se cumple");
		}

		// AND: &&
		if (x < 9 && x > 0) {
			System.out.println("S� se cumple");
		} else {
			System.out.println("No se cumple");
		}

		// OR: ||
		if (x < 9 || x > 0) {
			System.out.println("S� se cumple");
		} else {
			System.out.println("No se cumple");
		}

		// Igualdad: ==
		if (x == 15) {
			System.out.println("S� se cumple");
		} else {
			System.out.println("No se cumple");
		}

		// NOT: !
		if (!(x == 9)) {
			System.out.println("S� se cumple");
		} else {
			System.out.println("No se cumple");
		}

		// Diferente de: !=
		if (x != 11) {
			System.out.println("S� se cumple");
		} else {
			System.out.println("No se cumple");
		}
	}

}
