package condicionales;

import java.util.Scanner;

public class Condicionales3_AMCP {

	public static void main(String[] args) {
		
		
		//Crea un programa que pida al usuario dos números y muestre 
		//el resultado de su división. Si el  segundo número es
		//0, debe mostrar un mensaje de error.
		
		Scanner scanner = new Scanner (System.in);
		
		int numerador;
		int denominador; 
		
		System.out.println("Este programa muestra la división entre los dos números enteros.");
		System.out.print("Introduce el primer número: ");
		numerador = scanner.nextInt();
		System.out.print("Introduce el segundo número: ");
		denominador = scanner.nextInt();
		
		if (denominador != 0) {
			System.out.println((double)numerador/(double)denominador);
		}else {
			System.out.println("El segundo número introducido es 0. " 
					+ "Reinicie el programa e introduzca un valor válido.");
		}

	}

}
