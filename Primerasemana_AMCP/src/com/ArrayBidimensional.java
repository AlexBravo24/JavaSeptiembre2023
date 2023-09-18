package com;

public class ArrayBidimensional {

	public static void main(String[] args) {
		
		
		//ArrayBidimensional =         [][][][][][][][][][]
		//pasamos al concepto de tabla [][][][][][][][][][]
		//imaginandolo gráficamente
		//Lo podemos asemejar a una tabla
		
		//El array bidimensional es también conocido como
		//matríz
		
		//Declarar un Array de dos dimensiones
		
		int [][] matriz = new int [3][3]; //[Filas] [columnas]
		
		matriz[0][0]=1;
		matriz[0][1]=2;  //[1][2][3]
		matriz[0][2]=3;
		
		matriz[1][0]=4;
		matriz[1][1]=5;  //[4][5][6]
		matriz[1][2]=6;
		
		matriz[2][0]=7;
		matriz[2][1]=8;  //[7][8][9]
		matriz[2][2]=9;
		
		//Declarar una matríz con valores asignados
		int [][] matriz2 = {{1,2,3},{4,5,6},{7,8,9}};
		
		//Imprimir un solo valor en pantalla de nuestra matríz
		System.out.println(matriz2[0][2]);
		
		//Imprimir todos los valores de nuestro array bidimensional
		//con dos ciclos anidados
		
		for (int i = 0; 1 < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.println(matriz2[i][j] + " ");
		}
		System.out.println();
		 
			
		}
		
		//La teoría dice que los arrays nos permiten almacenar
		//una determinada cantidad de datos de un tipo en común
		
		//int, double, char, String, etc
		
		Object nuevo;
		
		Object[] arreglo = {1,"Alex","e",true}; 
		
		//Podemos "almacenar" más de un tipo de dato diferente
		//al crear un arreglo de la clase objeto
		//o un arreglo de objetos (tipos de datos no primitivos)

		}
		
	}	



