package ciclos;

import java.util.Scanner;

public class Ciclo8_VMGH {

	public static void main(String[] args) {
		//8. Programa Java que lea dos números y muestre los números desde el menor hasta el mayor.
		
		int num1, num2;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Favor de introducir el primer número: ");
		num1 = entrada.nextInt();
		System.out.println("Favor de introducir el segundo número: ");
		num2 = entrada.nextInt();
		
		if (num1 > num2) {
			for (int i = num2; i <= num1; i++) {
				System.out.println(i);
			}
		}else if (num2 > num1) {
			for (int i = num1; i <= num2; i++)
				System.out.println(i);
		}else {
			System.out.println("Favor de introducir valores válidos");
		}
		
		entrada.close();

	}

}
