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
	            System.out.print("Ingrese el n�mero #" + (i + 1) + ": ");
	            numero = scanner.nextInt();

	            if (numero > 0) {
	                System.out.println("El n�mero es positivo.");
	                sumatoriaPositivos += numero;
	            } else if (numero < 0) {
	                System.out.println("El n�mero es negativo.");
	            } else {
	                System.out.println("El n�mero es cero.");
	            }

	            if (numero % 2 == 0) {
	                System.out.println("El n�mero es par.");
	            } else {
	                System.out.println("El n�mero es impar.");
	                sumatoriaImpares += numero;
	            }
	        }

	        System.out.println("Sumatoria de n�meros positivos: " + sumatoriaPositivos);
	        System.out.println("Sumatoria de n�meros impares: " + sumatoriaImpares);

	        scanner.close();
	}

}
