package Condicionales;

import java.util.Scanner;

public class Condicionales1_JBJM {

	public static void main(String[] args) {
		
		//  1. Realiza....
		// Inicio del programa y declaración de variables:
		
		    Scanner scanner = new Scanner (System.in);
		    int numero1;
		    int numero2;
	
		    System.out.println("Pide dos números y calcula cual es mayor.");
		    System.out.print("Introduce el primer número: ");
		    numero1 = scanner.nextInt();
		    System.out.print("Introduce el segundo número: ");
		    numero2 = scanner.nextInt();
		    
		// Realizamos Cálculos y mostramos en pantalla
		    
		    if (numero1 > numero2){
		        System.out.println("El primer número, " +numero1 + ", es mayor que el número dos," +numero2);
		    }else if (numero1 < numero2){
		        System.out.println("El segundo número, " +numero2 + ", es mayor que el primer número " +numero1);
		    }else {
		        System.out.println("Ambos números son iguales, " +numero1);	

		    }
	}
}


