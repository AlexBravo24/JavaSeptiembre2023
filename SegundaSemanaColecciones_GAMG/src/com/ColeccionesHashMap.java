package com;

import java.util.HashMap;
import java.util.Map;

public class ColeccionesHashMap {

	public static void main(String[] args) {
		
		// La interfaz Map asocia 
		//claves a valores almacenados
		//Las claves no pueden duplicarse
		
		//Esto permite que los elementos se almacenen
		//en pares
		
		//Declarar un HashMap, el primer valor será la llave
		//o ID (identificador) y el segundo valor será 
		//el elemento a guardar
		
		Map<Integer, String> usuarios = new HashMap<Integer,String>();
		
		//Agregar elementos a nuestro HashMap
		usuarios.put(1, "Omar");
		usuarios.put(2, "Celso");
		usuarios.put(5,"Oswaldo");
		usuarios.put(3,"Emmanuel");
		
		//Imprimir en pantalla los valores de mi HashMap
		System.out.println(usuarios);
		
		//Imprimir un solo valor
		System.out.println(usuarios.get(5));
		
		//Eliminar un valor
		usuarios.remove(3);
		System.out.println(usuarios);
		
		//Ejemplo de un HashMap en el que la llave es un tipo de dato String
		Map<String,Double> salarios = new HashMap <String, Double>();
		
		salarios.put("Omar", 15000.50);
		salarios.put("Oswaldo", 17500.50);
		
		//Imprimir un valor
		System.out.println(salarios.get("Omar"));
		
		//Imprimir en consola las llaves contenidas en el HashMap
		System.out.println(usuarios.keySet());
		
		//Imprimir en consola los valores contenidos en el HashMap
		System.out.println(usuarios.values());
		
		//Mandamos a imprimir en cada una de las llaves
		//con un for each
		for(Integer i: usuarios.keySet()) {
		System.out.println(i);
		}

		//Imprimir cada uno de los valores String
		for(String i: usuarios.values()) {
			System.out.println(i);
			}

		//Imprimir juntos llaves y valores
		for(Integer i: usuarios.keySet()) {
			System.out.println("Llave: " + i + " Valores: "+ usuarios.get(i));
			}
	}

}
