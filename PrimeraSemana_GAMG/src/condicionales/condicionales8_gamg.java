package condicionales;

import java.util.Scanner;

public class condicionales8_gamg {

	public static void main(String[] args) {
		// Realiza un programa que pida por teclado el resultado (dato entero) obtenido al lanzar
		//un dado de seis caras y muestro por pantalla el número en letras (dato cadena) de la 
		//cara opuesta al resultado obtenido.
		//Nota 1: En las caras opuestas de un dado de seis caras están los números 1-6,2-5 y 3-4
		//Nota 2: Si el número del dado introducido es menor que 1 o mayor que 6, se mostrará
		// el mensaje: "ERROR: número incorrecto"

		int numero; 
		String numletra; 
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Ingrese el número:");
		numero = entrada.nextInt();
		
		switch(numero) {
		case 1:  numletra = "seis" ;
					System.out.println("El numero de la otra cara es:" + numletra);
					break; 
		case 2: numletra = "cinco";
		            System.out.println("El número de la otra cara es: " + numletra);
			        break;
		case 3: numletra = "cuatro";
					System.out.println("El número de la otra cara es: " + numletra);
					break;
		case 4: numletra = "tres";
					System.out.println("El número de la otra cara es: " + numletra);
					break;
		case 5: numletra = "dos";
					System.out.println("El número de la otra cara es: " + numletra);
					break;
		case 6: numletra = "uno";
					System.out.println("El número de la otra cara es: " + numletra);
					break;
		default: System.out.println("ERROR: numero incorrecto");
			
		
		}
		
		
	}

}
