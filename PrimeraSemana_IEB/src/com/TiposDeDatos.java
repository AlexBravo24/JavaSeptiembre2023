package com;

public class TiposDeDatos {
	public static void main(String[] args) {

		// Primitivos

		byte numero;
		numero = 120;
		numero = 127;

		byte b = -128; // 1 byte
		short s = -32768; // 2 bytes
		int i = -2147483647; // 4 bytes
		long l = 2147483649L; // 8 bytes. Requiere el sufijo L para contener valores

		float f = 300.1451536f; // 4 bytes. Requiere el sufijo f para contener valores
		double d = 300.14515313459196; // 8 bytes

		boolean indicador = false;

		char caracter = 'a';

		// No primitivos o de referencia

		String cadena = "Ésto es una cadena de texto";
		String x = "23";
		String y = "40";

		String suma = x + y;

		// Tipos de datos Wrapper o envoltorio
		Integer entero = 20000;
		Byte by = 127;
		Short sh = 12;
		Long lo = 500000000L;
		Float fl = 30000.89f;
		Double du = 30000000.0;
		Boolean bool = true;
		Character c = 'a';

		// Imprimir datos

		System.out.println(cadena);
		System.out.println(suma);
		System.out.println(by + sh);

		// Concatenar
		System.out.println(cadena + (by + sh) + "Hola mundo");

	}
}
