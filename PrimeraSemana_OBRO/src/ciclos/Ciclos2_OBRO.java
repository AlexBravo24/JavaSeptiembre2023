package ciclos;

import java.util.Scanner;

public class Ciclos2_OBRO {

	public static void main(String[] args) {
		// Programa un algoritmo que realice la tabla de multiplicar de un numero introducido 
		//desde teclado, hasta la iteración deseada por el usuario. Ejemplo, tabla de 23 hasta el 95. 
		//23 x 95 = ???
		
		Scanner scanner = new Scanner(System.in);
		
		int tabla, numero;
		
		System.out.println("Introduzca el valor de la tabla de multiplicacion: ");
		tabla = scanner.nextInt();
		
		System.out.println("Introduzca el valor hasta el que se desee multiplicar: ");
		numero = scanner.nextInt();
		
		for (int i = 1; i <= numero; i++) {
			String formato = "%dx%d=%d";
			String linea = String.format(formato, tabla, i, tabla * i);
			System.out.println(linea);
			
		}

	}

}
