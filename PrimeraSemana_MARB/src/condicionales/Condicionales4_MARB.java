package condicionales;

import java.util.Scanner;

public class Condicionales4_MARB {

	public static void main(String[] args) {
		
		// Realiza un programa que lea una cadena por teclado 
		//y compruebe si es una letra mayúscula 
		
		String cadena;
		
		Scanner entrada = new Scanner(System.in); 
		System.out.println("Introduce una cadena de texto");
		
		cadena=entrada.next();
		entrada.close();
		/*
		if (cadena.matches("[A-Z]+")) {
			System.out.println("CUENTA CON MAYUSCULA");
		}else {
			System.out.println("Son puras minusculas");
		}
		*/
		int x=0;
		int y =0;
		for (int i=0;i<cadena.length();i++) {
			if(Character.isUpperCase(cadena.charAt(i))){
				x=x+1;
			}else {
				y=y+1;
				
			}
		
		}
		
		System.out.println("existen"+x+"letras mayusculas");
		System.out.println("existen"+y+"letras minusculas");
		
		
		
		
		}
}
