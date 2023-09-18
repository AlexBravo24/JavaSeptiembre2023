package com;

public class MetodosString {

	public static void main(String[] args) {
		// Metodos o funcionalidades de la clase String
		
		//Declarar una cadena de texto
		String cadena = "Hoy es 13 de Septiembre de 2023";

		//.length() - Devuelve el tamaño o longitud de la cadena de texto
		System.out.println(cadena.length()); //Este convierte los caracteres a numerico
		
		//charAt() - Nos devuelve el caracter que se encuentra en el indice o posicion indicada
		//char [H,o,y, ,e,s, ,......]
		System.out.println(cadena.charAt(2));
		System.out.println(cadena.charAt(cadena.length()-1));
		
		//.substring - Devolver una subcadena, a partir del indice especificado
		System.out.println(cadena.substring(2));
		System.out.println(cadena.substring(2,28));
		
		//.toLowerCase() | .toUpperCase() - Convertir la cadena a minusculas o mayusculas
		System.out.println(cadena.toLowerCase());
		System.out.println(cadena.toUpperCase());
		
		//.equals() - Comparar el valor asignado de un objeto con otro - y devuelve un valor TRUE o FALSE
		System.out.println(cadena.equals("hoy es 13 de septiembre de 2023"));
		
		//.equalsIgnoreCase() - Comparar el valor ignorando si contiene mayusculas o minusculas
		System.out.println(cadena.equalsIgnoreCase("hoy es 13 de septiembre de 2023"));

		//.contentEquals - compara el contenido de una secuencia de caracteres contra otro String y si son iguales se vuelve TRUE
		System.out.println(cadena.contentEquals("Hoy es 13 de Septiembre de 2023"));
		
		//.replace - Reemplazar las apariciones de un texto o caracter con otro que indiquemos
		System.out.println(cadena.replace("e", "a"));
		System.out.println(cadena.replace("2023", "2003"));
		System.out.println(cadena.replace(" ", "_"));
		
		

		
		
	}

}
