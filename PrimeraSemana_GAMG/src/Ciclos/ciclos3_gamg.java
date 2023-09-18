package Ciclos;

import java.util.Scanner;

public class ciclos3_gamg {

	public static void main(String[] args) {
		// Realiza un programa para determinar si un string es palíndromo
		
		
		//Declaramos una variable donde guardar nuestro String
		String palindromo;  //Hola
						
		//Declarar un Scanner para introducir ese String por teclado
		Scanner entrada = new Scanner(System.in);
		
		//Una manera de resolver este ejercicio, seria comparando 
		//el String original contra el mimso, pero armado en reversa
		
		String reversa = "";  // aloH Es necesario inicializar la variable para poder meterla a un ciclo
		
		//Solicitar ingresar la palabra original
		
		System.out.println("Ingresa una palabra o frase");
		palindromo =entrada.nextLine();
		entrada.close();
		
	 	//Proceso para armar la reversa, utilizamos un ciclo
		//Variable i= longitud del string - 1, para acceder a la última posicion
		//Mientras la variable tenga el valor mayor o igual a cero
		//Decrementamos la posicion para que 
		for(int i=palindromo.length()-1; i>=0; i--) {
			//Armamos nuestro string reversa
			reversa = reversa + palindromo.charAt(i);
			
		}
		
		//Imprimimos para comprobar que se cree la palabra en reversa
		System.out.println("Original: " +palindromo.replace(" ", ""));
		System.out.println("Reversa: " + reversa.replace(" ", ""));
		
		if (palindromo.replace(" ", "").equalsIgnoreCase(reversa.replace(" ", ""))) {
			System.out.println("Es palindromo");
		} else {
			System.out.println("No es palindromo");
		}
	
		}
	}


	


