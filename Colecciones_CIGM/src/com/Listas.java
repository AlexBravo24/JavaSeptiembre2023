package com;

import java.util.ArrayList;
import java.util.List;

public class Listas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> listaDeNombres = new ArrayList<>();

        
        listaDeNombres.add("Juan");
        listaDeNombres.add("Mar�a");
        listaDeNombres.add("Pedro");
        listaDeNombres.add("Ana");

       
        System.out.println("Primer nombre: " + listaDeNombres.get(0));
        System.out.println("Segundo nombre: " + listaDeNombres.get(1));

        
        System.out.println("Lista de nombres:");
        for (String nombre : listaDeNombres) {
            System.out.println(nombre);
        }

    
        String nombreBuscado = "Mar�a";
        if (listaDeNombres.contains(nombreBuscado)) {
            System.out.println(nombreBuscado + " est� en la lista.");
        } else {
            System.out.println(nombreBuscado + " no est� en la lista.");
        }

        
        String nombreAEliminar = "Pedro";
        listaDeNombres.remove(nombreAEliminar);
        System.out.println(nombreAEliminar + " ha sido eliminado.");

        
        System.out.println("Tama�o de la lista: " + listaDeNombres.size());
	}

}
