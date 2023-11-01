package com;

public class Arrays {

	public static void main(String[] args) {
		// Los Arrays  - Arreglos - Vector 
		// Estos son una esctructura que nos permite almacenar
		// un conjunto de datos de un tipo en com�n. 
		// Los arrays deben contar con un tama�o definido
		// y no pueden crecer en tiempo de ejecuci�n.
		
		int numero = 4; //Se guarda el n�mero en un espacio de memoria [4]
		
		// Declarar un array de n�meros enteros 
		int [] numeros; 
		
		// Declarar un array de numeros enteros
		// con su tama�o declarado
		int [] numeros2 = new int[5];
		
		// Los valores se almacenan en el array
		// de acuerdo a un indice de posiciones
		// [5],[10],[11],[12]
		
		numeros2 [0] = 5;
		numeros2 [1] = 10;
		numeros2 [2] = 11;
		numeros2 [3] = 12;
		
		// Mandar a imprimir en consola un determinado valor de mi array
		System.out.println(numeros2[3]);
		
		//Agregar una posici�n m�s y almacenar otro n�mero. 
		numeros2 [4] = 13; //Es necesario modificar el n�mero de posiciones en la declaraci�n del array, se modific� de 4 a 5
		
		//Declarar un array con valores asignados inicialmente
		int [] numeros3 = {1,2,3,4,5};
		
		//Imprimir en consola todos los valores de un array
		System.out.println(numeros3);  //Esto arroja un valor err�neo
		
		for(int i=0; i<numeros3.length;i++) {
			System.out.print(" " + numeros3[i]);
		}
		
		System.out.println();
		
		//Declarando un Array con caracteres
		char [] conjunto = {'A','l','e','x'};
		
		System.out.println(conjunto); //Para los caracteres si imprime el arreglo directamente
		
		for(int i=0; i<conjunto.length; i++) {
		System.out.print(conjunto[i]);	
		}
		System.out.println();
		
		//Declarar un array de elementos String
		String[] nombres = {"Gustavo", "Andr�","Omar","Israel","Victor"};
		
		System.out.println(nombres); //Esto arroja un valor erroneo 
		
//		for(int i=0; i<nombres.length; i++) {
//			System.out.println(nombres[i]);
//		}
		
		//Incluyendo una condicion en un ciclo para mostrar unicamente
		//a los nombres que contienen la letra "a"
		for(int i=0; i<nombres.length;i++) {
			if(nombres[i].contains("a")) {
				System.out.println(nombres[i]);
			}
		}
		
		//Mostrar todos los elementos de un array, puedo emplear
		// ciclo For Each
		
		for (String i:nombres) {
			System.out.println(i);
		}
		
		
		
		
		
		

	}

}
