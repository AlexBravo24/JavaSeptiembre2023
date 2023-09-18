package com;

public class TiposDeDatos {
	
	public static void main (String[] args) {
		
		//tipos de datos primitivos
		//declarar una variable pero sin asignarle un valor 
		byte numero;
		
		//asigno valor a una variable
		numero=120;
		
		//podemos declarar variables con valor desde un inicio
		byte b = -128;
		short s = -32768; //este ocupa 2 bytes de memoria
		int i = 2147483647; //este ocupa 4 bytes de memoria
		long l = 2147483649L; //esta variable necesita un sufijo "L" para contener valores mas alla de los que soporta la variable int
		
		//la variable comodin mas utilizada es la de tipo "int"
		
		
		float f = 3303.22f; //los tipo float ocupan 4 bytes, pero necesitan un sufijo llamado "f"
		double d = 300.4444424242; //ocupa el doble de memoria y no necesita el sufijo f 
		//la variable comodin para el punto flotante es la "double".
		
		
		boolean indicador = true; //esto nos ayuda al evaluar expresiones o condiciones
		// solo admite el valor verdadero o falso, padrino
		
		char caracter = 'a'; //solo admiten un caracter
		//emplean 2 bytes de memoria y contenemos el valor entre comilla simple
		
		
		
		//ahora van los tipos de datos de referencia
		
		//cadenas de texto 
		String cadena = "Esto es una cadena de texto";
		
		//Tipos de datos Wrapper o envoltorio
		Integer entero = 20000;
		Byte by = 127;
		Short sh = 12;
		Long lo = 40000L;
		Float fl = 3000.89F;
		Double du = 300.2323232;
		Boolean bu = true;
		Character c = '%';
		//permiten envolver en clases a datos tipos primitivos
		//para brindarles ciertas propiedades o comportamientos adicionales
		
		System.out.println("Hola mundo");
		//para escribir de manera corta el println es Crtl + espacio
		System.out.println(cadena);
		System.out.println(by+sh);
		//Concatenar es juntar valores sin hacer una operacion 
		System.out.println(cadena + " " + (by+sh) +" Hola mundo");
		
	}
	
}
