package arrays;

import java.util.Scanner;

public class Arrays3_MARB {

	public static void main(String[] args) {
		// Pide al usuario por teclado una frase y pasa sus caracteres a un array de 
		//caracteres.
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ingresa una frase:  ");
		String frase = scanner.nextLine();
		
		char[] caracteres = frase.toCharArray();
		System.out.println("Los caracteres son:");
		for(char caracter : caracteres) {
			System.out.println(caracter + "  ");
		}
		

	}

}
