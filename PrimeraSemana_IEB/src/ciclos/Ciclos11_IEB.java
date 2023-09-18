package ciclos;

import java.util.Scanner;

public class Ciclos11_IEB {
	public static void main(String[] args) {
		/*
		 * 11.Dibuja un cuadrado, como en la imagen que acompaña, introducir desde
		 * teclado el ancho y el alto. Ejemplo: 8 x 8
		 */

		Scanner scanner = new Scanner(System.in);

		System.out.print("Introduce el ancho del cuadrado: ");
		int ancho = scanner.nextInt();

		System.out.print("Introduce el alto del cuadrado: ");
		int alto = scanner.nextInt();

		for (int i = 1; i <= alto; i++) {
			for (int j = 1; j <= ancho; j++) {
				System.out.print("* ");
			}
			System.out.println(); // Cambio de línea al final de cada fila
		}

		scanner.close();
	}
}
