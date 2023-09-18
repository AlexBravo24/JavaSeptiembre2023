package com;

public class MetodosString {

	public static void main(String[] args) {
		// Metodos o funcionalidades de la clase String
		
		//Declarar una cadena de texto
		String cadena = "Hoy es 13 de Septiembre de 2023";
		
		//.length - Devuelve el tamaño o longitud de la cadena de texto
		System.out.println(cadena.length());  //Es lo equivalente a que yo ponga System.out.println(31), ya que devuelve un valor entero;
		
		//charAt() - Nos devuelve el caracter que se encuentra en el indice o posicion indicado
		// char [H,o,y, ,e,s, ,1,3 ]
		System.out.println(cadena.charAt(2));
		//System.out.println(cadena.charAt(cadena.length()-1))
		
		//.substring - Devolver una subcadena, a partir del indice especificado
		System.out.println(cadena.substring(2)); //Puede indicarse a partir de cual indice inicia
		System.out.println(cadena.substring(2,28));  //Indica en cual inicia y en cual termina
		
		//.toLowerCase() /.toUpperCase() - Convierte la cadena a mayusculas o minusculas
		System.out.println(cadena.toLowerCase());
		System.out.println(cadena.toUpperCase());
		
		//.equals() - Comparar el valor asignado de un objeto contra otro (compara cadenas de texto) y devuelve valores true o false
		System.out.println(cadena.equals("hoy es 13 de septiembre de 2023"));
		
		//.equalsIgnoreCase() - Comparar el valor ignorando si contiene mayusculas o minusculas
		System.out.println(cadena.equalsIgnoreCase("hoy es 13 de septiembre de 2023"));
		
		//.contentEquals - Compara el contenido de una secuencia de caracteres contra otro String. Si son iguales
		//devuelve TRUE
		System.out.println(cadena.contentEquals("es"));
				
	    //.replace - Reemplazar las apariciones de un texto o caracter con otro que indiquemos
		System.out.println(cadena.replace("e", "a"));
		System.out.println(cadena.replace("2023", "2003"));
		System.out.println(cadena.replace(" ", "$"));

	}

}
