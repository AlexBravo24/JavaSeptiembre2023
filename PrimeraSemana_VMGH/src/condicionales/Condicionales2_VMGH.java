package condicionales;

import java.util.Scanner;

public class Condicionales2_VMGH {

	public static void main(String[] args) {
		//2.Realiza un programa que pida un número por teclado y nos indique si es par o impar.
		
		int numb;
		Scanner numero = new Scanner(System.in);
		System.out.println("Tecleé un número para comprobar si es par o impar: ");
		numb = numero.nextInt();
		int mod = numb % 2;
		
		switch (mod) {
		case 0:
			System.out.println("El número es par");
			break;
		default:
			System.out.println("El número es impar");
			break;
		}
		
		numero.close();
		
	}

}
