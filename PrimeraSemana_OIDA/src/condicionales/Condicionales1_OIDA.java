package condicionales;

import java.util.Scanner;

public class Condicionales1_OIDA {

	public static void main(String[] args) {
		// Ejercicio 1 Realiza un programa que reciba dos n�meros por teclado e indique cu�l es mayor o si son iguales.
		int numero1;
		int numero2;
		Scanner entradadenumero = new Scanner(System.in);
		System.out.println("Introduce el primer n�mero");
		numero1 = entradadenumero.nextInt();
		System.out.println("Introduce el segundo n�mero");
		numero2 = entradadenumero.nextInt();
		entradadenumero.close();
		if (numero1<numero2) {
			System.out.println("El n�mero mas grande es " + (numero2));
			
		}else if (numero2<numero1){
			System.out.println("El n�mero mas grande es " + (numero1));
		}else if (numero1==numero2) {
			System.out.println("Los n�meros son iguales");
		}
	}

}
