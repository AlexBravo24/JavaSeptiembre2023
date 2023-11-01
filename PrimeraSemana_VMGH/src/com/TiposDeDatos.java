package com;

public class TiposDeDatos {
	
	public static void main(String[] args) {
		//byte: -128 a 127
		//short:-32768 a 32767
		//int: -2,147,483,648 a 2,147,483,647
		//Declarar una variable pero sin valor asignado
		
		byte numero;
		//Asignando un valor 
		//Tipos de Datos Primitivos Enteros
		numero = 120;
		numero = 126;
		
		byte a = -128;
		short b = -32768; 
		int c = 2147483647;
		long d = 2147483649L;
		//Para variables "long" que son más grandes que "int" agregar el sufijo L
		//Tipos de Datos Primitivos con punto decimal
		
		float e = 330.1286543f; //Necesitan un sufijo "f" para funcionar y soportar la variable
		double f = 330.1286543122579;
		//Tipos de Datos Primitivos Booleanos y de Carácter
		
		boolean g = true;
		char h = '%';
		//Tipos de Datos No Primitivos String
		//Cadena de Texto
		
		String i = "Esto es una cadena de texto";
		String j = "23";
		String k = "40";
		//Tipos de Datos Wragger o Envoltorio
		
		Integer l = 20000;
		Byte m = 127;
		Short n = 12;
		Long o = 50000000L;
		Float p = 3000.89f;
		Boolean q = true;
		Character r = '%';
		//Salida de Datos
		
		System.out.println("Hola Mundo");
		System.out.println(i);
		String s = j + k;
		System.out.println(s);
		System.out.println(m + n);
		System.out.println(i + " " + (m + n) + " Hola mundo");
		System.out.println(numero);
		System.out.println(a + b + c - d);
		System.out.println(g);
		System.out.println(h + r);
		System.out.println(l + o + p);
		System.out.println(q);
		System.out.println(e + f);
		
	}

}
