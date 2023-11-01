package com; //Nombre de la linea

public class TiposDeDatos {  //Nombre de la clase

	public static void main(String[] args) {  //Abre main
		
		//Comentarios de una sola linea
		
		/* Comentarios 
		 * de multiples 
		 * lineas
		 * 
		 * 
		 * 
		 */
		
		//Ctrl + S (comando para guardar cambios en el codigo)
		
		/*tipos de datos 
		 * primitivos
		 * numericos enteros
		 * 
		 */
		
		//Declarar una variable, pero sin valor agregado
		byte numero;
		
		//Asignar posteriormente un valor a la variable
		numero=120;
		
		//Puedo volver a asignar un valor diferente
		numero=127;
		
		//Declarar las variables con valor asignado inicialmente
		
		byte b = -128; // Ocupa 1 byte de memoria
		short s = -3276; //Ocupa 2 bytes de memoria
		int i = 2147483647; //Ocupa 4 bytes de memoria
		long l = 2147483649L; //Ocupa 8 bytes de memoria y necesita el sufijo L
		//para contener valores mas altos de los que soporta el tipo "int"
		
		
		//la variable comodin mas utilizada es la de tipo "int"
		
		/* tipos de datos primitivos
		 * numericos de coma o punto flotante
		 * nos permiten hacer uso de decimales
		 */
		
		float f = 300.1286543f; //Ocupan 4 bytes de memoria
		//Necesita el sufijo f para funcionar
		double d= 300.124876768877565; //Tiene un rango mas amplio 
		// que float, es decir, el doble de memoria y no 
		// necesita el sufijo f
		
		//la variable comodin mas utilizada es la tipo "double"
		
		/*tipos de datos primitivos
		 * booleanos
		 * caracter
		 */
		
		boolean indicador = false; //Facilitar el trabajo 
		//al evaluar expresiones o condiciones
		//solo admite valor verdadero (true) o falso (false)
		
		char caracter = 'a'; //Solo adminten un caracter
		//emplean 2 bytes de memoria y contenemos el valor
		//entre comilla simple
		
		
		
		/*tipos de datos no primitivos
		 * tipos de datos de referencia, compuestos, 
		 * objeto, estructurados
		 * 
		 */
		
		//Cadenas de texto
		String cadena = "Esto es una cadena de texto 1234$%";
		String x = "23"; //Puedo almacenar numeros
		//pero se reconocen como caracteres, es decir, 
		//no puedo hacer "uso" de ellos para operaciones. 
		String y = "40"; 
		
		String suma = x + y;
		
		//tipos de datos wrapper o envoltorio
		//Permiten envolver en clases a los tipos primitivos
		//para brindarles ciertas propiedades o
		//comportamientos adicionales
		Integer entero = 20000; 
		Byte by = 127; 
		Short sh = 12; 
		Long lo = 50000000L; 
		Float fl = 3000.89f; 
		Double du = 30000.676757;
		Boolean bu = true; 
		Character c = '%';
		
	    //salida de datos
		
		System.out.println("Hola mundo");
		
		//Escribir el System.out.println de manera corta
		//syso ctrl + espacio
		System.out.println(cadena);
		
		System.out.println(suma);
		
		System.out.println(by+sh);
		
		//Concatenar = juntar valores para mostrarlos, 
		//sin necesidad que esto implique una operacion
		
		System.out.println(cadena + " " + (by+sh) +  " Hola mundo");
		
		
		
	} //Cierre del main
	
	
	
} //Cierre de la clase
