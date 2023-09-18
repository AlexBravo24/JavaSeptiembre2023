package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class FileReadWrite {

	public static void main(String[] args) {
		// Uso de las clses File
		//FileReader
		//BufferedReader
		//FileWriter
		
		//son clases que nos permiten leer, escribir archivos en nuestro equipo
		
		//cuando trabajamos con conversiones de variables o accedemos a informacion fuera del IDE
		//puede ser que exista un errpr en la comunicacion 
		
		//una forma de manejar las excepciones o errores posibles en un bloque de codigo
		//mediante la estructura try o catch
		String linea;
		try {//intenta ejecutar el siguiente codigo 
			//representacion del archivo en memoria.
//			File archivo = new File("C:\\Users\\omar_\\OneDrive\\Desktop\\fichero.txt");
//			//para poder leer el archio, necesitamos a la clase FileReader
//			// y le pasamos el valor del objeto archivo de la clase File 
//			//Un accion en el cual "sabe leer" eñ archivo.
//			FileReader fr = new FileReader(archivo);
//			//para poder leer el contenido de ese archivo 
//			//necesitamos cargar dicho contenido con la clase BufferedReader
//			BufferedReader buffer = new BufferedReader(fr);
//			while((linea = buffer.readLine()) !=null){//mientras la siguiente linea sea diferente de nulo, imprime la siguiente linea
//				System.out.println(linea);
//			}
			String texto = "\nhoy es viernes y el cuerpo lo sabe";
			//escritura de archivos
			//necesito identificar la ruta del archivo
			File archivo = new File("C:\\Users\\omar_\\OneDrive\\Desktop\\fichero.txt");
			//creamos un objeto de la clase FileWrier y le pasamos el valor del archivo a sobreescribir
		    FileWriter line = new FileWriter(archivo, true);// el valor true como argumento es para que se respete el contenido original del archivo y solo sobreescriba	
		    line.write(texto);
		    //para confirmar la escritura
		    line.close();
		    
		}catch (Exception o) { //en caso de ocurrir una excepcion, se atrapa en esta linea 
			System.out.println("No encontre el archivo");
			//para poder conocer el origen del error
			o.printStackTrace();
		}

	}

}
