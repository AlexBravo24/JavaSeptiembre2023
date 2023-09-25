package com;

import java.util.Map;
import java.util.HashMap;



public class hashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Map<String, Integer> mapaDeEdades = new HashMap<String, Integer>();

	        // Agregar elementos al HashMap
	        mapaDeEdades.put("Juan", 25);
	        mapaDeEdades.put("María", 30);
	        mapaDeEdades.put("Pedro", 28);
	        mapaDeEdades.put("Ana", 24);

	        // Acceder a valores por clave
	        String nombreBuscado = "María";
	        int edad = mapaDeEdades.get(nombreBuscado);
	        System.out.println(nombreBuscado + " tiene " + edad + " años.");

	        // Iterar a través del HashMap
	        System.out.println("Mapa de edades:");
	        for (Map.Entry<String, Integer> entry : mapaDeEdades.entrySet()) {
	            String nombre = entry.getKey();
	            int edadPersona = entry.getValue();
	            System.out.println(nombre + ": " + edadPersona + " años");
	        }

	        // Verificar si una clave está en el HashMap
	        String nombreABuscar = "Pedro";
	        if (mapaDeEdades.containsKey(nombreABuscar)) {
	            System.out.println(nombreABuscar + " está en el mapa.");
	        } else {
	            System.out.println(nombreABuscar + " no está en el mapa.");
	        }

	        // Eliminar una entrada del HashMap
	        String nombreAEliminar = "Ana";
	        mapaDeEdades.remove(nombreAEliminar);
	        System.out.println(nombreAEliminar + " ha sido eliminada del mapa.");

	        // Tamaño del HashMap
	        System.out.println("Tamaño del mapa: " + mapaDeEdades.size());
	}

}
