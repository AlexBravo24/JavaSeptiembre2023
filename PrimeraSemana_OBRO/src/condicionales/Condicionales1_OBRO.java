package condicionales;

import java.util.Scanner;

public class Condicionales1_OBRO {

	public static void main(String[] args) {
		// Realiza un programa que reciba dos números por teclado e indique cuál es mayor o si son iguales.
		
		int numero1, numero2;
		
		Scanner entrada1=new Scanner(System.in);
		System.out.println("Dijite el primer numero");
		numero1=entrada1.nextInt();
		
		Scanner entrada2=new Scanner(System.in);
		System.out.println("Dijite el segundo numero");
		numero2=entrada2.nextInt();
		
		if(numero1>numero2) {
			System.out.println("El numero " + numero1 + " es mayor que " + numero2);
		}else {
			System.out.println("El numero " + numero2 + " es mayor que " + numero1);
		}
		
		if(numero1==numero2) {
			System.out.println("Los numeros digitados son iguales");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
