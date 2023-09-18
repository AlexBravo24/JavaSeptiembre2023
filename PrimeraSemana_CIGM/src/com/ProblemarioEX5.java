package com;

import java.util.Scanner;

public class ProblemarioEX5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);

	        System.out.print("Ingrese la edad: ");
	        int edad = scanner.nextInt();

	        System.out.print("Ingrese la nota: ");
	        double nota = scanner.nextDouble();

	        System.out.print("Ingrese el sexo (M/F): ");
	        char sexo = scanner.next().charAt(0);

	        if (nota >= 5 && edad >= 18) {
	            if (sexo == 'M') {
	                System.out.println("POSIBLE");
	            } else if (sexo == 'F') {
	                System.out.println("ACEPTADA");
	            } else {
	                System.out.println("NO ACEPTADO");
	            }
	        } else {
	            System.out.println("NO ACEPTADO");
	        }

	        scanner.close();
	}

}
