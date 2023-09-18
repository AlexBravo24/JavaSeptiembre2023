package arrays;

import java.util.Scanner;

public class Arrays3_OBRO {

	public static void main(String[] args) {
		// Pide al usuario por teclado una frase y pasa sus caracteres a un array de 
		//caracteres.

		Scanner entrada = new Scanner(System.in);
		String frase;
		
		System.out.println("Ingrese la frase a guardar en el Array: ");
		frase = entrada.nextLine();
		
		char [] caracteres = frase.toCharArray();
		for (int i = 0; i < caracteres.length; i++) {
			System.out.println("Cracter contenido en el array; "+ caracteres[i]);
			
		}

	}

}
