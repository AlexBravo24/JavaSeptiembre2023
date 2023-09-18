package condicionales;

import java.util.Scanner;

public class Condicionales3_MARB {

	public static void main(String[] args) {
		// .Crea un programa que pida al usuario dos números y muestre 
		//el resultado de su división. Si el 
		//segundo número es 0, debe mostrar un mensaje de error
		
		int x1;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce el primer numero");
		x1 = entrada.nextInt();
		System.out.println("Introduce el segundo numero");
		int x2;
		x2 = entrada.nextInt();
		entrada.close();
	
		System.out.println(x1/x2);
		if (x2==0);{
			System.out.println("Error");
		}
		

	}

}
