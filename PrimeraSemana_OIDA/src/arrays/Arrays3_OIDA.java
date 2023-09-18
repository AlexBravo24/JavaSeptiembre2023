package arrays;

import java.util.Scanner;

public class Arrays3_OIDA {

	public static void main(String[] args) {
		// Ejercicio 3 Pide al usuario por teclado una frase y pasa sus caracteres a un array de
		//caracteres
		
		String frase;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce la frase");
		frase = entrada.nextLine();
		entrada.close();
		char[] letras = frase.toCharArray();
//		for (int i = 0; i<frase.length()-1; i++) {
//			letras = frase.charAt(i);
//		}
		for (int i = 0; i <letras.length; i++) {
			System.out.println(letras[i]);
		}
	}

}
