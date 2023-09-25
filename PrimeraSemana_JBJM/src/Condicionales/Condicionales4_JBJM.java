package Condicionales;

import java.util.Scanner;

public class Condicionales4_JBJM {

	public static void main(String[] args) {
		
		
		// Realiza un programa que lea una cadena por teclado y compruebe si es una letra mayúscula
		
		String cadena;
		String cadena2;
		
		Scanner scanner = new Scanner (System.in);
	   
	    
	// Solicitud de datos al usuario
	    
	    System.out.println("Introduce una cadena");
	    System.out.print("Introduce la cadena que desees: ");
	    cadena = scanner.nextLine();
	    
	// Realizamos Cálculos y mostramos en pantalla
	    
	    if (cadena.length() != 1){
	      System.out.println("La cadena no es una letra mayúscula");
	      
	// }else if ((cadena > "A") && (cadena < "Z")) {
	   
	    }else if ((cadena.compareTo("A") >= 0) && (cadena.compareTo("Z")<=0)) {
	       System.out.println("La cadena es una letra mayúscula.");
	    }else {
	        System.out.println("La cadena no es una letra mayúscula.");
	    }

	}

}
