package condicionales;

import java.util.Scanner;

public class Condicionales4_OBRO {

	public static void main(String[] args) {
		// Realiza un programa que lea una cadena por teclado y compruebe si es una letra mayúscula
		
//		char letra;
//		
//		Scanner entrada= new Scanner(System.in);
//		System.out.println("Introduzca una letra");
//		letra=entrada.next().charAt(0);
//		
//		if(Character.isUpperCase(letra)) { 
//			System.out.println("La letra es Mayuscula");
//		}else {
//			System.out.println("La letra introducida no es Mayuscula");
//		}
		
		
//		//Segundo metodo
//		
//		char letra;
//		Scanner entrada= new Scanner(System.in);
//		System.out.println("Introduzca una letra");
//		letra=entrada.next().charAt(0);
//     if(letra>='A' && letra<='Z'){
//	 System.out.println("La letra introducida es Mayuscula");
//		}else{
//		System.out.println("La letra introducida no es Mayuscula");
//	}
		
		//Tercer metodo
		String cadena, cadena2;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduzca una cadena de texto: ");
		cadena=entrada.next(); //Hola
		entrada.close();
		cadena2 = cadena.toLowerCase(); //hola
		
		if(cadena.equals(cadena2)) {
			System.out.println("La cadena contiene minusculas");
		}else {
			System.out.println("La cadena contiene mayusculas");
		}
		


	}

}
