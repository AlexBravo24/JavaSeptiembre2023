package condicionales;

import java.util.Scanner;

public class Condicionales1_EHG {

	public static void main(String[] args) {
		// 1.Realiza un programa que reciba dos números por teclado e indique cuál es mayor o si son iguales
		//SE PIDEN DATOS
		int numero;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce un numero ");
		numero = entrada.nextInt();
		//SE PIDEN DATOS
		int numero2;
		System.out.println("Introduce segundo numero ");
		numero2 = entrada.nextInt();
		entrada.close();
		//SE REALIZA LA COMPARACION
		if (numero==numero2) {
			System.out.println("Los numeros son iguales");
		}else {
			if(numero>numero2) {
				System.out.println(numero + "  es mayor que " + numero2);
			}else {
				System.out.println(numero2 + "  es mayor que " + numero);
			}
		}
		
		

	}

}
