package arrays;

import java.util.Scanner;

public class Arrays3_EHG {

	public static void main(String[] args) {
		// Pide al usuario por teclado una frase y pasa sus caracteres a un array de 
		// caracteres
		
		Scanner entrada = new Scanner (System.in);
		
		String frase;
		
		System.out.println("Ingrese la frase: ");
		frase = entrada.nextLine();
		
		char [] caracteres = frase.toCharArray();
		for (int i = 0; i < caracteres.length; i++) {
			System.out.println("Caracter contenido: " + caracteres[i]);
			
		}
		

	}

}
