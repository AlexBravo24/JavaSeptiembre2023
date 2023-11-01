package com.main;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//
		List<String> listas= new ArrayList<String>();
		
		///Agrregavalore a esta listas
		listas.add("Arcos");
		listas.add("Perez");
		listas.add("roberto");
		listas.add("salcedo");
		listas.add("montez");
		listas.add("Perez");
		
		System.out.print(listas);
		//imprimir y acceder a un solo vlor o nombre
		System.out.println(listas.get(0));
		//Devolver un valor boolean si el elemento existe en la lista
		System.out.println(listas.contains("Arcos"));
		//devuelve la coleccion donde se encuentra al elemento laprimera vez
		System.out.println(listas.indexOf("Perez"));
		//devuelve la ultima posicion donde se encuenta el elemento
		System.out.println(listas.lastIndexOf("Perez"));
		//eliminar el elemento lista

		System.out.println(listas);
		listas.remove(0);
		System.out.println(listas);
		//añadir un nuevo valor en una determinada posicion
		//los elementos se agregan y se desplazan los 
		//siguientes vzlores
		listas.add(3, "pepe");
		System.out.println(listas);
		//reemplazar el valor de un elemento de algun posicion
		listas.set(3, "chacra");
		System.out.println(listas);
		//imprimir los valores de mi lista en cada linea 
		//con ciclo
		for (int i = 0; i < listas.size(); i++) {
			System.out.println(listas.get(i));	
		}
		///
		for (String lista : listas) {
			System.out.println(lista);
		}
		///puedo declarar una lista sin parametrizar
		List<Object> coleccion = new ArrayList<>();
		coleccion.add("arcos");
		coleccion.add(3);
		coleccion.add(true);
		coleccion.add("a");
		coleccion.add(1.5);
		System.out.println(coleccion);
		

	}

}
