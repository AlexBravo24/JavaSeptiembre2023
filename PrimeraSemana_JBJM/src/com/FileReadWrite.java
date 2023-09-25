package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class FileReadWrite {

	public static void main(String[] args) {
		
		//Uso de la clase File 
		//FileReader
		//BUfferedReader
		//FileWriter
		//Leer y escribir archivos en nuestro equipo
		
		//Lectura
		
		//Cuando trabajamos con conversiones de variables,
		//o accedemos a informacion fuera del IDE
		//Puede ser que exista un error en la comunicacion 
		
		//Una forma de manejar las excepciones o errores 
		//posibles en un bloque de codigo es mediante
		//estructuratry catch
		String linea;
		try { //Intentar ejecutar el sig. bloque de codigo
////			//Representacion del archivo en memoria
////			File archivo = new File ("C:\\Users\\52951\\OneDrive\\Escritorio\\fichero.txt");
////			//Para poder leer el archivo, necesitamos a las clase FileReader
////			//Y le pasamos el valor del objeto archivo de la clase File
////			//Un archivo en la cual "sabe leer " el archivo
////			FileReader fr = new FileReader(archivo);
////			//Pa poder leer el contenido de ese archivo 
////			//Necesitamos cargar dicho contenido con la clase BufferedReader
////			BufferedReader buffer = new BufferedReader(fr);
////			
////			while((linea = buffer.readLine()) !=null) {
////		//	linea = buffer.readLine();
////			System.out.println(linea);
//           }
//			
		//Escritura de archivos
		String texto = "\nHOY ES VIERNES Y EL CUERPO LO SABE";
		//Identificar la ruta del archivo 
		File archivo = new File("C:\\Users\\52951\\OneDrive\\Escritorio\\fichero.txt");
		//Creamos un objeto de la clase File Write y le pasamos el valor
		//del archivo a sobreescribir
		FileWriter line = new FileWriter(archivo,true); //Con el valor true como
		//Argumento, se respeta el contenido original del archivo
		
		//le pasamos el valor de un string guardado previamente
		line.write(texto);
		//Para confirmar la escritura de la linea
		line.close();
		
				
				
				
	} catch (Exception e) { //en caso de ocurrir
			//Aqui estamos atrapando la excepcion y mandando un msj 
			//en consola
			
			System.out.println("No encontre el archivo");
			//Para poder conocer el origen del error 
			e.printStackTrace();
			
		}
		
	}

}
