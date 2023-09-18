package condicionales;

import java.util.Scanner;

public class Condiciolnales1_MARB {

	public static void main(String[] args) {
		
		//1. Realizar un programa que eciba dos numeros por teclado 
		//y que indique cual es mayor o si son iguales 
		
		int x1;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce el primer numero");
		x1 = entrada.nextInt();
		System.out.println("Introduce el segundo numero");
		int x2;
		x2 = entrada.nextInt();
		if (x1<x2) {
			System.out.println("El priemer numero es menor");
		}else  {
			System.out.println("El segundo numero es menor");
		}
		
			
		
	}

}
