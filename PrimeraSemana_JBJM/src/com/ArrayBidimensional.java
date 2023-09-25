package com;

public class ArrayBidimensional {

	public static void main(String[] args) {
		
		// ArrayBidimensional -             [][][]
		//pasamos al concepto de tabla      [][][]
		//imaginandolo graficamente         [][][]
		//lo podemos asemejar a una tabla
		
		//Declarar un array de dos dimensiones
		
		int [][] matriz = new int [3] [3]; //[filas columnas]
		
		matriz[0][0]=1;
		matriz[0][1]=2;//[1][2][3]
		matriz[0][2]=3;
		
		matriz[1][0]=4;
		matriz[1][1]=5;//[4][5][6]
		matriz[1][2]=6;
		
		matriz[2][0]=7;
		matriz[2][1]=7;//[7][8][9]
		matriz[2][2]=7;
		
		//Declarar una matriz con valores asignados
		int [][] matriz2 = {{1,2,3,},{4,5,6},{7,8,9}};
		
		//imprimir un solo valor en patalla de nuestra matriz
		System.out.println(matriz2[0][2]);
		
		//Imprimir todos lo valores de nuestro array bidimensional 
		//con dos ciclos anidados
		
		for (int i = 0; i <3; i++) {
			for (int j = 0; j < 3 ; j++ ) {
				System.out.print(matriz2[i][j] + " ");
			}
			System.out.println();
		}
		
		
		//La teoria dice que los arrays nos permiten almacenar
		//una determinada cantidad de datos de un tipo en comun
		
		//int. double, char, String (tipo de dato objeto)
		
		
		Object nuevo;
		
		Object [] arreglo = { 1, "Alex",'e',true};
		
		//Podemos "almacenar" mas de un tipo de dato diferente
		//al crear un arreglo de la clase Objeto
		//o un arreglo de objetos (tipos de datos no primitivos)

	}

}
