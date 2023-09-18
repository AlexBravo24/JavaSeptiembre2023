package com;

public class MetodosString {

	public static void main(String[] args) {
		
		//Metodos o funcionalidades de la clase string
		
		//Delcarar una cadena de texto
		String cadena = "Hoy es 13 de Septiembre de 2023";
		
		//.length () Devuelve el tamaño o longitud de la
		//cadena de texto
		System.out.println(cadena.length());
		
		//charAt () = Nos devuelve el caracterque se encuentra
		//en el indice o posición indicada
		//Char {H,o,y e,s 1,3  d,e s,e,p,t,i,e,m,b,r,e d,e 2,0,2,3)
		System.out.println(cadena.charAt(2));
		System.out.println(cadena.charAt(cadena.length()-1));
		
		//.substring = Devolver una subcadena a partir
		//del indice especificado
		System.out.println(cadena.substring(2));
		System.out.println(cadena.substring(2,28));
		
		//.toLowerCase()/.toUpperCase () = Convertir la cadena
		//a minúsculas o mayúsculas
		System.out.println(cadena.toLowerCase());
		System.out.println(cadena.toUpperCase());
		
		//.equals() = Comparar el valor asignado de un objeto
		//contra otro = y devuelve un valor Tru o False
		System.out.println(cadena.equals("hoy es 13 de septiembre de 2023"));
		
		//.equalsIgnoreCase() = Comparar el valor
		//ignorando si contiene mayúsculas o minúsculas
		System.out.println(cadena.equalsIgnoreCase("hoy es 13 de septiembre de 2023"));
		
		//.contentEquals = Compara el contenido de una secuencia de caracteres
		//Contra otro String, y si son iguales devuelve True
		//Funciona a nivel de carcateres
		System.out.println(cadena.contentEquals("Hoy es 13 de Septiembre de 2023"));
		
		//.replace = Reemplazar las apariciones de un texto o caracter
		//con otro que indiquemos
		System.out.println(cadena.replace("e", "a"));
		System.out.println(cadena.replace("2023", "2003"));
		System.out.println(cadena.replace(" ", "+"));

	}

}
