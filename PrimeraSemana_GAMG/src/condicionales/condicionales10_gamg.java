package condicionales;

import java.util.Scanner;

public class condicionales10_gamg {

	public static void main(String[] args) {
		// Realiza un programa que pida un número entero entre uno y doce e imprima el 
		// número de días que tiene el mes correspondiente.
		
		int numero; 
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Ingrese un número:");
		numero = entrada.nextInt();
		
		if (numero == 1 || numero==3 || numero==5 || numero==7 || numero==8||numero==10||numero==12) {
			System.out.println("Tiene 31 días");
		} else if (numero==4||numero==6||numero==9||numero==11) {
			System.out.println("Tiene 30 días");
			}else if(numero==2) {
				System.out.println("Tiene 28 días");
			} else {
				System.out.println("Introduzca un número entre 1 y 12");
			}


	}

}
