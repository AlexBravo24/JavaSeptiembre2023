package ciclos;

import java.util.Scanner;

public class Ciclos11_OIDA {

	public static void main(String[] args) {
		// Ejercicio 11 Dibuja un cuadrado, como en la imagen que acompaña, introducir desde teclado el
		//ancho y el alto. Ejemplo: 8 x 8 
		int primervalor;
		int segundovalor;
		Scanner entrada= new Scanner(System.in);
		System.out.println("Ingrese el primer valor");
		primervalor=entrada.nextInt();
		System.out.println("Ingrese el segundo valor");
		segundovalor=entrada.nextInt();
		entrada.close();
		// columnas 5      filas 5
		
		for(int filas=1; filas<=segundovalor; filas++) {
			for(int columnas = 1; columnas<=primervalor; columnas++) {
				System.out.print("* ");  //notar la diferencia de usar el print con el println. el primero es para no saltar de pagina y escribir sobre la misma linea
			}
			System.out.println();
		}
	}

}
