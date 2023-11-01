package Array;

import java.util.Scanner;

public class Problemario3EX1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);

	        // Crear un array de 10 posiciones
	        int[] numeros = new int[10];

	        // Pedir al usuario que ingrese los valores
	        for (int i = 0; i < 10; i++) {
	            System.out.print("Ingrese el valor para la posición " + i + ": ");
	            numeros[i] = scanner.nextInt();
	        }

	        // Mostrar el índice y el valor correspondiente
	        System.out.println("Índice\tValor");
	        for (int i = 0; i < 10; i++) {
	            System.out.println(i + "\t" + numeros[i]);
	        }

	        scanner.close();
	}

}
