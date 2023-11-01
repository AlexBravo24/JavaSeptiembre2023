package com;

import java.util.ArrayList;
import java.util.List;

public class ColeccionesListas {

	public static void main(String[] args) {
		// Una lista es una coleccion de datos que es definida por una sucesion de elementos
		//Se implementan mediante la interface List
		//Admiten valores duplicados
		//Se basa en un array redimensionable que aumenta su tama�o segun crece la coleccion de elementos
		//Es de las mas utilizadas y con mejor rendimiento
		//No podemos guardar elementos de tipo primitivo
		//Pero si podemos guardar datos de tipo Wrapper
		
		//Declarando una lista de elementos de tipo String
		List<String> lista = new ArrayList<String>();
		
		//Agregar valores a esta lista
		lista.add("Andre");
		lista.add("Celso");
		lista.add("Cesar");
		lista.add("Eliaz");
		lista.add("Emmanuel");
		lista.add("Andre");
		
		System.out.println(lista);
		
		//Imprimir y acceder a un solo valor o nombre de la lista
		System.out.println(lista.get(0));
		//Devolver un valor booleano si el elemento existe en la lista
		System.out.println(lista.contains("Celso"));
		//Devuelve la posicion donde se encuentra al elemento la primera vez
		System.out.println(lista.indexOf("Eliaz"));
		//Devuelve la posicion donde se encuentra al elemento
		System.out.println(lista.lastIndexOf("Andre"));
		//Eliminar un elemento de la lista
		System.out.println(lista);
		lista.remove(5);
		System.out.println(lista);
		//A�adir un nuevo valor en una determinada posicion
		lista.add(3, "Gustavo"); //Agrega el elemento y se desplazan los siguientes valores
		System.out.println(lista);
		//Reemplazar el valor de un elemtno en alguna posicion
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
		coleccion.add(1.34);
		coleccion.add(true);
		coleccion.add('a');
		
		System.out.println(coleccion);
		
		
	}

}

	
