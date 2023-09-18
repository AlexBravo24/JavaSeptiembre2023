package condicionales;

import java.util.Scanner;
public class Condicionales5_MARB {

	public static void main(String[] args) {
		// Realiza un programa que calcule la aceptación de una solicitud
		//en base a los siguientes
		//edad, nota y sexo
		
		
		Scanner lectura= new Scanner(System.in);
		System.out.println("Ingresa tu Edad");
		int edad1 = lectura.nextInt();
		System.out.println("Ingresa tu Nota");
		int nota1 = lectura.nextInt();
		System.out.println("Ingresa tu Sexo");
		String sexo1 = lectura.next();
		System.out.println(edad1+"-"+nota1+"-"+sexo1);
		if(edad1 >=18 && nota1 >=5 && sexo1.equalsIgnoreCase("m")) {
			System.out.println("Posibe");
		}else {
			if(edad1 >=18 && nota1 >=5 && sexo1.equalsIgnoreCase("F")) {
				System.out.println("Aceptado");
			}else {
				System.out.println("No aceptado");
			}
		}
	}

}
