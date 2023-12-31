package condicionales;

import java.util.Scanner;

public class Condicionales8_OBRO {

	public static void main(String[] args) {
		/* Realiza un programa que pida por teclado el resultado (dato entero) obtenido al lanzar un dado de 
seis caras y muestre por pantalla el n�mero en letras (dato cadena) de la cara opuesta al resultado 
obtenido.
Nota 1: En las caras opuestas de un dado de seis caras est�n los n�meros: 1-6, 2-5 y 3-4.
Nota 2: Si el n�mero del dado introducido es menor que 1 o mayor que 6, se mostrar� el mensaje: 
�ERROR: n�mero incorrecto�.
*/
		
		Scanner scanner = new Scanner(System.in);
		int dado;

	    
	    System.out.println("El programa indica el n�mero aparecido en el "
	        + "lado opuesto al que sale en el dado:");
	   
	    System.out.print("Resultado de la cara obtenida: ");
	    
	    dado = scanner.nextInt();

	    switch (dado) {
	    case 1:
	      System.out.println("En la cara opuesta est� el \"seis\".");
	      break;
	    case 2:
	      System.out.println("En la cara opuesta est� el \"cinco\".");
	      break;
	    case 3:
	      System.out.println("En la cara opuesta est� el \"cuatro\".");
	      break;
	    case 4:
	      System.out.println("En la cara opuesta est� el \"tres\".");
	      break;
	    case 5:
	      System.out.println("En la cara opuesta est� el \"dos\".");
	      break;
	    case 6:
	      System.out.println("En la cara opuesta est� el \"uno\".");
	      break;
	    default:
	    	System.out.println("ERROR: n�mero incorrecto.");
	   
	    }
	}
}
