package ciclos;

import java.util.Scanner;

public class Ciclo9_VMGH {

	public static void main(String[] args) {
		// 9. Programa Java que lea dos n�meros y muestre los n�meros pares entre ellos 
		
		int num1, num2;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce el primer n�mero: ");
		num1 = entrada.nextInt();
		System.out.println("Introduce el segundo n�mero: ");
		num2 = entrada.nextInt();
		
		if (num1 > num2) {
			for (int i = num2; i <= num1; i++) {
				if (i % 2 == 0)
					System.out.println(i);
			}
		}else if (num2 > num1) {
			for (int i = num1; i <= num2; i++) {
				if(i % 2 ==0) {
					System.out.println(i);
				}
			}
		}else {
			System.out.println("Favor de introducir valores v�lidos");
		}
		
		entrada.close();

	}

}
