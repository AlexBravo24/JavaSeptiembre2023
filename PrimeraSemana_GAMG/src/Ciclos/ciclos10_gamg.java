package Ciclos;

import java.util.Scanner;

public class ciclos10_gamg {

	public static void main(String[] args) {
		// Programa que lea 20 n�meros e indique si son positivos o negativos 
		// y pares o impares y adem�s muestre la sumatoria de los positivos
		// y la sumatoria de los impares.
		
		
		int numero, cont_pares=0, cont_impares=0;
		int suma_pos=0, suma_impares=0;
		
		Scanner entrada = new Scanner(System.in);
		
		for(int i=1; i<=20; i++) {
			System.out.println("Ingrese un n�mero");
			numero = entrada.nextInt();
			
			if (numero%2==0) {
				System.out.println("El n�mero es par");
				
			} else {
				System.out.println("El n�mero es impar");
				suma_impares = suma_impares+numero;
			}
			if (numero>0) {
				System.out.println("El n�mero es positivo");
				suma_pos=suma_pos+numero;
			} else {
				System.out.println("El n�mero es negativo");
			  }
		}
		
		System.out.println("La sumatoria de los positivos es: " +suma_pos);
		System.out.println("La sumatoria de los impares es: " +suma_impares);
	}

}
