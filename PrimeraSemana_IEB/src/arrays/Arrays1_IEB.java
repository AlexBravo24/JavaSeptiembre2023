package arrays;

import java.util.Scanner;

public class Arrays1_IEB {

	public static void main(String[] args) {
		/*
		 * 1. Crea un array de 10 posiciones de n�meros con valores pedidos por teclado.
		 * Muestra por consola el �ndice y el valor al que corresponde.
		 */

		Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[10];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingresa un n�mero para la posici�n " + i + ": ");
            numeros[i] = scanner.nextInt();
        }

        System.out.println("�ndice\tValor");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(i + "\t" + numeros[i]);
        }

        scanner.close();
		
	}

}
