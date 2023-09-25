package com.coleccion;

import java.util.HashMap;
import java.util.Map;

public class ColeccionHasMap {
	public static void main(String[] args) {
		//
		
		//eso permite que lo elementos almacena en pares
		// i id (identificado )y el segundo valor sera el elemento
		//a guardar
		Map<Integer,String> usuarios= new HashMap<>();
		//agregar los elementos
		usuarios.put(1, "omsr");
		usuarios.put(2, "rober");
		usuarios.put(3, "carlos");
		usuarios.put(4, "mami");
		//imprimir los valores de mi has 
		System.out.println(usuarios);
		//imprimir un solo valor
		System.out.println(usuarios.get(1));
		//eliminar un valor
		usuarios.remove(3);
		System.out.println(usuarios);
		//ejemplo de un hasmap enei que lleva es un tipo de datos string
		Map<String, Double> salario = new HashMap<>();
		salario.put("omar", 156.96);
		salario.put("diego", 158.96);
		salario.put("pwepe", 157.96);
		salario.put("rana", 159.96);
		//imprimir un valor
		System.out.println(salario.get("rana"));
		// imprimir en cosola las llaves 
		System.out.println(salario.keySet());
		//imprimir en cosola los valores contenidos en el hasmap
		System.out.println(salario.values());
		//mandamos a imprimir cada una de las llaves 
		for (Integer i : usuarios.keySet()) {
			System.out.println(i);
		}
		//imprimir cada uno de los valores string
		for (String string : usuarios.values()) {
			System.out.println(string);
		}
		///imprimir valores juntos llaves
		for (Integer string : usuarios.keySet()) {
			System.out.println(string+"  "+usuarios.get(string)+"");
		}
		
	}

}
