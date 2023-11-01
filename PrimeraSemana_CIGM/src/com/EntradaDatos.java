package com;

import java.util.Scanner;

public class EntradaDatos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numero;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("introduce un numero");
		numero = entrada.nextInt();
		System.out.println("introduce otro numero");
		int numero2 = entrada.nextInt();
		entrada.close();
		System.out.println("la suma del primer numero con el segundo es:" + (numero+numero2));
		
		int n = 10;
		int resultado = n / 3;
		System.out.println(resultado);
	}

}
