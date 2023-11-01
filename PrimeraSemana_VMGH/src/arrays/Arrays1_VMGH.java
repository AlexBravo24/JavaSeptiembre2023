package arrays;

import java.util.Scanner;

public class Arrays1_VMGH {

	public static void main(String[] args) {
//		// 1. Crea un array de 10 posiciones de números con valores pedidos por teclado.
//		Muestra por consola el índice y el valor al que corresponde.
		
		int [] nums = new int [10];
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingresar 10 números por teclado: ");
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Introducir el número " + (i + 1));
			nums [i] = entrada.nextInt();
		}
		
		for (int i = 0; i < 10; i++) {
			System.out.println("El número " + (i + 1) + " es: " + nums [i]);
		}
		
		entrada.close();
		
	}

}
