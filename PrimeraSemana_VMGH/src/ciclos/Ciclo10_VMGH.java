package ciclos;

import java.util.Scanner;

public class Ciclo10_VMGH {

	public static void main(String[] args) {
//		// 10. Programa que lea 20 números e indique si son positivos o negativos y pares o 
//		impares y además muestre la sumatoria de los positivos y sumatoria de los impares.
		
		int nu;
		int nums = 20;
		int sumat = 0;
		int impar = 0;
		Scanner entrada = new Scanner(System.in);
		
		for (int i = 1; i <= nums; i++) {
			System.out.println("Favor de digitar el numero: " + i);
			nu = entrada.nextInt();
			
			if (nu > 0) {
				System.out.println("El numero " + i + " es positivo");
				sumat = sumat + nu;
			}else if (nu < 0) {
				System.out.println("El numero " + i + " es negativo");
			}else {
				System.out.println("El numero no es válido o es 0");
			}
			
			if (nu % 2 == 0) {
				System.out.println("El numero " + i + " es par");
			}else if (nu % 2 != 0) {
				System.out.println("El número " + i + "es impar");
				impar = impar + nu;
			}
			
		}
		
		System.out.println("La sumatoria de los números positivos es: " + sumat);
		System.out.println("La sumatoria de los números impares es: " + impar);
		
		entrada.close();
		
		

	}

}
