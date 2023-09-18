package condicionales;

import java.util.Scanner;

public class condicionales3_gamg {

	public static void main(String[] args) {
		// Crear un programa que pida al usuario dos números y muestre el resultado de 
		// su división. Si el segundo número es "cero", debe mostrar un mensaje de error.

		double numero1, numero2, resultado; 
						
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingrese el número divisor:");
		numero1 = entrada.nextDouble();
		System.out.println("Ingrese el dividendo: ");
		numero2 = entrada.nextDouble();
		
		if (numero2==0) {
			System.out.println("Error. El segundo número es 0");
		}else {
			resultado = numero1/numero2; 
			System.out.println("El resultado de la división es: " +resultado);
				
		}
	}

}
