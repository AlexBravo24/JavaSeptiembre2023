package com;

public class Arrays {

	public static void main(String[] args) {
		// Arrys - Los Arrays - Vectores
		// Son una estructura que nos permite almacenar un conjunto de datos de un mismo tipo
		// Los Arrays deben tener un tamaño definido
		// Los Arrays no pueden crecer en tiempo de ejecución
		
		// Declarar un array de números enteros
		// Declarar un array de números enteros con su tamaño declarado
		int [] numeros2 = new int [4];
		// Los valores se almacenan en el array de acuerdo a un índice de posiciones
		numeros2 [0] = 1;
		numeros2 [1] = 8;
		numeros2 [2] = 2;
		numeros2 [3] = 7;
		// Mandar a imprimir a consola mi array
		System.out.println(numeros2 [2]);
		// Agregar una posición más y almacenar otro número
		// Declarar un array con valores asignados inicialmente
		int [] numeros3 = {1, 2, 3, 4, 5};
		// Imprimir en consola todos los valores de un array
		System.out.println(numeros3);
		
		for (int i = 0; i < numeros3.length; i++) {
			System.out.print(numeros3 [i]);
		}
		System.out.println();
		
		
		for (int i = 0; i < numeros2.length; i++) {
			System.out.print(numeros2 [i]);
		}
		System.out.println();
		
		char [] conjunto = {'V', 'i', 'c', 't', 'o', 'r'};
		
		for (int i = 0; i < conjunto.length; i++) {
			System.out.print(conjunto [i]);
		}
		System.out.println();
		System.out.print(conjunto);
		
		//Declarar un array de elementos String
		
		String [] nombres = {"Itzel", "Nikte", "Víctor", "Papito", "Bisbo"};
		System.out.println(nombres);
		
		for (int i = 0; i < nombres.length; i++) {
			System.out.println(nombres [i]);
		}
		//Mostrar todos los elementos del array con un ciclo for each
		for (String i : nombres) {
			System.out.println(i);
		}
		System.out.println();
		
		for (Character i : conjunto) {
			System.out.print(i);
		}
		System.out.println();
		
		// .contains() sirve para que imprima solamente los elementos del arreglo que contenga la condición deseada
		
		for (int i = 0; i < nombres.length; i++) {
			if (nombres[i].contains("e")) {
				System.out.println(nombres[i]);
			}
		}	
		
	}

}
