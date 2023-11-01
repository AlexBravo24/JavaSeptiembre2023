package ciclos;

import java.util.Scanner;

public class Ciclo3_VMGH {

	public static void main(String[] args) {
		// 3. Realiza un programa para determinar si un String es palíndromo. 
		
		String cadena;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Favor de introducir una palabra o frase: ");
		cadena = entrada.nextLine().toLowerCase().replace(" ", "");
		String palind = new StringBuilder(cadena).reverse().toString();
		
		if (cadena.equals(palind)) {
			System.out.println("La cadena es palindromo");
		}else {
			System.out.println("La cadena no es un palindromo");
		}
		
		entrada.close();

	}

}
