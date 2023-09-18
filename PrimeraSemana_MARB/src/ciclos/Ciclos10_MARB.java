package ciclos;

import java.util.Scanner;

public class Ciclos10_MARB {

	public static void main(String[] args) {
		//  Programa que lea 20 números e indique si son positivos o negativos y pares o 
		// impares y además muestre la sumatoria de los positivos y sumatoria de los impares.
		
		Scanner sc = new Scanner(System.in);
		
		int numero;
		int suma=0;
		for(int i=0;i<=20;i++) {
			System.out.print("Introduce un número: ");
			numero = sc.nextInt();
			
			if (numero >= 0) {
				System.out.print("Positivo");
				
			} else {
				System.out.print("Negativo");
				
			}
			if(numero % 2 == 0){
				System.out.println(" Par");
				
			}else{
				suma=suma+numero;
				 System.out.println(" Impar");
				 
			}
			System.out.println("La sumatoria de los impares es de: "+suma);
			

		}
	}

}
