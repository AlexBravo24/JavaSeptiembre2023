package com;

import java.util.ArrayList;
import java.util.List;

public class ColeccionesListas {

	public static void main(String[] args) {
		
		
		//Una lista es una coleccion de datos 
		//que es definida por una sucesion de elemenntos
		//Se implentan mediante la interface List
		//Admiten Valores duplicados
		//Se basa en un array redimensionable que 
		//aumenta su tamaño segun crece la coleccion 
		//de elementos
		//Es de las mas utilizadas y con mejor 
		//rendimiento 
		//No podemos guardar elementos de tipo primitivo
		//Pero si podemos guardar datos de tipo Wrapper
		
		//Declarando una lista 
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
		//Devuelve un valor booleano si el elemento existe en la lista
		System.out.println(lista.contains("Celso"));
		//Devuelve la posicion donde se etiquetan al elemento la primera vez 
		System.out.println(lista.indexOf("Andre"));
		//Devuelve la ultima posiciondonde se encuentra al elemento 
		System.out.println(lista.lastIndexOf("Andre"));
		//Eliminar un elemento de la lista 
		System.out.println(lista);
		lista.remove(5);
		System.out.println(lista);
		//Anadir un nuevo valor en una determinada posicion
		lista.add(3, "Gustavo");//Se agrega el elemento posicion
		//los atributos valores
		System.out.println(lista);
		//Reemplazando  el valor de un elemento en alguna posicion 
		lista.set(2,"Omar");
		System.out.println(lista);
		
		//Imprimir los valores de mi lista en  cada linea con 
		//un cielo
		for (int i=0; i <lista.size(); i++) {
			System.out.println(lista.get(i));
		}
		
		//Puedo Declarar una lista sin parametros
		List coleccion = new ArrayList();
		
		coleccion.add("Alex");
		coleccion.add(1);
		coleccion.add(2.34);
		coleccion.add(true);
		coleccion.add('a');
		
		System.out.println(coleccion);
		
		
		
		
		
	

	}

}
