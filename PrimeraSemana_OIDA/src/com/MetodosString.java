package com;

public class MetodosString {

	public static void main(String[] args) {
		// Metodos o funcionalidades de la clase String 
		String cadena = "Hoy es 13 de septiembre del 2023";
		
		
		//.length() devuelve el tamaño o longitud de la cadena de texto
		System.out.println(cadena.length());// devuelve el valor como numérico entero, no como caracter
		
		//charAt(0) nos devuelve el cararter en el indice o posicion indicado, donde empieza desde 0 
		System.out.println(cadena.charAt(2));
		System.out.println(cadena.charAt(cadena.length()-1));
		
		//.substring devuelve una subcadena a partir del indice especificado
		System.out.println(cadena.substring(2,28));// el 2 y el 28 son para indicar el inicio y el final de lo que quisieramos poner
		
		//.toLowerCase y toUpperCase estas convierten las letras a minusculas y mayusculas
		System.out.println(cadena.toLowerCase());
		System.out.println(cadena.toUpperCase());
		
		//.equals este metodo compara el valor asignado contra otro y devuelve un valor true o false
		System.out.println(cadena.equals("Hoy es 13 de septiembre del 2023"));
		//.equalsignoreCase() este compara el valor ignorando si contiene mayusculas o minusculas
		
		
		//.contentEquals sirve para ponerle si tiene el mismo contenido de caracteres "exactamente el mismo"
		System.out.println(cadena.contentEquals("Hoy es 13 de septiembre del 2023"));
		
		//.replace  reemplaza una cadena o caracteres por otra que nosotros queramos 
		
		System.out.println(cadena.replace("2023", "2003"));
		System.out.println(cadena.replace(" ", "")); //aqui quitariamos los espacios
		
		
		
		
		
		
		
	}

}
