package condicionales;

import java.util.Scanner;

public class Condicionales5_OIDA {

	public static void main(String[] args) {
		/* Ejercicio 5 Realiza un programa que calcule la aceptaci�n de una solicitud en base a los siguientes
			par�metros: edad, nota y sexo.
		 	* M�nimo: Nota (5), edad (18), sexo M -> POSIBLE
		 	* M�nimo: Nota (5), edad (18), sexo F -> ACEPTADA
		 	* Otros casos -> NO ACEPTADA
*/
		int edad;
		int nota;
		char sexo;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce tu edad");
		edad = entrada.nextInt();
		if (edad<18) {
			System.out.println("No aceptada");
		}else {
			//Scanner entrada = new Scanner(System.in);
			System.out.println("Introduce tu nota");
			nota = entrada.nextInt();
			if (nota<5) {
				System.out.println("No aceptada");
			}else {
				//Scanner entrada = new Scanner(System.in);
				System.out.println("Introduce tu sexo. M � F");
				sexo = entrada.next().charAt(0);
				entrada.close();
				if (sexo == 'M') {
					System.out.println("Posible");
				}else if (sexo == 'F') {
					System.out.println("Aceptada");
					
				}
			}
			
		}
		
		}

}
