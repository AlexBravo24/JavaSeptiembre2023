package condicionales;

import java.util.Scanner;

public class Condicionales1_IEB {
	public static void main(String[] args) {
		/*
		 * 1.Realiza un programa que reciba dos números por teclado e indique cuál es mayor o si son iguales.
		 */
		
		Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese el primer número: ");
        double numero1 = scanner.nextDouble();
        
        System.out.print("Ingrese el segundo número: ");
        double numero2 = scanner.nextDouble();
        
        if (numero1 > numero2) {
            System.out.println(numero1 + " es mayor que " + numero2);
        } else if (numero2 > numero1) {
            System.out.println(numero2 + " es mayor que " + numero1);
        } else {
            System.out.println("Ambos números son iguales.");
        }
        
        scanner.close();
	}
}
