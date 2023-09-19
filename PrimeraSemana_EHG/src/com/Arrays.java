package com;

public class Arrays {

	public static void main(String[] args) {
		
		

		// Los Arrays - Arreglos - Vector
		// Estos son una estructura que nos permite almacenar
		//un conjunto de datos de un tipo en común
		//Los arrays deben contar con un tamaño definido
		//Y no pueden crecer en tiempo de ejecución
		
		int numero = 4; //[4]
		
		//Declarar un array de numeros enteros
		int [] numeros;
		
		//Declarar un array de numeros enteros
		//con su tamaño declarado
		int [] numeros2 = new int[5];
		
		//Los valores se almacenan en el array
		//de acuerdo a un índice de posiciones
		//[5],[10],[11],[12]
		
		numeros2[0]=5;
		numeros2[1]=10;
		numeros2[2]=11;
		numeros2[3]=12;
		
		//Mandar a imprimir en consola un determinado valor de mi array
		System.out.println(numeros2[3]);
		
		//Agregar una posición más y almacenar otro número
		numeros2[4]=13;
		
		//Declarar un array con valores asignados inicialmente
		int [] numeros3 = {1,2,3,4,5};
		
		//Imprimir en consola todos los valores de un array
		System.out.println(numeros3);
		
		for (int i = 0; i < numeros3.length; i++) {
			System.out.print(numeros3[i]);
		}
		System.out.println();
		
		//Declarando un Array con caracteres
		char [] conjunto = {'A','l','e','x'};
		
		System.out.println(conjunto);
		
//		for (int i = 0; i < conjunto.length; i++) {
//			System.out.print(conjunto[i]);
//		}
//		System.out.println();
		//Declarar un Array de elementos String
		
		String [] nombres = {"Gustavo", "André", "Omar", "Israel","Victor"};
		
		System.out.println(nombres);
		
		//Incluyendo una condición en un ciclo para mostrar unicamente
		//a los nombres que contienen la letra "a"
		for (int i = 0; i < nombres.length; i++) {
			if(nombres[i].contains("a")) {
				System.out.println(nombres[i]);
			}
		}
		
//		for (int i = 3; i < nombres.length; i++) {
//			System.out.println(nombres[i]);
//		}
		
		
		//Mostrar todos los elementos de un array, puedo emplear
		//un ciclo for each
		
		//Para cada elemento de este tipo de dato, contenido en:
//		for (String i:nombres) {
//			System.out.println(i);
//		}
		
	}
				

}
