package condicionales;

import java.util.Scanner;

public class Condicionales3_AMCP {

	public static void main(String[] args) {
		
		
		//Crea un programa que pida al usuario dos n�meros y muestre 
		//el resultado de su divisi�n. Si el  segundo n�mero es
		//0, debe mostrar un mensaje de error.
		
		Scanner scanner = new Scanner (System.in);
		
		int numerador;
		int denominador; 
		
		System.out.println("Este programa muestra la divisi�n entre los dos n�meros enteros.");
		System.out.print("Introduce el primer n�mero: ");
		numerador = scanner.nextInt();
		System.out.print("Introduce el segundo n�mero: ");
		denominador = scanner.nextInt();
		
		if (denominador != 0) {
			System.out.println((double)numerador/(double)denominador);
		}else {
			System.out.println("El segundo n�mero introducido es 0. " 
					+ "Reinicie el programa e introduzca un valor v�lido.");
		}

	}

}
