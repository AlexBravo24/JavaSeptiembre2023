package condicionales;

import java.util.Scanner;

public class condicionales10_gamg {

	public static void main(String[] args) {
		// Realiza un programa que pida un n�mero entero entre uno y doce e imprima el 
		// n�mero de d�as que tiene el mes correspondiente.
		
		int numero; 
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Ingrese un n�mero:");
		numero = entrada.nextInt();
		
		if (numero == 1 || numero==3 || numero==5 || numero==7 || numero==8||numero==10||numero==12) {
			System.out.println("Tiene 31 d�as");
		} else if (numero==4||numero==6||numero==9||numero==11) {
			System.out.println("Tiene 30 d�as");
			}else if(numero==2) {
				System.out.println("Tiene 28 d�as");
			} else {
				System.out.println("Introduzca un n�mero entre 1 y 12");
			}


	}

}
