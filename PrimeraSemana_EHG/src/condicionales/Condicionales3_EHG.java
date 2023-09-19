package condicionales;

import java.util.Scanner;

public class Condicionales3_EHG {

	public static void main(String[] args) {
		// Crea un programa que pida al usuario dos números y muestre el resultado de su división. Si el 
		//segundo número es 0, debe mostrar un mensaje de Error.
		
		int num1, num2;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce un numero");
		num1 = entrada.nextInt();
		
		System.out.println("Introduce el segundo numero");
		num2 = entrada.nextInt();
		entrada.close();
		
		if (num2 != 0) {
			System.out.println("El resultado es: " + num1 / num2 );
		}else {
			System.out.println("El segundo numero introducio es 0, " + "Introduzca valor valido");
		}
	}

}
