package ciclos;

import java.util.Scanner;

public class Ciclos3_JBJM {

	public static void main(String[] args) {
		
		// Palindromo
		

			//3. Realiza un programa para 
			//determinar si un String es palíndromo
			//Declaramos una variable donde guardar nuestro String
			String palindromo; //Hola
			//Declarar un Scanner para introducir ese String por teclado
			Scanner entrada = new Scanner(System.in);
			//Una manera de resolver este ejercicio, sería comparando
			//el String original, contra el mismo, pero armado en reversa
			String reversa = ""; //aloH
			//Solicito ingresar la palabra original (palindromo)
			System.out.println("Ingresa una palabra o frase");
			palindromo=entrada.nextLine();
			entrada.close();
			//Proceso para armar la reversa, utilizamos un ciclo
			// variable i= Longitud del String - 1, para acceder a la ultima posicion
			//Mientras esta variable tenga un valor que sea mayor o igual a "0"
			//Decrementamos i...
			for (int i = palindromo.length()-1; i >=0; i--) {
				//Armamos nuestro String reversa
				//aloH
				reversa = reversa + palindromo.charAt(i);
				//"" = "" + "a"
				//"a" = "a"+"l"
			}
			System.out.println("Original: " + palindromo.replace(" ", ""));
			System.out.println("Reversa: " + reversa.replace(" ", ""));
			
			if(palindromo.replace(" ", "").equalsIgnoreCase(reversa.replace(" ", ""))) {
				System.out.println("Es palindromo");
			}else {
				System.out.println("No es palindromo");
			}
		}
     
}
