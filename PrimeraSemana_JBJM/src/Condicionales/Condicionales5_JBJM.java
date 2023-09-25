package Condicionales;

import java.util.Scanner;

public class Condicionales5_JBJM {

	public static void main(String[] args) {
		// Realiza un programa que calcule la aceptación de una solicitud en base a los siguientes 
		/*parámetros: edad, nota y sexo.
		 *Mínimo: Nota (5), edad (18), sexo M -> POSIBLE
		 *Mínimo: Nota (5), edad (18), sexo F -> ACEPTADA
		 *Otros casos -> NO ACEPTADA
		 */
		Scanner scanner = new Scanner(System.in);
	    int nota;
	    int edad;
	    String sexo;
	// Solicitud de datos al usuario
	    System.out.println("Este programa calcula la aceptación de una solicitud"
	        + " en base a los siguientes parámetros:");
	    System.out.print("Edad: ");
	    edad = scanner.nextInt();
	    System.out.print("Nota: ");
	    nota = scanner.nextInt(); scanner.nextLine();
	    System.out.print("Sexo (M o F): ");
	    sexo = scanner.nextLine();
	    
	// Realizamos Cálculos y mostramos en pantalla
	    if (!sexo.toUpperCase().equals("M") && !sexo.toUpperCase().equals("F")) {
	      System.out.println("El valor de sexo introducido es incorrecto.\n"
	          + "por favor, reenvíe el formulario.");
	    } else if ((nota >= 5) && (edad >= 18) && (sexo.toUpperCase().equals("M"))) {
	      System.out.println("POSIBLE");
	    }else if ((nota >= 5) && (edad >= 18) && (sexo.toUpperCase().equals("F"))) {
	       System.out.println("ACEPTADA");
	    }else {
	        System.out.println("NO ACEPTADA");
	    }
		

	}

}
