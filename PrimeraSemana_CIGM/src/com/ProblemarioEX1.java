package com;

import java.util.Scanner;

public class ProblemarioEX1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("introduce un numero");
		numero = entrada.nextInt();
		System.out.println("introduce otro numero");
		int numero2 = entrada.nextInt();
		
		  if (numero > numero2) {
	            System.out.println(numero + " es mayor que " + numero2);
	        } else if (numero < numero2) {
	            System.out.println(numero2 + " es mayor que " + numero);
	        } else {
	            System.out.println(numero + " y " + numero2 + " son iguales.");
	        }
		
		
		
		
		entrada.close();
		
		
		
	}

}
