package ciclos;

import java.util.Scanner;

public class Ciclo11_MARB {

	public static void main(String[] args) {
		// Dibuja un cuadrado, como en la imagen que acompaña, introducir desde teclado el 
		//ancho y el alto. Ejemplo: 8 x 8
		
		int valor;
		int fila;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingresa el valor: ");
		valor=entrada.nextInt();
		entrada.close();
		
		
		for (fila = 1; fila  <=valor;fila ++) {
			for (int columna = 1; columna <= valor; columna++) {
				System.out.print("*");
			}
	    	System.out.println();
		
		}

	}
}
