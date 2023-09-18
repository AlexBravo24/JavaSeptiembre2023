package Ciclos;

import java.util.Scanner;

public class ciclos4_gamg {

	public static void main(String[] args) {
		// Programa que reciba una frase y una letra por teclado. Deberá retornar como resultado
		//cuántas veces existe esa letra dentro de la frase. Si no existe, imprimir un mensaje
		// "Caracter no encontrado"
		
		String frase; //Variables
		int conteo=0;
		char caracter,letra;
		
		Scanner entrada= new Scanner(System.in);
		
		System.out.println("Escriba una frase");
		frase = entrada.nextLine();
		System.out.println("Escriba una letra");
		letra = entrada.next().charAt(0);
		entrada.close();
		
		System.out.println(" Se debe encontrar la letra " + letra + " en la frase: " +frase);
		System.out.println(" La frase contiene: " + frase.length() + " letras");
			    	        
		//Buscar la letra en la frase
		
		for (int i=0; i<frase.length(); i++) {
			caracter = frase.charAt(i);
			if(letra==(caracter)) {
				conteo++;
			}
		}
		if(conteo>=1) {
			System.out.println("La letra " +letra + " aparece "+conteo+" veces en la frase");
		}	else {
			System.out.println("Caracter no encontrado");
		}
			
	}
		
		
		
	}

		
		
	
