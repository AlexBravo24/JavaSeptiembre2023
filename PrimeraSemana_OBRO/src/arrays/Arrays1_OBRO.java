package arrays;

import java.util.Scanner;

public class Arrays1_OBRO {

	public static void main(String[] args) {
		// Crea un array de 10 posiciones de números con valores pedidos por teclado.
		//Muestra por consola el índice y el valor al que corresponde.
		
		Scanner entrada = new Scanner(System.in);
		int [] numeros = new int [10];
		
		System.out.println("Ingrese 10 numeros para guardar en el Array");
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Numero[" + i + "]=");
			numeros[i] = entrada.nextInt();
			
		}
		for (int i = 0; i < numeros.length; i++) {
				System.out.print(numeros[i]+", ");
			}

		}
}
