package arrays;

import java.util.Scanner;

public class Arrays1_VMGH {

	public static void main(String[] args) {
//		// 1. Crea un array de 10 posiciones de n�meros con valores pedidos por teclado.
//		Muestra por consola el �ndice y el valor al que corresponde.
		
		int [] nums = new int [10];
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingresar 10 n�meros por teclado: ");
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Introducir el n�mero " + (i + 1));
			nums [i] = entrada.nextInt();
		}
		
		for (int i = 0; i < 10; i++) {
			System.out.println("El n�mero " + (i + 1) + " es: " + nums [i]);
		}
		
		entrada.close();
		
	}

}
