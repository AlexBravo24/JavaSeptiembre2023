package ciclos;

import java.util.Scanner;

public class Ciclos4_OBRO {

	public static void main(String[] args) {
		// Programa que reciba una frase y una letra por teclado. Deberá retornar como resultado 
		//cuántas veces existe esa letra dentro de la frase. Si no existe, imprimir un mensaje 
		//“Carácter no encontrado”.
		
		int i=0, c=0;
		
	Scanner sc = new Scanner(System.in);
	System.out.println("Ingrese el texto:");
	String s = sc.nextLine().toLowerCase();
	System.out.println("Ingrese el caracter: ");
	char r = sc.nextLine().toLowerCase().charAt(i);
	while(i < s.length()) {
		if(s.charAt(i) == r) {
			c++;
		}
		i++;
	
	}
	System.out.println("El texto tiene: " + c + " caracteres");

	}
	}
