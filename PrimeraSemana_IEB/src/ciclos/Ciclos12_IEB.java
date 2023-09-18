package ciclos;

import java.util.Scanner;

public class Ciclos12_IEB {
	public static void main(String[] args) {
		/*
		 * 12.Se ingresan un conjunto de n edades de personas por teclado. El programa
		 * finalizara cuando el promedio de las edades sea superior a 25.
		 */

		Scanner scanner = new Scanner(System.in);

		int sumaEdades = 0;
		int contadorEdades = 0;

		while (true) {
			System.out.print("Ingresa una edad: ");
			int edad = scanner.nextInt();

			sumaEdades += edad;
			contadorEdades++;

			double promedioEdades = (double) sumaEdades / contadorEdades;

			System.out.println("Promedio actual de las " + contadorEdades + " edades registradas: " + promedioEdades);

			if (promedioEdades > 25) {
				System.out.println("El programa se detuvo porque el promedio es superior a 25.");
				break;
			}
		}

		scanner.close();

	}
}
