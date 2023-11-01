package condicionales;

import java.util.Scanner;

public class condicionales2_gamg {

	public static void main(String[] args) {
		// Realiza un programa que pida un número por teclado y nos indique si es par o impar
		
		int numero; //Se declara el número como entero
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Escriba un número entero:");
		
		numero = entrada.nextInt();
		
		if (numero%2==0) { //Se evalúa si el residuo al dividir el número entre dos es cero
			System.out.println("El número es par");
		} else {
			System.out.println("El numero es impar");
		}

	}
}

