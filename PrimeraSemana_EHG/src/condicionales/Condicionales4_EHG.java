package condicionales;

import java.util.Scanner;

public class Condicionales4_EHG {

	public static void main(String[] args) {
		//Realiza un programa que lea una cadena por teclado y compruebe si es una letra mayúscula.
		
		
		Scanner entrada = new Scanner (System.in);
		String cadena;
		
		//SOLICITAMOS DATOS
		System.out.println("Introduce letra mayuscula ");
		cadena = entrada.nextLine();
		entrada.close();
		
		//SE COMPARA EL VALOR
		if (cadena.length() != 1) {
			System.out.println("La letra no es mayuscula");
			
		//SE REALIZA EL CALCULO 	
		}else if ((cadena.compareTo("A") >= 0) && (cadena.compareTo("Z")<=0)){
			System.out.println("La cadena es una letra mayuscula ");
			
		}else {
			System.out.println("La cadena no es una letra Mayuscula ");
		}	


	} 

}
