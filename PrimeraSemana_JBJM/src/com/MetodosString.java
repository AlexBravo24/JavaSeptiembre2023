package com;

public class MetodosString {

	public static void main(String[] args) {
		
		// Metodos o funcionalidades de la clase String
		
		//Declarar una cadena de texto 
		String cadena = "Hoy es 23 de septiembre de 2024";
		
		
		//.length() - Devuelve el tamaño o longitud de la 
		//cadena de texto
		System.out.println(cadena.length());
		
		//charAt() - Nos devuelve el caracter que se encuentra
		//en el indice o posicion indicado
		//Char (H,o,y,  , e,s,  ,1,3
		System.out.println(cadena.charAt(2));
		System.out.println(cadena.charAt(cadena.length()-1));
		
		//.substring - Devolver una subcadena a partir 
		//del indice especificado
		System.out.println(cadena.substring(2));
		System.out.println(cadena.substring(2,28));

	    //.toLowerCase()/.toUpperCase() - Convertir la cadena 
		//a minuscula
		System.out.println(cadena.toLowerCase());
		System.out.println(cadena.toUpperCase());
		
		//.equals () -comparar el valor asignanado de un debate}
		//contra otroy devuelve un valor true o false
		System.out.println(cadena.equals("Hoy es 13 de sepiembre de 2023"));
		
		//.equalsIgnoreCase () -comparar el valor
		//ingnorando si contiene mayusculas o minusculas
		System.out.println(cadena.equalsIgnoreCase("Hoy es 13 de sepiembre de 2023"));
		
		//.contentEquals - Compara el contenido de unna secuencia de caracteres 
		//contra otro string. Si son iguales devuelve TRUE
		
		System.out.println(cadena.contentEquals("Hoy es 13 de sepiembre de 2023"));
		
		//.replece Remplezar las apariciones de un texto o caracte
		//con otro que indiquemos
		System.out.println(cadena.replace("e","a"));
		System.out.println(cadena.replace("2023", "2023"));
		System.out.println(cadena.replace(" ","$"));	
	}

}
