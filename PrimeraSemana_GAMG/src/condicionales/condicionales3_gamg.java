package condicionales;

import java.util.Scanner;

public class condicionales3_gamg {

	public static void main(String[] args) {
		// Crear un programa que pida al usuario dos n�meros y muestre el resultado de 
		// su divisi�n. Si el segundo n�mero es "cero", debe mostrar un mensaje de error.

		double numero1, numero2, resultado; 
						
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingrese el n�mero divisor:");
		numero1 = entrada.nextDouble();
		System.out.println("Ingrese el dividendo: ");
		numero2 = entrada.nextDouble();
		
		if (numero2==0) {
			System.out.println("Error. El segundo n�mero es 0");
		}else {
			resultado = numero1/numero2; 
			System.out.println("El resultado de la divisi�n es: " +resultado);
				
		}
	}

}
