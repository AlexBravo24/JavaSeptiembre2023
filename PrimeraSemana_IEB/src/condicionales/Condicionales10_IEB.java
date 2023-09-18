package condicionales;

import java.util.Scanner;

public class Condicionales10_IEB {
	public static void main(String[] args) {
		/*
		10.Realiza un programa que pida un número entero entre uno y doce e imprima el número de días que tiene el
		mes correspondiente.
		 */
		
		Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número entre 1 y 12 para representar un mes: ");
        int numeroMes = scanner.nextInt();

        int diasEnMes = 0;

        switch (numeroMes) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                diasEnMes = 31;
                break;
            case 4: case 6: case 9: case 11:
                diasEnMes = 30;
                break;
            case 2:
                diasEnMes = 28;
                break;
            default:
                System.out.println("ERROR: Número incorrecto. Debe estar entre 1 y 12.");
                scanner.close();
                return;
        }

        System.out.println("El mes " + numeroMes + " tiene " + diasEnMes + " días.");

        scanner.close();
	}
}
