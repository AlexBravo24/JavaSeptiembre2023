package condicionales;

import java.util.Scanner;

public class Condiciones2_MARB {

	public static void main(String[] args) {
		// Pida un numero por teclado y nos indique si es par o impar 
		
		int x1;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce el primer numero");
		x1 = entrada.nextInt();
		if (x1 % 2 == 0) {
			System.out.println("El numero es par");
		}else {
			System.out.println("el numero es impar");
		}
			

	}
}
