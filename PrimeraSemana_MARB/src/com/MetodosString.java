package com;

public class MetodosString {

	public static void main(String[] args) {
		
		//Metodos o funcionalidades de la clase String
		
		//Declara una cadena de texto 
		
		String cadena = "Hoy es 13 de Septiembre de 2023";
		
		
		//.length() - Devuelve el tamaño o longitud de la 
		//cadena de texto 
		
		System.out.println(cadena.length()); 
		
		//charAt() - Nos devuelve el caracter que se encuentra 
		//en el indice o posicion indicado 
		//char [H,o,y, ,e,s, ,1,3  ]
		System.out.println(cadena.charAt(2));
		System.out.println(cadena.charAt(cadena.length()-1));
		
		//.substrng - Devolver una subcadena, a partir 
		//del indice especifico
		System.out.println(cadena.substring(2));
		System.out.println(cadena.substring(2,28));
		
		//.toLowerCase() /.toUpperCase() - Convertir la cadena 
		//a minuculas o ayusculas
		System.out.println(cadena.toLowerCase());
		System.out.println(cadena.toUpperCase());
		
		//.equals() -Comparar el valor asignado de un objeto
		//contra otro - y devuelve un valor true o false 
		System.out.println(cadena.equals("hoy es 13 de septiembre de 2023"));
		
		//.equalsIgnoreCase() -Comparar el valor 
		//ignorando si contiene mayusculas o minusculas 
		System.out.println(cadena.equalsIgnoreCase("hoy es 13 de septiembre de 2023"));
		
		//.contenentEquals - Compara el contenido de una secuencia de caracteres 
		//contra otro String. si son iguales develve True 
		System.out.println(cadena.contentEquals("Hoy es 13 de Septiembre de 2023"));
		
		//.replace - Remplazar las apariciones de un texto o caracteres 
		//con otro que indiquemos 
		System.out.println(cadena.replace("e", "a"));
		System.out.println(cadena.replace("2023", "2003"));
		System.out.println(cadena.replace(" ", "$"));
		

	}

}
