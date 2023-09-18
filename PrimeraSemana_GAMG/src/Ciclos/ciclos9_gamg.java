package Ciclos;

import java.util.Scanner;

public class ciclos9_gamg {

	public static void main(String[] args) {
		// Programa Java que lea dos números y muestre los números pares entre ellos

		
int numero1, numero2;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Ingrese dos números: ");
		numero1 = entrada.nextInt();
		numero2 = entrada.nextInt();
		
		if (numero1<numero2) {
			for(int menor=numero1; menor<=numero2; menor++) {
			
				if (menor%2==0) {
				System.out.print( menor + " ");
			}
		} } else 
			for(int menor=numero2; menor<=numero1; menor++) {
				if(menor%2==0) {
				System.out.print( menor + " ");
			}
	}}

}

