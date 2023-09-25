package com;

import java.util.ArrayList;
import java.util.List;

public class ColeccionesLista {
	public static void main(String[] args) {
	List<String> listaDeNombres = new ArrayList<>();

    
    listaDeNombres.add("Juan");
    listaDeNombres.add("María");
    listaDeNombres.add("Pedro");
    listaDeNombres.add("Ana");

   
    System.out.println("Primer nombre: " + listaDeNombres.get(0));

    System.out.println(listaDeNombres.contains("Juan"));
    System.out.println(listaDeNombres.indexOf("maria"));
    System.out.println(listaDeNombres.lastIndexOf("maria"));
    System.out.println(listaDeNombres);
    listaDeNombres.remove(2);
    listaDeNombres.add(3, "Camilo");
    
    
    for (int i = 0; i < listaDeNombres.size(); i++) {
    	System.out.println(listaDeNombres.get(i));
    }
    
List coleccion = new ArrayList();
coleccion.add("axel");
coleccion.add(1);
coleccion.add(2.34);
coleccion.add(true);

System.out.println(coleccion);

}}
