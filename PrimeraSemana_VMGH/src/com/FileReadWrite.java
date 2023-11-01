package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class FileReadWrite {

	public static void main(String[] args) {
		// Uso de las clases File
		// FileReader
		// BufferedReader
		// FileWriter
		//Leer y escribir archivos en nuestro sistema
		
		// Lectura
		// Cuando trabajamos con conversiones de variables o accedemos a información fuera del IDE, puede ser que exista
		// un error en la comunicación.
		
		// Una forma de manejar las excepciones o errores posibles en un bloque de código es mediante la estructura try & catch

		String linea, linea1, linea2;
		String texto1 = "\nSerás un gran programador";
		String texto = "\nHoy es viernes y el cuerpo lo sabe";
		try { // Intentar ejecutar el siguiente código
			File archivo = new File ("C:\\Users\\victo\\OneDrive\\Escritorio\\f\\fichero.txt");
//			Para poder leer el archivo, necesitamos traer la clase FileReader y le pasamos el valor del objeto del archivo
//			de la clase File. Una acción en la cuál sabe leer el archivo
		    FileReader fr = new FileReader(archivo);
			//Para poder leer el contenido de ese archivo, necesitamos cargar dicho contenido con la clase BufferedReader
			BufferedReader buffer = new BufferedReader(fr);
			while ((linea = buffer.readLine()) != null) {;
			System.out.println(linea);
			}
		} catch (Exception e) { // en caso de ocurrir una excepción, se atrapa en estás líneas
			System.out.println("No se encontró el archivo");
			e.printStackTrace();
		}
		
		try {
			File archivo1 = new File("C:\\Users\\victo\\OneDrive\\Escritorio\\f\\fichero1.txt");
			FileWriter line = new FileWriter(archivo1);
			line.write(texto);
			line.close();
			FileReader fr1 = new FileReader(archivo1);
			BufferedReader buffer1 = new BufferedReader(fr1);
			while((linea1 = buffer1.readLine()) != null) {
			System.out.println(linea1);
			}
			
		} catch (Exception e) {
			System.out.println("No se encontro el archivo");
			e.printStackTrace();
		}
		
		try {
			File archivo2 = new File("C:\\Users\\victo\\OneDrive\\Escritorio\\f\\fichero2.txt");
			FileWriter line1 = new FileWriter(archivo2, true);
			line1.write(texto1);
			line1.close();
			FileReader fr2 = new FileReader(archivo2);
			BufferedReader buffer2 = new BufferedReader(fr2);
			while((linea2 = buffer2.readLine()) != null) {
			System.out.println(linea2);
			}
		} catch (Exception e) {
			System.out.println("No se encontro el archivo");
			e.printStackTrace();
		}
	}
}
