package ciclos;

import java.util.Scanner;

public class Ciclos10_OBRO {

	public static void main(String[] args) {
		// Programa que lea 20 n�meros e indique si son positivos o negativos y pares o 
		//impares y adem�s muestre la sumatoria de los positivos y sumatoria de los impares.

		Scanner sc = new Scanner(System.in);
        int numero;

        System.out.print("Introduce un n�mero (0 para acabar): ");
        numero = sc.nextInt();

        while (numero != 0) {

            if (numero > 0) {
                System.out.print("Positivo");
            } else {
                System.out.print("Negativo");
            }
            if(numero % 2 == 0){
                System.out.println(" Par");
            }else{
                System.out.println(" Impar");
            }

            System.out.print("Introduce un n�mero (0 para acabar): ");                                  
            numero = sc.nextInt();
        }
    } 
}
		
