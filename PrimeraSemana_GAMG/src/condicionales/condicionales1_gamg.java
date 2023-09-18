package condicionales;

import java.util.Scanner;

public class condicionales1_gamg {

	public static void main(String[] args) {
		// Realiza un programa que reciba 2 números por teclado e indique cuál es el mayor
		//o si son igual
	
		int numero1, numero2; //Suponiendo que solo serán números enteros
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce el primer numero: ");
		numero1 = entrada.nextInt();
		System.out.println("Introduce el segundo numero:");
		numero2 = entrada.nextInt();
		
		if(numero1<numero2) { //Se revisa si el segundo es mayor al primero
			System.out.println("El numero 2: " + numero2 +" es mayor al numero 1: " + numero1);
		} else if (numero1>numero2) { //Se revisa si el primero es mayor al segundo
			System.out.println("El numero 1: " + numero1 +" es mayor al numero 2: " + numero2);
		} else {
			System.out.println("Los números son iguales");
		}

	}

}
