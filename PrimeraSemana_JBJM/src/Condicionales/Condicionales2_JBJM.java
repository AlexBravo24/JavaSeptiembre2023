package Condicionales;

import java.util.Scanner;

public class Condicionales2_JBJM {

	public static void main(String[] args) {
		// Realiza un programa que pida un n�mero por teclado y nos 
		//indique si es par o impar
		
		Scanner scanner = new Scanner (System.in);
	    int numero;
	// Solicitamos los datos al usuario en este caso numeros
	    System.out.println("Este programa calcula si un n�mero es par o impar.");
	    System.out.print("Introduce el n�mero: ");
	    numero = scanner.nextInt();
	    
	// Realizamos C�lculos y mostramos en pantalla
	    if (numero % 2 == 0){
	        System.out.println("El n�mero, " +numero + " es par.");
	    }else {
	        System.out.println("El n�mero " +numero + " es impar.");
	    }
	}

}
