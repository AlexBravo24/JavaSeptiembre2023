package condicionales;

import java.util.Scanner;

public class Condicionales3_OIDA {

	public static void main(String[] args) {
		//Ejercicio 3 Crea un programa que pida al usuario dos números y muestre el resultado de su división. Si el
		//segundo número es 0, debe mostrar un mensaje de error.
		int numero1;
		int numero2;
		Scanner entradadenumero = new Scanner(System.in);
		System.out.println("Introduce el primer número");
		numero1 = entradadenumero.nextInt();
		System.out.println("Introduce el segundo número");
		numero2 = entradadenumero.nextInt();
		entradadenumero.close();
		if (numero2==0) {
			System.out.println("Error");
		}else {
			System.out.println("La suma de los dos números es " + (numero1+numero2));
		}
		
	}

}
