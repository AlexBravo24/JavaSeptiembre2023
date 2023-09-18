package condicionales;

import java.util.Scanner;

public class Condicionales2_OBRO {

	public static void main(String[] args) {
		// Realiza un programa que pida un número por teclado y nos indique si es par o impar.
		
		int numero;
		
		Scanner entrada=new Scanner(System.in);
		System.out.println("Dijite un numero");
		numero=entrada.nextInt();

		if(numero %2==0) {
			System.out.println("El numero " + numero+ " es Par");
		}else {
			System.out.println("El numero "+numero+" es Impar");
		}
		
		
		
		
		


	}

}
