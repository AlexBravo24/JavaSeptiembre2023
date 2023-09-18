package com;

public class Arrays {

	public static void main(String[] args) {
		// Los Arrays - Arreglos - Vector
		//Estos son una estructura que nos permite almacenar un conjunto de datos de un tipo en comun
		//Los arrays deben contar con un tamaño definido y no pueden crecer en tiempo de ejecucion
		
		int numero = 4; //Dato guardado en memoria [4]
		
		//Declarar un array de numeros enteros
		int [] numeros;
		
		//Declarar un array de numeros enteros con su tamaño declarado
		int [] numeros2 = new int[5];
		
		//Los valores se almacenan en el Array de acuerdo a un indice de posiciones
		//[5], [10], [11], [12]
		
		numeros2 [0]=5;
		numeros2 [1]=10;
		numeros2 [2]=11;
		numeros2 [3]=12;
		
		//Mandar a imprimir en consola un determinado valor de mi array
		System.out.println(numeros2[3]);
		
		//Agregar una posicion mas y almacenar otro numero
		numeros2[4]=13;
		
		//Declarar un array con valores asignados inicialmente
		int [] numeros3 = {1,2,3,4,5};
		
		//Imprimir en consola todos los valores de un array
		System.out.println(numeros3);
		
		for (int i = 0; i < numeros3.length; i++) {
			System.out.print(numeros3[i]);
		}
		System.out.println();
		//Declarando Array con caracteres
		char [] conjunto = {'A', 'l', 'e', 'x'};
		
		System.out.println(conjunto);
		
		for (int i = 0; i < conjunto.length; i++) {
			System.out.print(conjunto[i]);
			
		}
		System.out.println();
		//Declarar un array en el elemento String
		
		String [] nombres = {"Gustavo", "Andre", "Omar", "Israel", "Victor"};
		
		System.out.println(nombres);
		
		for (int i = 0; i < nombres.length; i++) {
			System.out.println(nombres[i]);
			
		}
		
		System.out.println(nombres);
		
		//Incluyendo una condicion en un ciclo para mostrar unicamente a los nombres
		//que contienen letra "a"
		for (int i = 0; i < nombres.length; i++) {
			if(nombres[i].contains("a")) {
				System.out.println(nombres[i]);
			}
		}
		
		//Mostrar todos los elementos de un array, puedo emplear un ciclo for each
		
		for (String i:nombres) {
			System.out.println(i);
		}
		
		
	}

	
	

	
	
	
}
