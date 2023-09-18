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
		// Leer y escribir archivos en nuestro equipo 
		
		//Lectura 
		
		//uando trabajamos con conversiones de variables,
		//o accedemos a informacion fuera del IDE 
		//pueda ser que exista un error en la comunicacion 
		
		//una forma de manejar las excepciones 
		//posibles en un bloque de codigos es mediante la
		//estructura try & catch
		String linea;
		try { //Intentar ejecutar el sig. bloqe de codigo 
//			//Representacon del archivo en memoria 
//			File archivo = new File("C:\\Users\\Propietario\\Desktop\\fichero.txt");
//			//para poder leer el archivo necesimaos ala clase FileReader
//			//Y le pasamos el valor del objeto archivo de la clase File
//			// Esto hace una accion en la cual "sabe leer el archivo"
//			FileReader fr = new FileReader(archivo);
//			//para poder leer el contenido de ese achivo 
//			//Necesitamos cargar dicho contenido con la clase BufferedReader
//			
//			BufferedReader buffer = new BufferedReader(fr);
//			
//			while((linea = buffer.readLine()) !=null) {
//			System.out.println(linea);
//			}
			
			//Identificar la ruta de archivo 
			String texto ="\nHOY ES VIERNES Y EL CUERPO LO SABE ";// "\n" es o indica salto de linea 
			File archivo = new File("C:\\Users\\Propietario\\Desktop\\fichero.txt");
			//creamos un objeto de la clase FileWriter y le pasamos el valor
			//del archivo a sobreescribir 
			FileWriter line = new FileWriter(archivo,true);// con el valor true como 
			//argumento, se respeta el contenido original del archivo 
			
			//Le pasamos un valor al String guardado previamente 
			line.write(texto);
			//para confirmar la escritura en la linea 
			line.close();
		} catch (Exception e) { // en caso de ocurrir
			//una excepcion, se atrapa en esta linea 
			//mandando unmensaje en consola
			// TODO: handle exception
			System.out.println("No encontre el archivo");
			//Para poder conocer el origen del error con lo siguiente 
			e.printStackTrace();
		}

	}

}
