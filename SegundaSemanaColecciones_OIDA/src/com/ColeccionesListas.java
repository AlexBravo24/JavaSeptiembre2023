package com;

import java.util.ArrayList;
import java.util.List;

public class ColeccionesListas {

	public static void main(String[] args) {
		// Una lista es una coleccion de datos que es definida por una sucecion de elementos 
		//se implementan mediante la interface List, admiten valores duplicados
		//se basa en un array redimensionable que aumenta su tamaño segun crece la coleccion de elementos 
		//son de las mas utilizadas y con mejor rendimiento 
		//no podemos guardas elementos de tipo primitivo pero si podemos guardar datos de tipo wrapper
		
		//Declarando una lista de elementos tipo String
		List<String> lista = new ArrayList<String>();
		
		//Agregar valores a esta lista 
		lista.add("Omar");
		lista.add("Andre");
		lista.add("Celso");
		lista.add("Eliaz");
		lista.add("Emmanuel");
		lista.add("Omar");
		System.out.println(lista);
		
		//imprimir y acceder un solo valor de la lista 
		System.out.println(lista.get(0));
		
		//Devolver un valor booleando si el elemento existe en la lista 
		System.out.println(lista.contains("Luis"));
		System.out.println(lista.contains("Omar"));
		
		//devuelve la posicion donde se encuentra el elemento la primera vez
		System.out.println(lista.indexOf("Omar"));
		//devuelve la posicion donde se encuentra el elemento la ultima vez
		System.out.println(lista.lastIndexOf("Omar"));
		//Eliminar elemento de la lista 
		System.out.println(lista);
		lista.remove(5);
		System.out.println(lista);
		//añadir un nuevo valor en una determinada posicion
		lista.add(3, "Gustavo");//se agrega el elemento y se desplazan los siguientes valores
		System.out.println(lista);
		//reemplazar el valor de un elemento en alguna posicion
		lista.set(2, "Alex");
		System.out.println(lista);
		
		//imprimir los valores de la lista en cada linea con un ciclo 
		
		for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
		}
	
		
		//puedo declarar una lista sin parametrizar 
		List<Object> coleccion = new ArrayList <Object>();
		
		coleccion.add("Alex");
		coleccion.add(1);
		coleccion.add(2.1);
		coleccion.add('a');
		
		System.out.println(coleccion);
		
	}

}
