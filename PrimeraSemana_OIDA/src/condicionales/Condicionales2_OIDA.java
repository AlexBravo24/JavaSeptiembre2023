package condicionales;

import java.util.Scanner;

public class Condicionales2_OIDA {

	public static void main(String[] args) {
		//Ejercicio 2 Realiza un programa que pida un n�mero por teclado y nos indique si es par o impar.
		int numero1;
		Scanner entradadenumero = new Scanner(System.in);
		System.out.println("Introduce el n�mero");
		numero1 = entradadenumero.nextInt();
		int residuo = numero1%2;
		if (residuo == 0) {
			System.out.println("El n�mero que introdujo es par");
		}else {
			System.out.println("El n�mero que introdujo es impar");
		}
	}

}
