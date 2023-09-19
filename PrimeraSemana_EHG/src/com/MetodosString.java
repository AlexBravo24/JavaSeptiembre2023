package com;

public class MetodosString {

	public static void main(String[] args) {
		// Metodos o funcionalidaes  de la clase String
		//Declarar una cadena de texto
		
		String cadena ="Hoy es 13 de Septiembre de 2023";
		
		//.lenght() -Devuelve el tamaño o longitud de la cadena
		System.out.println(cadena.length());
		
		//charAT() -Nos devuelve el caracter que se encuentra el indice o posicion indicado
		//char [H,o,y,,e,s,,1,3]
		System.out.println(cadena.charAt(2));
		System.out.println(cadena.charAt(cadena.length()-1));
		
		
		//.substring -Devolver una subcadena, a partir del indice especificado
		System.out.println(cadena.substring(2));
		System.out.println(cadena.substring(2,28));
		
		//.toLowerCase()/.toUpperCase() - convertir la cadena a minusculas o mayusculas
		System.out.println(cadena.toLowerCase());
		System.out.println(cadena.toUpperCase());
		
		//.equals() -Comparar el valor asignado de un objeto contra otra y devuelve un valor true o falso
		
		System.out.println(cadena.equals("hoy es 13 de septiembre de 2023"));
		
		//.equalsIgnoreCase() -Comparar el valor ignorando si tiene mayusculas o minusculas
		
				System.out.println(cadena.equalsIgnoreCase("hoy es 13 de septiembre de 2023"));
				
				//.contentEquals -compara el contenido de una secuencia de caracteres contra otro string, si son iguales devuelve true
				System.out.println(cadena.contentEquals("hoy es 13 de septiembre de 2023"));
				
				//.replece _ Reemplazar las apariciones de un texto o caracter con otro que indiquemos
				System.out.println(cadena.replace("e", "a"));
				System.out.println(cadena.replace("2023", "2003"));
				System.out.println(cadena.replace(" ", " "));
				
				
				
	}

}
