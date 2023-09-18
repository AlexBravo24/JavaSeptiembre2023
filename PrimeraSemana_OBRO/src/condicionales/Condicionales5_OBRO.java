package condicionales;

import java.util.Scanner;

public class Condicionales5_OBRO {

	public static void main(String[] args) {
		/*Realiza un programa que calcule la aceptación de una solicitud en base a los siguientes 
		parámetros: edad, nota y sexo.
		 * Mínimo: Nota (5), edad (18), sexo M -> POSIBLE
		 * Mínimo: Nota (5), edad (18), sexo F -> ACEPTADA
		 * Otros casos -> NO ACEPTADA
		 */
		
		int nota, edad;
		String sexo;
		
		Scanner entrada1= new Scanner(System.in);
		System.out.println("Introduzca su nota");
		nota=entrada1.nextInt();
		
		
		Scanner entrada2= new Scanner(System.in);
		System.out.println("Introduzca su edad");
		edad=entrada2.nextInt();
		
		Scanner entrada3= new Scanner(System.in);
		System.out.println("Introduzca su sexo: M o F");
		sexo=entrada3.nextLine();
		
		if(!sexo.toUpperCase().equals("M") && !sexo.toUpperCase().equals("F")) {
			System.out.println("El valor es incorrecto");
			
		}else if ((nota>=5) && (edad>=18) && (sexo.toUpperCase().equals("M"))) {
			System.out.println("POSIBLE");
			
		}else if ((nota>=5) && (edad>=18) && (sexo.toUpperCase().equals("M"))) {
			System.out.println("POSIBLE");
			
	    }else {
	        System.out.println("NO ACEPTADA");
		
	    }
	}
	}
