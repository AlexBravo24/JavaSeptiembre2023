package com;

public class MetodosString {

	public static void main(String[] args) {
		// Métodos o funcionalidades de la clase String
		// Declara una cadena de texto
		
		String cadena = "Hoy es 13 de septiembre de 2023";
		System.out.println(cadena.length()); // .length es un método para que nos devuelva  la longitud de ese String en un número entero
		// Método .charAt() nos permite devolver el valor del indice que está marcado etre parentesis 
		System.out.println(cadena.charAt(13));
		System.out.println(cadena.charAt(cadena.length()-1));
		// .substring devolver una subcadena a partir de los indices específicados de una cadena 
		System.out.println(cadena.substring(13));
		System.out.println(cadena.substring(5, 11));
		// .toLowerCase y .toUpperCase es para convertir cadenas a minusculas y mayusculas
		System.out.println(cadena.toLowerCase());
		System.out.println(cadena.toUpperCase());
		// .equals() Compara el valor asignado de un objeto contra otro
		System.out.println(cadena.equals("Hoy es 13 de septiembre de 2023"));
		System.out.println(cadena.equals("hoy es 13 de septiembre de 2023"));
		// .equalsIgnoreCase() compara el valor ignorando si la diferencia son mayúsculas y minúsculas
		System.out.println(cadena.equalsIgnoreCase("hoy es 13 de SEptiembre de 2023"));
		// .contentEquals() comprueba si en una variable está contenido el mismo contenido
		System.out.println(cadena.contentEquals("hoy es 13 de septiembre de 2023"));
		// .replace() ayuda a remplazar valores de strings o valores de carácteres individuales
		System.out.println(cadena.replace("e", "x"));
		System.out.println(cadena.replace("2023", "1999"));
		System.out.println(cadena.replace(" ", ""));
		// "%.nf" sirve para colocar los decimales deseados 
		double inversion = 1234.44521459;
		System.out.printf("%.2f", inversion);
	}

}
