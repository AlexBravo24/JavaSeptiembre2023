package com;

import java.io.File;

public class FileReadWriteJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Lectura
		
		
		//Cuando trabajamos con conversiones de variables,
		//o accedemos a informaci�n fuera del IDE
		//puede ser que exista un error en la comunicaci�n
		
		//Una forma de manejar las excepciones o errores
		//Posibles en un bloque de codigo es mediante la
		//estructura try & catch
		
		//try+Ctrl+Espacio
		
		try {//Intentar ejecutar el sig. nloque de c�digo
			File archivo = new File("");
		} catch (Exception e) {//en caso de ocurrir
			System.out.println("No encontr� el archivo.");
		}
		

	}

}
