package ciclos;

import java.util.Scanner;

public class Ciclos2_OIDA {

	public static void main(String[] args) {
		// Ejercicio 2 Programa un algoritmo que realice la tabla de multiplicar de un numero introducido
//		desde teclado, hasta la iteración deseada por el usuario. Ejemplo, tabla de 23 hasta el 95.
//		23 x 95 = ???
		int x;
		int y;
		int z=1;
		Scanner entrada = new Scanner(System.in);
		System.out.println("¿Que numero quieres que te de la tabla?");
		x= entrada.nextInt();
		System.out.println("¿Hasta que numero quieres multiplicarlo?");
		y= entrada.nextInt();
		entrada.close();
		for(int i=0; i<y; i++) {
			System.out.println(x + " x " + z + " es igual a " + (x*z));
			z++;
		}
	}

}
