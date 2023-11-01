package condicionales;

import java.util.Scanner;

public class Condicionales3_IEB {
	public static void main(String[] args) {
		/*
		 * 3.Crea un programa que pida al usuario dos n�meros y muestre el resultado de su divisi�n. Si el segundo n�mero es 0, debe mostrar un mensaje de error.
		 */
		
		Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese el primer n�mero: ");
        double numero1 = scanner.nextDouble();
        
        System.out.print("Ingrese el segundo n�mero: ");
        double numero2 = scanner.nextDouble();
        
        if (numero2 != 0) {
            double resultado = numero1 / numero2;
            System.out.println("El resultado de la divisi�n es: " + resultado);
        } else {
            System.out.println("Error: No se puede dividir por cero.");
        }
        
        scanner.close();
	}
}
