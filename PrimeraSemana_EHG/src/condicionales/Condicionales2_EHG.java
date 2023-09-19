package condicionales;

import java.util.Scanner;

public class Condicionales2_EHG {

	public static void main(String[] args) {
		// .Realiza un programa que pida un número por teclado y nos indique si es par o impar
		
		int num;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce un numero");
		num = entrada.nextInt();
		entrada.close();
		
		if (num % 2==0) {
			System.out.println("El numero es par");
		}else {
			System.out.println("El numero es impar");
		}

	}

}
