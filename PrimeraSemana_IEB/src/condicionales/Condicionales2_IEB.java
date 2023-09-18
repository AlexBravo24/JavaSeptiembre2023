package condicionales;

import java.util.Scanner;

public class Condicionales2_IEB {
	public static void main(String[] args) {
		/*
		 * 2.Realiza un programa que pida un número por teclado y nos indique si es par o impar
		 */
		
		Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese un número: ");
        int numero = scanner.nextInt();
        
        if (numero % 2 == 0) {
            System.out.println(numero + " es un número par.");
        } else {
            System.out.println(numero + " es un número impar.");
        }
        
        scanner.close();
	}
}
