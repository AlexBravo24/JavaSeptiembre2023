package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class FileReadWrite {

	public static void main(String[] args) {
		// Uso de las clases File
		//FileReader
		//BuffereadReader
		//FileWriter
		//Leer y escribir archivos en nuestro equipo
		
		//Lectura
		
		//Cuando trabajamos con versiones de variables o accedemos a informacion
		//fuera del IDE puede ser que exista un error en la comunicacion
		
		//Una forma de manejar las excepciones o errores posibles
		//en un bloque de codigo es mediante la estructura try & catch
		
		String linea;
		try { //Intentar ejecutar el sig bloque de codigo
			
			//Representacion del archivo en memeoria
//			File archivo = new File("C:\\Users\\Oswal\\OneDrive\\Escritorio\\fichero.txt");
//			
//			//Para poder leer el archivo necesitamos a la clase FileReader
//			//y le pasamos el valor del objeto archivo de la clase File
//			//Una accion en la cual "sabe leer" el archivo
//			FileReader fr = new FileReader(archivo);
//			
//			//Para poder leer el contenido de ese archivo
//			//Necesitamos cargar dicho contenido con la clase BufferedReader
//			BufferedReader buffer = new BufferedReader (fr);
//			
//			while ((linea = buffer.readLine()) !=null){
//			System.out.println(linea);
//			}
			
			//Escritura de archivos
			String texto ="\nHOY ES VIERNES Y EL CUEPO LO SABE";
			//Identificar la ruta del archivo
			File archivo = new File("C:\\Users\\Oswal\\OneDrive\\Escritorio\\fichero.txt");
			//Creamos un objeto de la clase FileWriter y le pasamos el valor del
			//archivo a sobreescribir
			FileWriter line = new FileWriter(archivo,true); //con el valor true como
			//argumento, se respeta el contenido original del archivo
			
			//Le pasamos el valor de un String guardado previamente
			line.write(texto);
			
			//Para confirmar la escritura de la linea
			line.close();
			
			
			
			
			
		} catch (Exception e) { //en caso de ocurrir una excepcion, se atrepa 
			//en esta linea
			//Aqui estamos atrapando la excepcion y mandando un msj en consola
			System.out.println("No encontre el archivo");
			//Para poder conocer el origen del error
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
	}

}
