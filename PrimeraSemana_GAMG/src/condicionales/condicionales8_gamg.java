package condicionales;

import java.util.Scanner;

public class condicionales8_gamg {

	public static void main(String[] args) {
		// Realiza un programa que pida por teclado el resultado (dato entero) obtenido al lanzar
		//un dado de seis caras y muestro por pantalla el n�mero en letras (dato cadena) de la 
		//cara opuesta al resultado obtenido.
		//Nota 1: En las caras opuestas de un dado de seis caras est�n los n�meros 1-6,2-5 y 3-4
		//Nota 2: Si el n�mero del dado introducido es menor que 1 o mayor que 6, se mostrar�
		// el mensaje: "ERROR: n�mero incorrecto"

		int numero; 
		String numletra; 
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Ingrese el n�mero:");
		numero = entrada.nextInt();
		
		switch(numero) {
		case 1:  numletra = "seis" ;
					System.out.println("El numero de la otra cara es:" + numletra);
					break; 
		case 2: numletra = "cinco";
		            System.out.println("El n�mero de la otra cara es: " + numletra);
			        break;
		case 3: numletra = "cuatro";
					System.out.println("El n�mero de la otra cara es: " + numletra);
					break;
		case 4: numletra = "tres";
					System.out.println("El n�mero de la otra cara es: " + numletra);
					break;
		case 5: numletra = "dos";
					System.out.println("El n�mero de la otra cara es: " + numletra);
					break;
		case 6: numletra = "uno";
					System.out.println("El n�mero de la otra cara es: " + numletra);
					break;
		default: System.out.println("ERROR: numero incorrecto");
			
		
		}
		
		
	}

}
