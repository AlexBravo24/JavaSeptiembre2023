package condicionales;

import java.util.Scanner;

public class Condicionales1_VMGH {

	public static void main(String[] args) {
		// 1.Realiza un programa que reciba dos n�meros por teclado e indique cu�l es mayor o si son iguales.
		
		int num1, num2;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Dar el primer n�mero por favor: ");
		num1 = entrada.nextInt();
		System.out.println("Dar el segundo n�mero por favor: ");
		num2 = entrada.nextInt();
		
		if(num1 > num2) {
			System.out.println("Entre num1 y num2, num1 es mayor, ya que tiene un valor de: " + num1);
		}else {
			System.out.println("Entre num1 y num2, num2 es mayor, ya que tiene un valor de: " + num2);
		}
		
		entrada.close();

	}

}
