package com;

import java.util.HashMap;
import java.util.Map;

public class ColeccionesHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String, Integer> usuarios = new HashMap<String, Integer>();
		
		usuarios.put("OMAR", 1);
		usuarios.put("BELLA", 2);
		usuarios.put("REYMUNDO", 3);
		usuarios.put("MARIO", 4);
		usuarios.put("ELIZETH", 5);
		
		System.out.println(usuarios);
		
		System.out.println(usuarios.get(4));
		
		usuarios.remove(3);
		System.out.println(usuarios);
		
		Map<String, Double> salarios = new HashMap<String, Double>();
		
		salarios.put("OMAR", 150000.00);
		salarios.put("RAYMUNDO", 70000.00);
		
		System.out.println(salarios.get("OMAR"));
		
		System.out.println(usuarios.keySet());

		System.out.println(usuarios.values());


		for(String i: usuarios.keySet()) {
			System.out.println(i);
		}
		
		for(Integer i: usuarios.values()) {
			System.out.println(i);
		}
		
		for(String i: usuarios.keySet()) {
			System.out.println("Llaves: " + i + "Valor: " + usuarios.get(i));
		}
		
	}

}
