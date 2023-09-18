package com;

public class ArrayBidimencional {

	public static void main(String[] args) {
		// ArrayBidimencional -  [] [] [] [] [] [] []  "una sola fila"
		//pasamos al concepto de tablas  "filas y columnas"
		// imaginandolo graficamente 
		//lo podemos asemejar a una tabla 
		
		//El array bidimensional es tambien conocido como matriz 
		
		//Declarar un Array de dos dimensiones 
		
		int [] [] matriz = new int [3] [3];  // `[filas] [columnas] 
		                       // [] [] []
                               // [] [] [] 
		                       // [] [] [] 
		// el primer indice indica las filas 
		// el segundo indica las columnas 
		matriz [0][0]=1;
		matriz [0][1]=2; // [1] [2] [3]
		matriz [0][2]=3;
		
		matriz [1][0]=4;
		matriz [1][1]=5; // [4] [5] [6]
		matriz [1][2]=6;
		
		matriz [2][0]=7;
		matriz [2][1]=8; // [7] [8] [9]
		matriz [2][2]=9;
		
		//Declarar una matriz con valores asignados 
		
		int [] [] matriz2 = {{1,2,3},{4,5,6},{7,8,9}};
		
		//Imprimir un solo valor  en pantalla de nuestra matriz 
		System.out.println(matriz2[0][2]);
		
		//Imprimir todo los valores de nuestro array bidimensional 
		//con dos ciclos anidados 
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(matriz2[i][j]+" ");
					
			}
			System.out.println();
		}
		
		// LA teoia dice que los array no spermiten almacenar 
		//una determinada cantidad de datos de un tio en comun 
		
		//int, double, char, String(tipo de dato objeto)
		
		
		Object nuevo;
		
		Object [] arreglo = {1,"alex","e",true};
		
		//Podemos "almacenar" mas de un tipo de dato diferente 
		//al crear un arreglo de la clase Objeto 
		//o un arreglo de objetos(tipos de  datos no primitivos)
		
		
	}

}
