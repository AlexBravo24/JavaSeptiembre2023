package ciclos;

import java.util.Scanner;

public class Ciclos3_IEB {
	public static void main(String[] args) {
		/*
		 * 3. Realiza un programa para determinar si un String es palíndromo.
		 */
		
		Scanner scanner = new Scanner(System.in);
        
        System.out.print("Introduce una cadena: ");
        String cadena = scanner.nextLine();
        
        int longitud = cadena.length();
        for (int i = 0; i < longitud / 2; i++) {
            if (cadena.charAt(i) != cadena.charAt(longitud - i - 1)) {
            	System.out.println("La cadena no es un palíndromo.");
            	scanner.close();
            	return;
            }
        }
        System.out.println("La cadena es un palíndromo.");
        
        scanner.close();
	}
}
