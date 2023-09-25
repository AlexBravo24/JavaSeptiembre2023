package com;

import java.util.ArrayList;
import java.util.List;

public class Listas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> listaDeNombres = new ArrayList<>();

        
        listaDeNombres.add("Juan");
        listaDeNombres.add("María");
        listaDeNombres.add("Pedro");
        listaDeNombres.add("Ana");

       
        System.out.println("Primer nombre: " + listaDeNombres.get(0));
        System.out.println("Segundo nombre: " + listaDeNombres.get(1));

        
        System.out.println("Lista de nombres:");
        for (String nombre : listaDeNombres) {
            System.out.println(nombre);
        }

    
        String nombreBuscado = "María";
        if (listaDeNombres.contains(nombreBuscado)) {
            System.out.println(nombreBuscado + " está en la lista.");
        } else {
            System.out.println(nombreBuscado + " no está en la lista.");
        }

        
        String nombreAEliminar = "Pedro";
        listaDeNombres.remove(nombreAEliminar);
        System.out.println(nombreAEliminar + " ha sido eliminado.");

        
        System.out.println("Tamaño de la lista: " + listaDeNombres.size());
	}

}
