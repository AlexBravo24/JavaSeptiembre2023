package com.TablaMultiplicar;

import java.awt.LinearGradientPaint;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.nio.Buffer;

public class FileReadWrite {
	/*
	 * Una forma de manejar las excepciones o errores posibles en un bloque de
	 * codigo es meeiantee la estructura try catch
	 */
	public void ReadDocument() {
		String linea = "";
		try {// intentar ejecutar el sig. el bloque de codigo
				// tener la representacion del archivo en memoria
			File archivo = new File("C:\\Users\\emman\\OneDrive\\Escritorio\\actividad_ceted.txt");
			// para poder leer el archivo necesitamos a la clase filereader
			// y le pasamos el valor del objeto archivo de la clase File
			// Sabra el cual leer
			FileReader fr = new FileReader(archivo);
			// accion de leer el archivo
			// necesitamos cargar dicho contenidocon la clase BufferdReader
			BufferedReader leer_archivo = new BufferedReader(fr);
			while ((linea = leer_archivo.readLine()) != null) {
				System.out.println(linea);

			}
			// Si guardamos los acrchivos tipo Ansi no uf8 en codificacion

		} catch (Exception e) { // en caso de ocurrir
			// aqui estamos atrapando la exceprion y man un msj
			System.err.println("No se encontro el archivo");
			// para saber donde esta el erro como desarrollador
			e.printStackTrace(); // Esto imprime la trase de error

			// TODO: handle exception
		}
	}

	public void readDocumtoParte() {
		try {	
			String texto = "\nHoy es viernes a hechar trago";
	
			// identificar la ruta de archivo
			File archivo = new File("C:\\Users\\emman\\OneDrive\\Escritorio\\actividad_ceted.txt");

			// creamos un objeto de la clase filewriter y le pasamos el valor
			//del archivo a sobreescribir
			//para no no sobre escribir se pone true
			//para acumular la info
			FileWriter line = new FileWriter(archivo,true);
			
			
			//la pasamos el valor de un Strin guardado previamente
			line.write(texto);
			//para confirmar la escritura de la linea  
			line.close();
		} catch (Exception e) { // en caso de ocurrir
			// aqui estamos atrapando la exceprion y man un msj
			System.err.println("No se encontro el archivo");
			// para saber donde esta el erro como desarrollador
			e.printStackTrace(); // Esto imprime la trase de error

			// TODO: handle exception
		}

	}

}
