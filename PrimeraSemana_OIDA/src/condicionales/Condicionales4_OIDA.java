package condicionales;

import java.util.Scanner;

public class Condicionales4_OIDA {

	public static void main(String[] args) {
		// Ejercicio 4 Realiza un programa que lea una cadena por teclado y compruebe si es una letra mayúscula.
		char letra;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce una letra");
		letra = entrada.next().charAt(0);   //quize guardar una letra en una variable char, lo cual se debe poner la parte "entrada.next().charAt(0);" que indica que se puede tomar una letra del teclado para guardarla en una variable char
		entrada.close();
		System.out.println(letra);
		if (Character.isUpperCase(letra)) {
			System.out.println("La letra es Mayuscula");
		}else {
			System.out.println("La letra es Minuscula");
		}
		
	}

}
