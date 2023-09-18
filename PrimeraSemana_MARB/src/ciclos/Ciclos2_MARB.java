package ciclos;

import java.util.Scanner;

public class Ciclos2_MARB {

	public static void main(String[] args) {
		// Programa un algoritmo que realice la tabla de multiplicar de un numero introducido 
		//desde teclado, hasta la iteración deseada 
		//por el usuario. Ejemplo, tabla de 23 hasta el 95. 23 x 95 = ???
		
		int x1;
		int x2;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce el numero de la tabla de multiplicar");
		x1 = entrada.nextInt();
		System.out.println("Hasta que numero lo requieres ? introduce");
		x2 = entrada.nextInt();
		
		for (int i = 1; i <=x2; i++) {
			System.out.println( x1+"X"+ i + " = "+"  " + i*x1 + " ");
		}	
		
	

	}

}
