package ciclos;

import java.util.Scanner;

public class Ciclos3_OIDA {

	public static void main(String[] args) {
		// Ejercicio 3 
		//Realiza un programa para determinar si un String es palíndromo
		String palabra;
		String sinespacio;
		String reversa= "";
		Scanner entrada=new Scanner(System.in);
		System.out.println("Introduce una palabra");
		palabra = entrada.nextLine();
		sinespacio = palabra.replace(" ", "");
		entrada.close();
		for (int i = sinespacio.length()-1; i >=0; i--) {
			reversa = reversa +sinespacio.charAt(i);
		}
		System.out.println(reversa);
		if(sinespacio.equalsIgnoreCase(reversa)){//para comparar la palabra original con el reverso de la misma
			System.out.println("es un palindromo");
		}else {
			System.out.println("No es un palindromo");
		}		
	}

}
