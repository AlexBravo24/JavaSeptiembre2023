package condicionales;

import java.util.Scanner;

public class Condicionales1_AMCP {

	public static void main(String[] args) {
		
		//Realiza un programa que reciba dos n�meros
		//por teclado, e indique cual es mayor
		//o si son iguales
		
		Scanner scanner = new Scanner (System.in);
		
		int numero1;
		
		int numero2;
		
		System.out.println("Este programa pide dos n�meros y calcula cu�l es mayor.");
		System.out.print("Introduce el primer n�mero: ");
		numero1 = scanner.nextInt();
		System.out.print("Introduce el segundo n�mero: ");
		numero2 = scanner.nextInt();
		
		
		if (numero1 > numero2) {
			System.out.println("El primer n�mero" +numero1 + ", es mayor que el n�mero dos ," +numero2);
		}else if (numero1 < numero2) {
			System.out.println("El segundo n�mero" +numero2 + ", es mayor que el primero n�mero " +numero1);
		}else {
			System.out.println("Ambos n�meros son iguales, " +numero1);
		}
		

	}

}
