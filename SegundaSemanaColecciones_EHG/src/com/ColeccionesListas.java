package com;

import java.util.ArrayList;
import java.util.List;

public class ColeccionesListas {

	public static void main(String[] args) {
		// Una Lista es una coleccion de datos es definida por una sucesion de elementos
		//SE implementan mediante la interface List
		//Admiten valores dupilcados y se basa en unh array redimensionable
		//Que aumenta su tamañao segun crece la coleccion de elementos
		//Es de las mas utilizadas y con mejor rendimiento
		
		//Declarando una lista de elementos tipo String
		List<String>lista = new ArrayList<String>();
		
		//Agregar valorres a est alista
		lista.add("Andre");
		lista.add("Celso");
		lista.add("Cesar");
		lista.add("Eliaz");
		lista.add("Emanuel");
		lista.add("Andre");
		
		System.out.println(lista);
		
		//Imprimir y acceder un solo valor o nombre de la lista
		System.out.println(lista.get(0));
		
		//Devolver un valor booleano si el elemento existe en la lista
		System.out.println(lista.contains("Celso"));
		
		//Devuelve la posicion donde s encuentra el elemento la primera vez
		System.out.println(lista.indexOf("Andre"));
		//Devuelve la ultima posicion donde s encuentra el elemento 
		System.out.println(lista.lastIndexOf("Emanuel"));
		//Eliminar un elemento de la lista
		lista.remove(5);
		System.out.println(lista);
		//Añadir valor en una determinada posicion
		lista.add(3, "Gustavo");//Se agrga el elemento y se desplaza
		//los siguientes valores
		System.out.println(lista);
		//Reemplazar el elemento de alguna posicion
		lista.set(2, "Omar");
		System.out.println(lista);
		
		//Imprimir los valores de mi lista en cada linea con un ciclo
		for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
			
		}
		//Puedo declarar una lista sin parametrizar
		List coleccion = new ArrayList();
		
		coleccion.add("Alex");
		coleccion.add(1);
		coleccion.add(2.34);
		coleccion.add(true);
		coleccion.add('a');
		
		System.out.println(coleccion);

	}

}
