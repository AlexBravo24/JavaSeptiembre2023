package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class FileReadWrite {

	public static void main(String[] args) {
		
		// Uso de las clases File 
		//FileReader
		//BufferReader
		//FileWrite
		//leer y escribir archivos en nuestro equipo
		
		
		//Lectura
		//Cuando trabajamos con conversaciones de variables, o accedemos a informacion fuera del IDE
		//puede ser que exista un error en la comunicacion
		
		//una forma de manejar las excepciones o errores
		//posibles en un bloque de codigo es mediante la estructura try & cach
		String linea;
		try {//Intentar ejecutar el sig. bloque de codigo
			//Representacion del archivo en memoria
//			File archivo = new File("C:\\Users\\ACER\\Desktop\\fichero.txt");
//			//Para poder leer el archivo necesitamos a la clase FileReader
//			//Y le pasamos el valor de la clase archivo de la clase file
//			//Una accion en la cual sabe leer el archivo
//			FileReader fr = new FileReader(archivo);
//			//Para poder leer el contenido de ese archivo
//			//Necesitamos cargar dicho contenido en la clase BufferedReader
//			BufferedReader buffer = new BufferedReader(fr);
//			
//		
//			while((linea = buffer.readLine()) !=null) {
//				System.out.println(linea);
//			}
			
			
			//Escritura de archivos
			String texto ="\nHOY ES VIERNES Y EL CUERPO LO SABE";
			//identificar la rura del archivo
			File archivo = new File("C:\\Users\\ACER\\Desktop\\fichero.txt");
			//Creamos un objeto de la clase FileWrited y le pasamos el valordel archivo a sobreescribir
			FileWriter line = new FileWriter(archivo,true);
			//El valor como true se respeta el contenido original del archivo
			
			//Le pasamos el valor de un string guardado previamente
			line.write(texto);
			//Para confirmar la escritura de la linea
			line.close();
			
			
		} catch (Exception e) {  //En caso de opcurrir una excepcion, se atrapa en esta linea
			System.out.println("No encontre el archivo");
			//para poder conocer el origen del error
			e.printStackTrace();
		}

	}

}
