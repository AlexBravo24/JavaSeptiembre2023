package ciclos;

import java.util.Scanner;

public class Ciclos3_MARB {

	public static void main(String[] args) {
		//  Realiza un programa para determinar si un String es palíndromo
		
		//Declaramos una variable donde guardar el string 
		
		String palindromo;
		
		//declarar un scanner para introducir ese string por teclado 
		
		Scanner entrada = new Scanner(System.in);
		
		//Una manera de resolver este ejercicio 
		 
		String reversa = "";
		//Solicito ingresar la palabra original (palindromo)
		System.out.println("Ingresa una palabra o frase");
		palindromo=entrada.nextLine();
		entrada.close();
	    //Proceso para armar la revesa, utilizamos un ciclo 
		
		//variable i= Longitud de strin -1 para acceder a la ultima posicion
		//Mientras esta variabe tenga un valor mayor o igual a "0"
		//Decrementamos i....
		for (int i = palindromo.length()-1; i >=0; i--) {
			//Armamos nuestro strin reversa
			
			reversa = reversa + palindromo.charAt(i);
		}
		System.out.println("Reversa: "+ reversa);
		
		if(palindromo.replace("", "").equalsIgnoreCase(reversa.replace("",""))) {
			System.out.println("Es palindromo");
		}else {
			System.out.println("No es palindrimo");
		}

	}

}
