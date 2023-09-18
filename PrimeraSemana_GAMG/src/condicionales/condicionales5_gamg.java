package condicionales;

import java.util.Scanner;

public class condicionales5_gamg {

	public static void main(String[] args) {
		// Realiza un programa que calcule la aceptacion de una solicitud en base a
		// los siguientes parámetros: edad, nota y sexo
		// mínimo: Nota (5), edad (18), sexo M --> POSIBLE
		// mínimo: Nota (5), edad (18), sexo F --> ACEPTADA
		// Otros casos --> NO ACEPTADA
		
		
		int edad, nota;    //Se declaran variables tipo entero
		char sexo;    // Se declaran variables tipo caracter
		
		Scanner entrada = new Scanner(System.in); 
		System.out.println(" Ingrese su edad, nota y sexo");
		
		edad = entrada.nextInt();
		nota = entrada.nextInt();
		sexo = entrada.next().charAt(0);
		
		
		
		if (edad>=18 && nota>=5 && sexo=='f') {
			System.out.println(" ACEPTADA");
		} else if(edad>=18 && nota>=5 && sexo == 'm'){
			System.out.println("La solicitud es POSIBLE");
		} else {
			System.out.println("La solicitud NO ES ACEPTADA");
		}
		
	}

}
