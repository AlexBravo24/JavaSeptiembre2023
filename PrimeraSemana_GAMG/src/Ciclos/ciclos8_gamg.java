package Ciclos;

import java.util.Scanner;

public class ciclos8_gamg {

	public static void main(String[] args) {
		// Programa Java que lea dos n�meros y los muestre del menor al mayor.

		
		int numero1, numero2;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Ingrese dos n�meros: ");
		numero1 = entrada.nextInt();
		numero2 = entrada.nextInt();
		
		if (numero1<numero2) {
			for(int menor=numero1; menor<=numero2; menor++) {
				System.out.print( menor + " ");
			}
		} else 
			for(int menor=numero2; menor<=numero1; menor++) {
				System.out.print( menor + " ");
			}
	}

}
