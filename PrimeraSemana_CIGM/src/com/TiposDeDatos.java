package com;

public class TiposDeDatos {



	public static void main(String args) {
	byte numero;	
		
		numero=120;
		numero=127;
		
		byte b = -128;
		short s = -32768;
		int i = 2147483647;
		long l = 2147483649L;
		float f = 300.1286543f;
		double d = 300.124876768877565;
		boolean indicador = true;
		char caracter = 'a';
		String cadena = "Esto es una cadena de texto 123456789";
		String x = "23";
		String y = "40";
		
		String suma = x + y;
		
		Integer entero = 2000000;
		Byte by =127;
		Short sh = 12;
		Long lo = 5000000L;
		Float fl= 3000.89f;
		Double du = 3000.676;
		Boolean bu = true;
		Character c = '&';
		
		System.out.println("hola mundo");
		System.out.println(cadena);
		System.out.println(suma);
		System.out.println(by + sh);
		System.out.println(cadena + "" + (by+sh) + " hola mundo ");

	}
	
}
