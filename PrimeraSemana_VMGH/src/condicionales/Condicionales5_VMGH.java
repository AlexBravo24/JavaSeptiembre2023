package condicionales;

import java.util.Scanner;

public class Condicionales5_VMGH {

	public static void main(String[] args) {
//		// 5. Realiza un programa que calcule la aceptación de una solicitud en base a los siguientes 
//		parámetros: edad, nota y sexo.
//		* Mínimo: Nota (5), edad (18), sexo M -> POSIBLE
//		* Mínimo: Nota (5), edad (18), sexo F -> ACEPTADA
//		* Otros casos -> NO ACEPTADA
		
		Scanner entrada = new Scanner(System.in);
		Integer nota, edad;
		Character sexo;
		
		System.out.println("Ingresa tu nota: ");
		nota = entrada.nextInt();
		System.out.println("Ingrese su edad: ");
		edad = entrada.nextInt();
		System.out.println("Ingrese su sexo: ");
		sexo = entrada.next().charAt(0); 
		
		if ((nota >= 5 && edad >= 18) && (sexo == 'M' || sexo == 'm')) {
			System.out.println("Posible");
		} else if ((nota >= 5 && edad >= 18) && (sexo == 'F' || sexo == 'f')){
			System.out.println("Aceptada");
		}else {
			System.out.println("No Aceptada");
		}
		
		entrada.close();
			
	}

}
