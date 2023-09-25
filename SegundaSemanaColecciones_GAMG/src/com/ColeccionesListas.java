package com;

import java.util.ArrayList;
import java.util.List;

public class ColeccionesListas {

	public static void main(String[] args) {
		
		//Una lista es una colección de datos
		//que es definida por una sucesión de elementos
		//Se implementan mediante la interface List
		//Admite valores duplicados 
		//Se basa en un array redimensionable que 
		//aumenta su tamaño según crece la colección de elementos
		//Es de las más utilizadas y con mejor
		//rendimiento.
		
		//No podemos guardar elementos de tipo primitivo
		//Pero si podemos guardar datos de tipo Wrapper
		
		//Declarando una lista
		List<String> lista = new ArrayList<String>();
		
		//Agregar valores a esta lista
		lista.add("André");
		lista.add("Celso");
		lista.add("César");
		lista.add("Eliaz");
		lista.add("Emmanuel");
		lista.add("André");
		
		System.out.println(lista);
		
		//Imprimir y acceder aun solo valor o nombre de la lista
		System.out.println(lista.get(0));
		//Devolver un valor booleano si el elemento existe en la lista
		System.out.println(lista.contains("Celso"));
		//Devuelve la posición donde se encuentra al elemento la primera vez
		System.out.println(lista.indexOf("André"));
		//Devuelve la posición donde se encuentra al elemento
		System.out.println(lista.lastIndexOf("André"));
		//Eliminar un elemento de la lista
		System.out.println(lista);
		lista.remove(5);
		System.out.println(lista);
		//Añadir un nuevo valor en una determinada posición
		lista.add(3, "Gustavo"); //Se agrega el elemento y se desplazan 
		//los siguientes valores 
		System.out.println(lista);   
		//Reemplazar el valor de un elemento en alguna posición
		lista.set(2, "Omar");
		System.out.println(lista);
		
		//Imprimir los valores de mi lista en cada línea con
		//un ciclo
		for(int i=0; i<lista.size();i++) {
			System.out.println(lista.get(i));
		}
		
		//Puedo declarar una lista sin parametrizar
		List <Object>coleccion = new ArrayList<Object>();
		
		coleccion.add("Alex");
		coleccion.add(1);
		coleccion.add(2.34);
		coleccion.add(true);
		coleccion.add('a');
		
		System.out.println(coleccion);
		
	}

}
