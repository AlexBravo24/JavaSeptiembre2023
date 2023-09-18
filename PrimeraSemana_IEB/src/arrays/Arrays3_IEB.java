package arrays;

import java.util.Scanner;

public class Arrays3_IEB {

	public static void main(String[] args) {
		/*
		 * 3. Pide al usuario por teclado una frase y pasa sus caracteres a un array de
		 * caracteres.
		 */

		Scanner scanner = new Scanner(System.in);

		System.out.print("Ingresa una frase: ");
		String frase = scanner.nextLine();

		char[] caracteres = new char[frase.length()];

		for (int i = 0; i < frase.length(); i++) {
			caracteres[i] = frase.charAt(i);
		}

		System.out.println("Los caracteres en la frase son:");
		for (int i = 0; i < caracteres.length; i++) {
			System.out.print("'"+caracteres[i] + "' ");
		}

		scanner.close();

	}

}
