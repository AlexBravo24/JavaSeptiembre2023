package ciclos;

import java.util.Scanner;

public class Ciclo8_VMGH {

	public static void main(String[] args) {
		//8. Programa Java que lea dos n�meros y muestre los n�meros desde el menor hasta el mayor.
		
		int num1, num2;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Favor de introducir el primer n�mero: ");
		num1 = entrada.nextInt();
		System.out.println("Favor de introducir el segundo n�mero: ");
		num2 = entrada.nextInt();
		
		if (num1 > num2) {
			for (int i = num2; i <= num1; i++) {
				System.out.println(i);
			}
		}else if (num2 > num1) {
			for (int i = num1; i <= num2; i++)
				System.out.println(i);
		}else {
			System.out.println("Favor de introducir valores v�lidos");
		}
		
		entrada.close();

	}

}
