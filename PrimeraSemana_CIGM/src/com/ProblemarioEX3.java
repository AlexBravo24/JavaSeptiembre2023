package com;

import java.util.Scanner;

public class ProblemarioEX3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double numero;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("introduce un numero");
		numero = entrada.nextInt();
		System.out.println("introduce otro numero");
		double numero2 = entrada.nextInt();
		
		
		 if (numero2 == 0) {
	            System.out.println("Error: No se puede dividir por 0.");
	        } else {
	            double resultado = numero / numero2;
	            System.out.println("El resultado de la división es: " + resultado);
	        }
		
		
		entrada.close();
	}

}
