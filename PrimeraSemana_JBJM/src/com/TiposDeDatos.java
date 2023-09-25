package com;//Nombre del paquete 

public class TiposDeDatos {//Nombre de la clase 
  
	public static void main(String[] args) {//abre main
	
	  
	  //Comentarios de una sola linea
	 
	  /*Comentarios
	   * de
	   * multiples
	   * lineas
	   * 
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
	 
	  //Asignando posteriormente valor a mi variable
	  numero=120;
	  
	  //Puedo volver a asignar un valor diferente 
	  numero=127;
	  
	  //Declarar las variables con valor asignado
	  //inicialmente
	  byte b = -128;  //Ocupa 1 byte de memoria
	  short s = -32768; //Ocupa 2 bytes de memoria 
	  int i = 2147483647;//Ocupa 4 bytes de memoria
	  long l = 2147483649L;//Ocupa 8 bytes de memoria 
	  //y necesita el sufijo L para contener valores 
	  //mas alla de los que soporta el tipo "int"
	  
	  //La variable comodin mas utilizada es la de tipo "int"
	  /*TIPOS DE DATOS PRIMITIVOS 
	   * NUMERICOS DE COMA O PUNTO FLOTANTE 
	   * Nos permiten hacer uso de decimales 
	   */
	  
	  float f = 300.1286543f;//Ocupan 4 bytes de memoria 
	  //Necesit el sufijo f para funcionar 
	  double d = 300.123455667343377;//Tiene un rango 
	  //mas amplio que float, es decir, el doble de memoria
	  //y no necesitan el subfijo f
	  
	  //la variable comodin mas utilizada es la tipo "double"
	  
	  /*TIPOS DE DATOS PRIMITIVOS 
	   * BOOLEANOS 
	   * CARACTER 
	   */
	  
	  boolean indicador = false;//Facilitar el trabajo 
	  //al evaluar expresiones o condiciones 
	  //Solo admite valor verdadero (true) falso (false)
	  char caracter = 'a'; //solo admiten un caracter 
	  //emplean 2 bytes de memoria y contenemos el valor 
	  //entre comilla simple
	  
	  
	  
	  
	  /*TIPOS DE DATOS NO PRIMITIVOS 
	   * TIPOS DE DATOS DE REFERENCIA, COMPUESTOS 
	   * OBJETO, ESTRUCTURADOS 
	   * 
	   */
	  
	  //Cadena de Texto 
	  String cadena = "Esto es una cadena de texto 1234";
	  String x ="23"; //Puedo almacenar numero 
	  //pero se reconocen como caracteres, es decir 
	  //no puedo hacer "uso" de ellos para operaciones.
	  String y = "40";
	  
	  String suma = x + y;
	  
	  //TIPOS DE DATOS WRAPPER O ENVOLTORIO 
	  //Permiten envolver en clases a los tipos primitivos 
	  //para brindarles ciertas propiedades o 
	  //coportamientos adicionales 
	  Integer entero = 200000;
	  Byte by = 127;
	  Short sh = 12;
	  Long lo = 5000000000L;
	  Float fl = 3000.89f;
	  Double du = 3000.676757;
	  Boolean bu = true;
	  Character c = '%';
	  
	  //Salida de datos 
	  
	  System.out.println("Hola mundo");
	  
	  //Escribir el System.out.println de nanera corta 
	  //syso +crtl + espacio
	  System.out.println(cadena);
	  
	  System.out.println(suma);
	  
	  System.out.println(by+sh);
	  
	  //concatenar - juntar valores para mostralos, sin
	  //necesidad de que esto implique una operacion 
	  
	  System.out.println( cadena + " " + (by+sh) + " Hola mundo");
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	   
	  
	  
	  
	  
	  
  }//Cierre del main
}//Cierre clase 