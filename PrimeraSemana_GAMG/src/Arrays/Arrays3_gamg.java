package Arrays;

import java.util.Scanner;

public class Arrays3_gamg {

	public static void main(String[] args) {
		// Pide al usuario por teclado una frase y pasa sus caracteres a un array de caracteres.
		
		
		String frase;    //Se declaran variables
		int numcaract;
		char caracteri;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Ingrese una frase");  //Se pide la frase
		frase = entrada.nextLine();
		numcaract = frase.length();
		entrada.close();
		
		char[] cadena = new char[numcaract];  //Se declara el arreglo en base al numero de caracteres de la frase
				
		System.out.println("La frase es: " +frase);   //Se imprime la frase y el numero de caracteres que contiene
		System.out.println("Tiene " +numcaract + " caracteres");
		
						
		for (int i=0; i<numcaract;i++) { //Se rellenas los indices con los caracteres de la frase
			caracteri = frase.charAt(i);
			cadena[i] = caracteri;
		}
		
		
		System.out.println(cadena); //Se imprime el arreglo, considerando que para los caracteres 
									//	si lo imprime sin necesidad de ciclo, también se puede hacer por ciclos
	}
	
}
