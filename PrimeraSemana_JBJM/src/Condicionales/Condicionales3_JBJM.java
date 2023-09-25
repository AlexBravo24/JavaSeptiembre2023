package Condicionales;

import java.util.Scanner;

public class Condicionales3_JBJM {

	public static void main(String[] args) {
		// Crea un programa que pida al usuario dos números y muestre el resultado de su división. Si el
		//segundo número es 0, debe mostrar un mensaje de error.
		
		
		Scanner scanner = new Scanner (System.in);
	    int numerador;
	    int denominador;
	    
	// Solicitud de datos al usuario
	    System.out.println("Este programa muestra la division entre dos números enteros:");
	    System.out.print("Introduce el primer número: ");
	    numerador = scanner.nextInt();
	    System.out.print("Introduce el segundo número: ");
	    denominador = scanner.nextInt();
	    
	// Realizamos Cálculos y mostramos en pantalla
	    if (denominador != 0){
	        System.out.println((double)numerador/(double)denominador);
	    }else {
	        System.out.println("El segundo número introducido es 0. "
	            + "Introduzca un valor válido.");
	    }  
	}

}
