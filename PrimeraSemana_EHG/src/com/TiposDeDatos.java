package com;

public class TiposDeDatos {
	
	public static void main(String[] args) {//Abre main
		//comentarios de una sola linea
		/*Comentarios
		 * de
		 * multiples
		 * lineas
		 * 
		 */
		//Declarar una variable pero sin valor asignado
		byte numero;
		//Asignando posteriormente un valor a mi varaiable
		numero = 120;
		
		//puedo volver a asignar un valor diferente
		numero = 127;
		
		//declarar las variables con valor asignado
		//inicialmente
		byte b = -128; //ocupa 1 byte de memoria
		short s = -32768;//ocupa 2 bytes de memoria
		int i = 2147483647;//ocupa 4 bytes de memoria
		long l = 2147483649L;//Ocupa 8 bytes de memoria
		//y necesita el sufijo L para contener valores
		//mas alla de lo que soporta el tipo "int"
		
		
		/*Tipos de datos primitivos 
		 * numericos de coma o punto flotante
		 * Nos permite usu de las decimales
		 * 
		 */
		float f = 300.1286543f;//Ocupa 4 bytes de memoria
		//Necesita el sufijo f para funcionar
		double d = 300.124876768877565;//Tiene un rango
		//mas amplio que float, es decir, el doble de memoria
		//y no necesita el subfijo f
		
		
		/*Tipos de datos primitivos
		 * booleanos
		 * caracter
		 * 
		 */
		boolean indicador = false;//Facilitar el trabajo
		//al evaluar expresiones o condiciones
		//solo admite valor verdadero (true) o falso (false)
		
		char caracter = '$'; //Solo admiten un cxaracter
		//emplean 2 bytes de memoria y contenemos el valor
		//entre comillas simple
		
		/*TIPOS DE DATOS NO PRIMITIVOS
		 * TIPOS DE DATOS DE REFERENCIA, COMPUESTOS
		 * OBJETOS, ESTRUCTURADOS
		 */
		
		//Cadenas de texto
		String cadena = "Esto es una cadena de texto";
		 
		
		//TIPOS DE DATOS WRAPPER O ENVOLTORIO
		//Permite envolver en clases a los tipos primitivos
		//para brindarles ciertas propiedades o
		//comportamientos adicionales
		Integer entero = 20000;
		Byte by = 127;
		Short sh = 12;
		Long lo = 500000000L;
		Float fl = 3000.676757F;
		Boolean bu = true;
		Character c ='%';
		
		
		//salida de datos
		
		System.out.println("Hola mundo");
		
		System.out.println(cadena);
		

		
		
	}//cierre del main

}//cierre de la clase
