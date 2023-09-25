package com;

import java.util.HashMap;
import java.util.Map;

public class ColeccionesHashMap {

	public static void main(String[] args) {
		// La interfaz Map asocia claves o valores almacenados
		//las claves no pueden duplicarse 
		
		//esto permite que los elementos se almacenenen pares
		
		
		//declaramos un hashmap, el primer valor será la llave o ID, y el segundo valor
		//será el elemento a guardar
		
		Map<Integer, String> usuarios = new HashMap <Integer, String>();
		
		usuarios.put(1, "omar");
		usuarios.put(2, "Celso");
		usuarios.put(3, "Emanuel");
		usuarios.put(5, "Gustavo");
		
		//imprimir los valores de mi hashmap
		System.out.println(usuarios);
		
		//imprimir un solo valor
		System.out.println(usuarios.get(5));
		
		//eliminar un valor
		
		usuarios.remove(3);
		System.out.println(usuarios);
		
		//ejemplo de un hashmap en el que la llave es un elemento de tipo String
		Map<String,Double> salarios = new HashMap <String,Double>();
		salarios.put("Omar", 15000.50);
		salarios.put("Emanuel", 12000.59);
		
		//imprimir un valor
		System.out.println(salarios.get("Omar"));
		
		//imprimir en consola las llaves contenidas en el map 
		System.out.println(usuarios.keySet());
	
		//imprimir en consola los valores contenidos en el Hashmap 
		
		System.out.println(usuarios.values());
		
		//mandamos a imprimir cada una de las llaves con un for each 
		
		for(Integer i: usuarios.keySet()) {
			System.out.println(i);
		}
		
		//imprimir cada uno de los valores String 
		for(String i: usuarios.values()) {
			System.out.println(i);
		}
		
		
		//imprimir juntos llaves y valores 
		for(Integer i: usuarios.keySet()) {
			System.out.println("llave " + i + " usuario " + usuarios.get(i));
			
		}
		
	}

}
