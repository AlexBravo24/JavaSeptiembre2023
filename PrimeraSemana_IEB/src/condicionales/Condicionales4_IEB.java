package condicionales;

import java.util.Scanner;

public class Condicionales4_IEB {
	public static void main(String[] args) {
		/*
		 * 4. Realiza un programa que lea una cadena por teclado y compruebe si es una letra mayúscula.
		 */
		
		Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese una letra: ");
        String entrada = scanner.nextLine();
        
        if (entrada.length() == 1 && Character.isUpperCase(entrada.charAt(0))) {
            System.out.println("La entrada es una letra mayúscula.");
        } else {
            System.out.println("La entrada no es una letra mayúscula.");
        }
        
        scanner.close();
	}
}
