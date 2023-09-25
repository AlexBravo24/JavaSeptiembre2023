package ciclos;

import java.util.Scanner;

public class Ciclos11_JBJM {

	public static void main(String[] args) {
		// Dibuja un cuadrado, como en la imagen que acompa�a, introducir desde teclado el 
		// ancho y el alto. Ejemplo: 8 x 8
		
		Scanner teclado = new Scanner(System.in);
		System.out.print("Ingrese el ancho o el alto: ");
		int valor = teclado.nextInt();
		teclado.close();
		
		/*
		 * Usamos dos bucles anidados para crear el cuadrado.
		 * Si pensamos en el cuadrado como una tabla de asteriscos,
		 * el primer bucle crear�a las FILAS
		 * y el segundo las COLUMNAS
		 */
		for (int fila = 1; fila <= valor; fila++) {
			for (int columna = 1; columna <= valor; columna++)
				System.out.print("*");
			
			System.out.println();//Salto de l�nea para pasar a la siguiente FILA
		}

		
	}

}
