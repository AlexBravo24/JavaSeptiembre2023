package condicionales;

import java.util.Scanner;

public class condicionales4_gamg {

	public static void main(String[] args) {
		// Realize un programa que lea una cadena por teclado y compruebe si es 
		//una letra mayúscula
		
		String cadena; 
		String cadena2;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduzca una cadena de texto");
		
		 cadena = entrada.next(); //Hola
		 entrada.close();
		 cadena2 = cadena.toLowerCase(); //hola
		 
		 if(cadena.equals(cadena2)) {
			 System.out.println("La cadena contiene minúsculas");
		 } else { 
			 System.out.println("La cadena contiene mayúsculas");
		 }
	}

}
