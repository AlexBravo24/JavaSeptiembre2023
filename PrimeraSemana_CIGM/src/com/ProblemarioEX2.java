package com;

import java.util.Scanner;

public class ProblemarioEX2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("introduce un numero");
		numero = entrada.nextInt();
		if (numero % 2 == 0) {
            System.out.println(numero + " es un numero par");
        } else {
            System.out.println(numero + " es un numero impar ");
        }
		
		entrada.close();
	}

}
