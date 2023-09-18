package condicionales;

import java.util.Scanner;

public class Condicionales4_AMCP {

	public static void main(String[] args) {
		
		
		// Realiza un programa que lea una cadena por teclado 
		//y compruebe si es una letra mayúscula.
		
		Scanner scanner = new Scanner (System.in); 
		String cadena;
		
		System.out.println("Este programa nos pide una cadena y comprueba si es una letra mayúscula.");
		System.out.print("Introduce la cadena que desees: ");
		cadena = scanner.nextLine();
		
		if (cadena.length() != 1) {
			System.out.println("La cadena no es una letra mayúscula");
		}else if ((cadena.compareTo("A") >= 0) && (cadena.compareTo("Z") <= 0)){
			System.out.println("La cadena es una letra mayúscula");
		}

	}

}
