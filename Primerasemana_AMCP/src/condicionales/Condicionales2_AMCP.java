package condicionales;

import java.util.Scanner;

public class Condicionales2_AMCP {

	public static void main(String[] args) {
		
		
		//Realiza un programa que pida un n�mero por teclado y nos indique si es par o impar
		
		Scanner scanner = new Scanner (System.in);
		
		int numero;
		
		System.out.println("Este programa calcula si un n�mero es par o impar.");
		System.out.print("Introduce el n�mero:");
		numero = scanner.nextInt();
		
		if (numero % 2 == 0) {
			System.out.println("El n�mero, " +numero + " es par.");
		}else {
			System.out.println("El n�mero, " +numero + " es impar.");
		}

	}

}
