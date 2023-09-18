package com;  //Nombre del paquete

public class TiposDeDatos {  //Nombre de la clase
	
	public static void main(String[] args) {
		
		//Comentarios de una sola linea
		
		/*Comentarios
		 * de
		 * multiples
		 * lineas
		 * 
		 */
		
		//Ctrl + s (comando para guardar cambios en el codigo)
		
		/*TIPOS DE DATOS
		 * PRIMITIVOS
		 * NUMERICOS ENTEROS
		 * 
		 */
		
		//Declarar una variable, pero sin valor asignado
		byte numero;
		
		numero=120; //Asignando valor a variable
		
		//Puedo volver a asignar un valor diferente
		numero=127; 
		
		//Declarar las variables con valor asignado inicialmente
		byte b =-128; //Ocupa 1 byte de memoria
		short s= -32768; //Ocupa 2 bytes de memoria
		int i=2147483647; //Ocupa 4 bytes de memoria
		long l=2147483649L; //Ocupa 8 bytes y necesita subfijo L
							//para contener valores mas alla de
							//los que soporta el tipo int
		
		//La variable mas comoda para utilizar es la variable
		//de tipo int
		
		/*TIPOS DE DATOS PRIMITIVOS
		 * NUMEROS DE COMA O PUNTO FLOTANTE
		 * Nos permite utilizar valores con coma y decimales
		 */
		
		float f=300.1256f; //Ocupa 4 bytes de memoria y utiliza 
							//subfijo f para funcionar
		
		double d=300.12345678945; //Ocupa 8 bytes y no necesita
									//subfijo f
		
		//La variable mas comoda para utilizar es la tipo "double"
		
		/*TIPOS DE DATOS PRIMITIVOS
		 * BOOLEANOS
		 * CARACTER
		 */
		
		boolean indicador= false; //Facilitar el trabajo al
								//evaluar expresiones o condiciones
		//Solo admite valor verdadero (true) o falso (false)
		
		char caracter='a'; //Solo admiten un caracter
									//Emplean 2 bytes de memoria
								//Contenemos el valor entre comillas simples
		
		/*TIPOS DE DATOS NO PRIMITIVOS
		 * TIPOS DE DATOS DE REFERENCIA, COMPUESTOS,
		 * OBJETO, ESTRUCTURADOS
		 */
		
		//Cadenas de texto
		String cadena="Esto es una cadena de texto, simbolos y numeros";
		String x="50"; //Puedo almacenar numeros pero se reconocen como caracteres
						//No puedo hacer "uso" de ellos para operacion
		String y="60";
		String suma=x+y;
		
		//TIPOS DE DATOS WRAPPED O ENVOLTORIO
		//Permiten envolver en clases a los tipos primitivos
		//para brindarles ciertas propiedades o comportamientos
		//adicionales
		
		Integer entero=21530; 
		Byte by=127; 
		Short sh=12;
		Long lo=1332841581L;
		Float fl=300.25818F;
		Double du=300.2515;
		Boolean bu=true;
		Character c='%';
		
		//Salida de datos
		
		System.out.println("Hola mundo");
		
		//Escribir el System.out.println de manera corta
		//syso + ctrl + espacio
		System.out.println(cadena);
		
		System.out.println(suma);
		
		System.out.println(by+sh);
		
		//Concatenar = juntar valores para mostrarlos sin
		//necesidad de que esto implique una operacion
		
		System.out.println(cadena + " " + (by+sh)+ " Hola mundo");
		
		
		
		
		
		
		
	} //Cierre de main

	
	
	
	
	
	
	
} //Cierre de la clase
