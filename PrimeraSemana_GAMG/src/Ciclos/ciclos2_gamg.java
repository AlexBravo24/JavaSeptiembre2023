package Ciclos;

import java.util.Scanner;

public class ciclos2_gamg {

	public static void main(String[] args) {
		// Programa un algoritmo que realice la tabla de multiplicar de un número
		// introducido desde teclado, hasta la iteración deseada por el usuario. 
		// Ejemplo; tabla de 23 hasta el 95. 23X95 ==?
		
		int numero1, numero2, resultado, i=1; 
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Indique qué tabla de multiplicar desea");
		numero1 = entrada.nextInt();
		System.out.println("Hasta que número desea saber el valor"); 
		numero2 = entrada.nextInt();
		
		do {
		resultado = numero1 * i;	
		System.out.println(numero1 + " x " + i + " = " + resultado);
		i++;
		} while (i<=numero2);
		

	}

}
