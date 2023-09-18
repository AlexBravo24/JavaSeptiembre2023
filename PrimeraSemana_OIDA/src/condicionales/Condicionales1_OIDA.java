package condicionales;

import java.util.Scanner;

public class Condicionales1_OIDA {

	public static void main(String[] args) {
		// Ejercicio 1 Realiza un programa que reciba dos números por teclado e indique cuál es mayor o si son iguales.
		int numero1;
		int numero2;
		Scanner entradadenumero = new Scanner(System.in);
		System.out.println("Introduce el primer número");
		numero1 = entradadenumero.nextInt();
		System.out.println("Introduce el segundo número");
		numero2 = entradadenumero.nextInt();
		entradadenumero.close();
		if (numero1<numero2) {
			System.out.println("El número mas grande es " + (numero2));
			
		}else if (numero2<numero1){
			System.out.println("El número mas grande es " + (numero1));
		}else if (numero1==numero2) {
			System.out.println("Los números son iguales");
		}
	}

}
