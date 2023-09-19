package ciclos;

import java.util.Scanner;

public class Ciclos11_EHG {

	public static void main(String[] args) {
		// .Dibuja un cuadrado, como en la imagen que acompaña, introducir desde teclado el 
		//ancho y el alto. Ejemplo: 8 x 8
		
		int valor;
		int fila;
		
		Scanner entrada = new Scanner(System.in);
		System.out.print("Ingrese valor: ");
		valor = entrada.nextInt();
		entrada.close();
		
		/* Usamos dos bucles anidados para crear el cuadrado.
		 * Si pensamos en el cuadrado como una tabla de asteriscos,
		 * el primer bucle crearía las FILAS
		 * y el segundo las COLUMNAS
		 */
		for (fila = 1; fila <= valor; fila++) {
			for (int columna = 1; columna <= valor; columna++) {
				System.out.print("* ");
			}
			System.out.println();//Salto de línea para pasar a la siguiente FILA
		}

	}

}
