package condicionales;

import java.util.Scanner;

public class Condicionales2_AMCP {

	public static void main(String[] args) {
		
		
		//Realiza un programa que pida un número por teclado y nos indique si es par o impar
		
		Scanner scanner = new Scanner (System.in);
		
		int numero;
		
		System.out.println("Este programa calcula si un número es par o impar.");
		System.out.print("Introduce el número:");
		numero = scanner.nextInt();
		
		if (numero % 2 == 0) {
			System.out.println("El número, " +numero + " es par.");
		}else {
			System.out.println("El número, " +numero + " es impar.");
		}

	}

}
