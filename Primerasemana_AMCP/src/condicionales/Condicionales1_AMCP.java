package condicionales;

import java.util.Scanner;

public class Condicionales1_AMCP {

	public static void main(String[] args) {
		
		//Realiza un programa que reciba dos números
		//por teclado, e indique cual es mayor
		//o si son iguales
		
		Scanner scanner = new Scanner (System.in);
		
		int numero1;
		
		int numero2;
		
		System.out.println("Este programa pide dos números y calcula cuál es mayor.");
		System.out.print("Introduce el primer número: ");
		numero1 = scanner.nextInt();
		System.out.print("Introduce el segundo número: ");
		numero2 = scanner.nextInt();
		
		
		if (numero1 > numero2) {
			System.out.println("El primer número" +numero1 + ", es mayor que el número dos ," +numero2);
		}else if (numero1 < numero2) {
			System.out.println("El segundo número" +numero2 + ", es mayor que el primero número " +numero1);
		}else {
			System.out.println("Ambos números son iguales, " +numero1);
		}
		

	}

}
