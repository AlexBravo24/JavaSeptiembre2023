package ciclos;

import java.util.Scanner;

public class Ciclos8_IEB {
	public static void main(String[] args) {
		/*
		 * 8. Programa Java que lea dos números y muestre los números desde el menor
		 * hasta el mayor
		 */

		Scanner scanner = new Scanner(System.in);

		System.out.print("Introduce el primer número: ");
		int numero1 = scanner.nextInt();

		System.out.print("Introduce el segundo número: ");
		int numero2 = scanner.nextInt();

		int numeroMenor, numeroMayor;

		if (numero1 <= numero2) {
			numeroMenor = numero1;
			numeroMayor = numero2;
		} else {
			numeroMenor = numero2;
			numeroMayor = numero1;
		}

		System.out.println("Números en el rango desde " + numeroMenor + " hasta " + numeroMayor + ":");

		for (int i = numeroMenor; i <= numeroMayor; i++) {
			System.out.println(i);
		}

		scanner.close();
	}
}
