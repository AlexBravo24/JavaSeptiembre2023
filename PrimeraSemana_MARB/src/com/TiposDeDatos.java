package com;//Nombre del paquete 

public class TiposDeDatos {//Nombre de la clade 
	
	public static void main(String[] args) {//Abre main 
		
		//Comentarios de una sola linea 
		
		/*Comentarios
		 * de 
		 * multiples 
		 * lineas
		 * 
		 */
		
		//Ctrl + s (comando para guardar cambios en el codigo)
		
		/*/
		 * 
		 */
		
		
		
		
		//Declarar una variable, pero sin valor asignado 
		byte numero;
		
		//Asignando posteriormete un valor diferente 
		numero=127; 
		
		//Puedo volver a asignar un valor diferente  
		numero=120;
		
		
		//puedo volver a asignar un valor diferente 
		numero=127;	
		
		//Declarar las variables con valor asignado 
		//inicialmente 
		byte b = -128; //Ocupa 1 byte de memoria 
		short s = -32768; //Ocupa 2 bytes de memoria 
		int i = 2147483647; //Ocupa 4 bytes de memoria 
		long l = 2147483649L; //Ocupa 8 bytes de memoria 
		//Y necesita el sufijo L para contener valores 
		//mas alla de los que soporta el tipo "int"
		
		//La variable comodin mas utilizada es la tipo "int"
		
		/*TIPOS DE DATOS PRIMITIVOS 
		 * NUMERO DE COMA O PUNTO FLOTANTE 
		 * Nos permiten hacer uso de decilamales 
		 */
		
		float f = 300.1286543f; //Ocupan 4 bytes de memoria
		//Necesita el sufijo f para funcionar 
		double d = 300.1248766768877565; //Tiene un rango 
		//mas amplio que float, es decir, el doble de memoria
		//y no necesita el sufijo f 
		
		//La variable comodin masa utilizada es la tipo "double"
		
		/*TIPOS DE DATOS PRIMITIVOS 
		 * BOOLEANOS 
		 * CARACTER 
		 */
		
		boolean indicador = true; //Facilitar el trabajo
		//al evaluar expresiones o condiciones 
		//Solo admite valor verdadero (true) o falso (false)
		
		char caracter = 'a'; //Solo admiten un caracter 
		//emplean 2 bytes de memoria y contenemos el valor 
		//entre comilla simple 
		
		/*TIPOS DE DATOS NO PRIMITIVOS 
		 * TIPOS DE DATOS DE REFERENCIA, COMPUESTOS,
		 * OBJETO, ESTRUCTURADOS 
		 * 
		 */
		
		//Cadenas de texto 
		String cadena = "Esto es una cadena de texto 1234";
		String x = "23"; //Puedo almacenar numeros 
		//pero se conocen como caraceres, es decir 
		//no puedo hacer "uso" de ellos para operaciones 
		String y = "40";
		
		String suma = x + y;
		
		//TIPOS DE DATOS WRAPPER O ENVOTORIOS
		//Permite envolver en clases a los tipos primitivos 
		//para brindarles ciertas prioridades o 
		//comportamientos adicionales
		Integer entero = 20000; 
		Byte by = 127;
		Short sh = 12;		
		Long lo = 500000000L;
		Float fl =3000.89f;
		Double du = 3000.676757;
		Boolean bu = true;
		Character c = '%';
		
		//Salida de datos 
		
		System.out.println("Hola mundo"); 
		
		//Escribir el System.out.println de manera corta 
		//syso + ctrl + espacio
		System.out.println(cadena);
		
		System.out.println(suma);
		
		System.out.println(by+sh);
		
		//Concatenar - juntar valores para mostrarlos, sin 
		//necesidad de que esto implique una operacion 
		
		System.out.println(cadena +"" + (by+sh) + " Hola mundo");
		
		
		
		
		
	
		
	}//Cierre de main 

}//Cierre de la clase 
