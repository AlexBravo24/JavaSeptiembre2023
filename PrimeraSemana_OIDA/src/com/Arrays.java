package com;

public class Arrays {

	public static void main(String[] args) {
		// Los arrays son arreglos. son una estructura que nos permite almacenar un cojunto de datos
		// de un tipo comun. Los arrays deben contar con un tamaño definido y no deben crecer en tiempo de ejecucion
		
		int numero = 4;
		
		//declarar un array con su tamaño inicial 
		
		int [] numeros; //aqui es array está declarado mas no inicializado 
		
		//podemos declarar un arrray de numeros enteros 
		//pero con su tamaño declarado
		
		int [] numeros2 = new int[4]; //guarda 4 numeros enteros dentro de el, pero no tiene valores
		//los valores se almacenan en el array de acuerdo a un indice de posiciones
		//[5],[10],[11],[12]
		numeros2[0]= 5;
		numeros2[1]=10;
		numeros2[2]=11;
		numeros2[3]=12;
		
		//mandar a imprimir en consola un determinado valor de mi array 
		System.out.println(numeros2[3]);// tiene que imprimir 12
		
		//agregar una posicion mas y almacenar otro numero 
		//numeros2[4]=13;//como el array tiene un tamaño especifico y no se puede cambiar, entonces al ejecutar la siguiente linea dará un error
		
		
		//declarar un array con valores asignados inicialmente 
		int[] numeros3 = {1,2,3,4,5};
		
		//imprimir en consola todos los valores de un array
		System.out.println(numeros3);
		
		for (int i = 0; i <numeros3.length; i++) {
			System.out.print(numeros3[i]);
		}
		System.out.println();
		//declarando un array con caracteres 
		char [] conjunto = {'O','M','A','R'};
		for (int i = 0; i <conjunto.length; i++) {
			System.out.print(conjunto[i]);
		}
		
		//declarar un array con elementos String 
		String [] nombres = { "Gustavo", "Andre", "Omar", "Israel", "Victor"};
		System.out.println(nombres); //aqui no lo marcaría porque sirve con caracteres y no con cadenas de texto 
		for (int i = 0; i <nombres.length; i++) {
			System.out.println(nombres[i]);
		}
		//mostrar todos los elementos de un array, puedo emplear un ciclo for each
		//para cada elemento de este tipo de datos, contenido en: 
		for (String i:nombres) {
			System.out.println(i);
		}
		//este filtro sirve para plasmar los nombres que contengan la letra a
		for (int i = 0; i <nombres.length; i++) {
			if(nombres[i].contains("a")) {
				System.out.println(nombres[i]);
			}
		}
		
	}

}
