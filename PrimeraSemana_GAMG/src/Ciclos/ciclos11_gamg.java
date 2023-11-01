package Ciclos;

import java.util.Scanner;

public class ciclos11_gamg {

	public static void main(String[] args) {
		// Dibujar un cuadro utilizando "*" teniendo como entrada el número de filas y columnas
		// Introducir desde el teclado el ancho y el alto
//		
//		Scanner entrada = new Scanner (System.in);
//		
//		int ancho, alto, fila;
//				
//		System.out.println("Indicar el alto");
//		alto = entrada.nextInt();
//		System.out.println("Indicar el ancho");
//		ancho = entrada.nextInt();
		
		int valor, fila;
		Scanner entrada = new Scanner (System.in);
		System.out.println("Indicar el valor");
		valor=entrada.nextInt();
		entrada.close();
		
		//Usar dos bucles anidados para crear el cuadrado. 
		//Si pensamos  en el cuadrado como una tabla de asteriscos
		//El primer bucle crearia las filas
		//El segundo las columnas
		
		for(fila=1;fila<=valor;fila++) {
			for (int columna=1; columna<=valor; columna++) {
				System.out.print("* ");
			}
			System.out.println(); //Salto de fila
		}

	}
}
