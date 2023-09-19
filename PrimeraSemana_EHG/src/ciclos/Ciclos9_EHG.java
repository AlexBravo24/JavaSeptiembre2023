package ciclos;

import java.util.Scanner;

public class Ciclos9_EHG {

	public static void main(String[] args) {
		//Programa Java que lea dos números y muestre los números pares entre ellos 
		
		int num = 1;
		int num2 = 1;
		int pares = 0;
		int impares = 0;
		Scanner entrada = new Scanner (System.in);
		System.out.println("INGRESE EL PRIMER NUMERO");
		num = entrada.nextInt();
		
		//System.out.println("INGRESE EL SEGUNDO NUMERO");
		//num2 = entrada.nextInt();
		
		for( int i=1; i<=num; i++) {
			System.out.println("Ingresa numero " + i + "de" + num + ": ");
			num2 = entrada.nextInt();
			
			if(num2%2 == 0) {
				pares++;
			}else {
				impares++;
			}
			System.out.println("Cantidad de numeros pares: "  + pares);
			
		}
		
		
		

	}

}
