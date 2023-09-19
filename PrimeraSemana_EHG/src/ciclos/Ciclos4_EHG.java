package ciclos;

import java.util.Scanner;

public class Ciclos4_EHG {

	public static void main(String[] args) {
		// Programa que reciba una frase y una letra por teclado. Deberá retornar como resultado 
		//cuántas veces existe esa letra dentro de la frase. Si no existe, imprimir un mensaje 
		//“Carácter no encontrado”.
		
		String frase;
		String letra;
		int contador = 0;
		
		System.out.println("INTRODUZCA UNA FRASE");
		Scanner entrada = new Scanner (System.in);
		frase = entrada.nextLine();
		
		System.out.println("INTRODUZCA UNA LETRA");
		letra = entrada.next();
		entrada.close();
		
		for(int i = 0; i < frase.length(); i++) {
			if(frase.charAt(i) == letra.charAt(0)) {
				contador ++;
			}
		}
		if(contador != 0) {
			System.out.println("La letra( " + letra.charAt(0) + " )se repite " + contador + " veces");
			
		}else {
			System.out.println("CARACTER NO ENCONTRADO");
		}
	}

}
