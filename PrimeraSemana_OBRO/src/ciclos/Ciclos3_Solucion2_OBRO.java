package ciclos;

import java.util.Scanner;

public class Ciclos3_Solucion2_OBRO {

	public static void main(String[] args) {
		// Realiza un programa para determinar si un String es palíndromo.
		
		//Declaramos una variable donde guardar nuestro String
  		String palindromo;
  
  		//Declarar un Scanner para introducir un String por teclado
 		Scanner entrada = new Scanner(System.in);
 
 		//Una manera de resolver este jercicio, seria comparando el String original, contra el mismo, pero armado en reversa
		String reversa= "";
		
		//Solicito ingresar la palabra original
		 System.out.println("Ingrese una palabra o frase");
		 palindromo = entrada.nextLine();
		 entrada.close();
		
		//Proceso para armar la reversa, utilizamos un ciclo
		 //Mientras esta variable tenga un valor que sea mayor o igual a "0"
		 //Decrementamos i...
		
		for (int i = palindromo.length()-1; i >=0; i--) {
			//Armamos nuestro String reversa
			//alo
			reversa = reversa + palindromo.charAt(i);
			//"" = "" + "a"
			//"a" = "a" + "1"
			
		}
		System.out.println("Original: " + palindromo);
		System.out.println("Reversa: " + reversa.replace(" ", ""));
		if(palindromo.replace(" ", "").equalsIgnoreCase(reversa.replace(" ", ""))){
			System.out.println("Es palindromo");
		}else {
			System.out.println("No es palindromo");
		}

	}

}
