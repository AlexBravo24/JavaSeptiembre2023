package condicionales;

import java.util.Scanner;

public class condicionales2_gamg {

	public static void main(String[] args) {
		// Realiza un programa que pida un n�mero por teclado y nos indique si es par o impar
		
		int numero; //Se declara el n�mero como entero
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Escriba un n�mero entero:");
		
		numero = entrada.nextInt();
		
		if (numero%2==0) { //Se eval�a si el residuo al dividir el n�mero entre dos es cero
			System.out.println("El n�mero es par");
		} else {
			System.out.println("El numero es impar");
		}

	}
}

