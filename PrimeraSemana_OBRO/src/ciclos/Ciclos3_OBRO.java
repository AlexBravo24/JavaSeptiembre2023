package ciclos;

import java.util.Scanner;

public class Ciclos3_OBRO {

	public static void main(String[] args) {
		// Realiza un programa para determinar si un String es palíndromo
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Comprobacion de palindromos");
		System.out.println("Introduzca la palabra a evaluar");
		String cadena = scanner.nextLine();
		
		System.out.println(esPalindromo(cadena));
	}
	
	public static boolean esPalindromo(String cadena) {
		boolean sw = true;
	
		cadena=cadena.replace(" ", "");
		
		for(int i= 0; i < cadena.length()/2; i++) {
			if(cadena.charAt(i) == cadena.charAt(cadena.length()-1-i)) {
				sw=false;
				break;
			}
		}
		return sw;
	}

}



  		
		
