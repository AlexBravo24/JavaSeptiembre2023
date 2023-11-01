package condicionales;

import java.util.Scanner;

public class Condicionales4_VMGH {

	public static void main(String[] args) {
		// 4. Realiza un programa que lea una cadena por teclado y compruebe si es una letra mayúscula.
		String cadena;
		System.out.println("Digite algo por favor: ");
		Scanner entrada = new Scanner(System.in);
		cadena = entrada.next();
		entrada.close();
		
		if (cadena.length() == 1 && Character.isUpperCase(cadena.charAt(0))) {
			
			System.out.println("La cadena ingresada es una letra mayuscula, la cuál es: " + cadena);
			
		} else {
			
			System.out.println("La cadena ingresada no es una letra mayuscula o no es una letra");

		}
		
	}

}
