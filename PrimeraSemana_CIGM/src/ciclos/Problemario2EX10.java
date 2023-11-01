package ciclos;

import java.util.Scanner;

public class Problemario2EX10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);

	        int cantidadNumeros = 20;
	        int numero;
	        int sumatoriaPositivos = 0;
	        int sumatoriaImpares = 0;

	        for (int i = 0; i < cantidadNumeros; i++) {
	            System.out.print("Ingrese el número #" + (i + 1) + ": ");
	            numero = scanner.nextInt();

	            if (numero > 0) {
	                System.out.println("El número es positivo.");
	                sumatoriaPositivos += numero;
	            } else if (numero < 0) {
	                System.out.println("El número es negativo.");
	            } else {
	                System.out.println("El número es cero.");
	            }

	            if (numero % 2 == 0) {
	                System.out.println("El número es par.");
	            } else {
	                System.out.println("El número es impar.");
	                sumatoriaImpares += numero;
	            }
	        }

	        System.out.println("Sumatoria de números positivos: " + sumatoriaPositivos);
	        System.out.println("Sumatoria de números impares: " + sumatoriaImpares);

	        scanner.close();
	}

}
