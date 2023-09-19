package condicionales;

import java.util.Scanner;

public class Condicionales5_EHG {

	public static void main(String[] args) {
		
	   /* . Realiza un programa que calcule la aceptación de una solicitud en base a los siguientes 
		* parámetros: edad, nota y sexo.
		* Mínimo: Nota (5), edad (18), sexo M -> POSIBLE
		* Mínimo: Nota (5), edad (18), sexo F -> ACEPTADA
		* Otros casos -> NO ACEPTADA
		*/
		 
		//DECLARACION DE VARIABLES
		int edad;
		int nota;
		String sexo;
		
		//SOLICITAR DATOS
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce tu edad: ");
		edad = entrada.nextInt();
		System.out.println("Introduce tu nota: ");
		nota = entrada.nextInt(); entrada.nextLine();
		System.out.println("Introduce tu sexo (M o F): ");
		sexo = entrada.nextLine();
		entrada.close();
		
		//SE REALIZA EL CALCULO Y SE USA TOUPPERCASE PARA CONVERTIR LA CADENA A LETRAS MAYUSCULAS Y MINUSCULAS
		if (!sexo.toUpperCase().equals("M") && !sexo.toUpperCase().equals("F")) {
			System.out.println("Su informacion es incorrecto \n" + "Introduzca nuevamente sus datos ");
			
		}else if((nota >= 5) && (edad >=18) && (sexo.toUpperCase().equals("M"))){
			System.out.println("Posible");
			
		}else if((nota >=5) && (edad >=18) && (sexo.toUpperCase().equals("F"))) {
			System.out.println("Aceptada");
		}else {
			System.out.println("No aceptada");
		}
		
		
 
	}

}
