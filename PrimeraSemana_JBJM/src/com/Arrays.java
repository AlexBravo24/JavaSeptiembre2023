package com;

public class Arrays {

	public static void main(String[] args) {
		
		// Los Arrays - Arreglos - vector 
		//Estos son una estructura que nos permite almamacenar 
		//un conjunto de datos de un tipo en comun
		//los arrrays deben de contar con un tamaño definido
		//Y no pueden crecer en tiempo de ejecucion 
		
		int numero = 4 ; //[4]
		
		//Declarar un array de numeros enteros 
		int [] numeros ;
		
		//Declarar un array de numeros enteros
		//con su tamaño declarado
		int  [] numeros2 = new int [5];
		
		//Los valores se almacena en ele arrray 
		//de acuerdo a un indice de posicciones 
		//[5],[10],[11],[12]
		
		numeros2[0]=5;
		numeros2[1]=10;
		numeros2[2]=11;
		numeros2[3]=12;
		
		//Mandar a imprimir en consola un determinado valor de mi array
		System.out.println(numeros2[3]);
		
		//Agregar una posicion mas y almacenar otro numero
		numeros2[4]=13;
		
		//Declar un arraycon valores asignados inicialmente
		int [] numeros3 = {1,2,3,4,5};
		
		//imprimir en consola todos los valores de un array 
		System.out.println(numeros3);
		
		for (int i = 0; i < numeros3.length; i++) {
			System.out.println(numeros3[i]);
		}
		
		//Declarando un Array con caracteres 
		char [] conjunto = {'A','I','e','x'};
		
		System.out.println(conjunto);
		
		for (int i= 0; i < conjunto.length; i++) {
			System.out.println(conjunto[i]);
		}
		
		
		//Declarar un Array de elementos de String 
		
		String [] nombres = {"Gustabo", "Andre", "Omar", "Israel", "Victor"};
		
		System.out.println(nombres);
		
//		for (int i = 0; i < nombres.length; i++) {
//			System.out.println(nombres[i]);
//		}
		
		//Incluyedo una condicion en un ciclo para mostrar unicament
		//a los nombres que contienen la letra "a"
		for (int i = 0; i < nombres.length; i++) {
			if (nombres[i].contains ("a")) {
			    System.out.println(nombres[i]);
			}
		}
		
//		for (int i = 3; i< nombres.length; i++) {
//			System.out.println(nombres[i]);
//		}
//		
//		
		
		//Mostrar todos los elementos de un array, puedo emplear 
		//un ciclo for each
		
		
		//Para cada elemento de este tipo de dato, contenido en:
//		for (String i:nombres ) {
//			System.out.println(i);
//		}
//		
		
		
	
	}

	public static boolean equals(int[] lista, int[] listaprueba) {
		// TODO Auto-generated method stub
		return false;
	}

}
