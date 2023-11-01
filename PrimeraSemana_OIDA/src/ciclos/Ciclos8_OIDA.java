package ciclos;

import java.util.Scanner;

public class Ciclos8_OIDA {

	public static void main(String[] args) {
		// Ejercicio 8 Programa Java que lea dos números y muestre los números desde el menor hasta el
		//mayor
		int numero1;
		int numero2;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce el primer número");
		numero1 = entrada.nextInt();
		System.out.println("Introduce el segundo número");
		numero2 = entrada.nextInt();
		entrada.close();
		if (numero1 < numero2) {
			System.out.println("El numero menor es " + numero1 + ", mientras que el mayor es " + numero2 );
		}else {
			System.out.println("El numero menor es " + numero2 + ", mientras que el mayor es " + numero1 );
		}
	}

}
