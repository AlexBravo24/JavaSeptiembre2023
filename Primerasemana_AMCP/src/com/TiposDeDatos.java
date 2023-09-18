package com;

public class TiposDeDatos {
	
	public static void main(Str[] args) {//Abre main
		
		//Comentarios de una sola linea
		
		/*Comentarios
		 * de
		 * multiples
		 * lineas
		 */
		
		//ctrl + s (comando para guardar cambios en el codiogo)
		
		//TIPOS DE DATOS
		
		//Declarar una variable, pero sin valor asignado 
		byte numero;
		
		//asignado posteriormente un valor a mi variable
		numero=120;
		
		//Puedo volver a asignar un valor diferente
		numero=128; 

		//Declarar las variables con valor asignado
		//Inicialmente
		byte b = -128; //ocupa 1 byte de memoria
		short s = -32768; //ocupa 2 bytes de memoria
		int i =2147483647; //ocupa 4 bytes de memoria
		long l = 2147483649L; //ocupa 8 bytes de memoeria
		// y necesita el sufijo L para contener valores
		//más alla de los que soporta el tipo "int"
		
		//La variable comodin más utilizada es la de tipo "int"
		
		/*TIPOS DE DATOS PRIMITIVOS
		 * NUMERICOS DE COMA O PUNTO FLOTANTE
		 * NOS PERMITEN HACER USO DE DECIMALES
		 */
		
		float f = 300.1286543f; //Ocupan 4 bytes de memoria
		//Necesita el sufijo f para funcionar
		double d = 300.124876768877565; //Tiene un rango 
		//más amplio que float, es decir, el doble de memoria
		//y no necesita el sufijo f
		
		//La variable comodín más utilizada es la tipo "double"
		
		/*TIPOS DE DATOS PRIMITIVOS
		 * BLOEANOS
		 * CARACTER
		 */
		
		boolean indicador - false; //Facilitar el trabajo
		//al evaluar expresiones o condiciones
		//Solo admite valor verdader (true) o falso (false)
		
		char caracter - '$'; //Solo admiten un caracter
		//emplean 2 bytes de memoria y contenemos el valor
		//entre comilla simple
		
		/*TIPOS DE DATOS NO PRIMITIVOS
		 * TIPOS DE DATOS DE REFERENCIA, COMPUESTOS,
		 * OBJETO,ESTRUCTURADOS
		 * 
		 */
		
		//Cadenas de Texto
		String cadena = "Esto es una cadena de texto1234$%";
		String x = "23"; //Puedo almacenar numeros
		//pero se reconocen como caracteres, es decir
		//no puedo hacer "uso" de ellos para operaciones.
		String y = "40";
		
		String suma = x + y; 
		
		//TIPOS DE DATOS WRAPPER O ENVOLTORIO
		//Permiten envolver en clases a los tipos primitivos
		//para brindarles ciertas propiedades o
		//comportamientos adicionales
		integer entero = 2000;
		Byte by = 129;
		Short sh = 12;
		Long lo = 50000000L;
		Float fl = 3000.89f;
		Double du = 3000.676757;
		Boolean bu = true;
		Character c = "%";
		
		//Salida de datos
		
		System.out.println("Hola mundo");
		
		//Escribir el System.out.println de manera corta
		//syso + ctrl + espacio
		System.out.println(cadena);
		
		System.out.println(suma);
		
		System.out.println(by+sh);
		
		//Concatenar = juntar valores para mostrarlos, sin
		//necesidad de que esto implique una operación
		
		System.out.println(cadena + " " + (by + sh) + " Hola mundo");
		
	}//Cierre del main
	
}//Cierre de la clase