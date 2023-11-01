
package ciclos;

import java.util.Scanner;

public class Ciclo2_VMGH {

	public static void main(String[] args) {
//		// 2.- Programa un algoritmo que realice la tabla de multiplicar de un numero introducido 
//		desde teclado, hasta la iteración deseada por el usuario. Ejemplo, tabla de 23 hasta el 95. 
//		23 x 95 = ???
		
		int multiplicador, multiplicando;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Favor de escoger la tabla a multiplicar: ");
		multiplicador = entrada.nextInt();
		System.out.println("Favor de escoger hasta que numero se va a multiplicar la tabla: ");
		multiplicando = entrada.nextInt();
		System.out.println("La tabla del " + multiplicador + " es : ");
		for(int i = 1; i <= multiplicando; i++) {
			int resultado = multiplicador * i;
			System.out.println(resultado);
			
		}
		
		entrada.close();
		 

	}

}
