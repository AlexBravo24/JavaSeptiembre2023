package condicionales;

import java.util.Scanner;

public class Condicionales3_VMGH {

	public static void main(String[] args) {
		// 3.Crea un programa que pida al usuario dos n�meros y muestre el resultado de su divisi�n. Si el segundo n�mero es 0, debe mostrar un mensaje de error.
		
		int nu1, nu2; 
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introducir el 1er n�mero: ");
		nu1 = entrada.nextInt();
		System.out.println("Introducir el 2ndo n�mero: ");
		nu2 = entrada.nextInt();
		entrada.close();
		
		if(nu2 != 0) {
			int op = nu1 / nu2;
			System.out.println("El resultado de la operaci�n es: " + op);
		}else if(nu2 == 0) {
			System.out.println("�Error!");
		}else {
			System.out.println("Favor de introducir un valor valido");
		}
	}

}
