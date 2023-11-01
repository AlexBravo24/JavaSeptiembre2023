package com;

import java.util.Vector;

public class Vectores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Integer> vectorDeEnteros = new Vector<>();

        
        vectorDeEnteros.add(1);
        vectorDeEnteros.add(2);
        vectorDeEnteros.add(3);
        vectorDeEnteros.add(4);

       
        System.out.println("Primer elemento: " + vectorDeEnteros.get(0));
        System.out.println("Segundo elemento: " + vectorDeEnteros.get(1));

        
        System.out.println("Vector de enteros:");
        for (int numero : vectorDeEnteros) {
            System.out.println(numero);
        }

       
        int elementoBuscado = 3;
        if (vectorDeEnteros.contains(elementoBuscado)) {
            System.out.println(elementoBuscado + " está en el vector.");
        } else {
            System.out.println(elementoBuscado + " no está en el vector.");
        }

       
        int elementoAEliminar = 2;
        vectorDeEnteros.removeElement(elementoAEliminar);
        System.out.println(elementoAEliminar + " ha sido eliminado.");

 
        System.out.println("Tamaño del vector: " + vectorDeEnteros.size());
	}

}
