package com;

public class ArrayBidimensional {

	public static void main(String[] args) {
		// ArrayBidimensional [][][][]
		//pasamos al concepto de tabla 
		//imaginandolo graficamente lo podemos asemejar a una tabla 
		
		// para declarar un array bidimensional 
		
		int [] [] matriz = new int [3][3]; //la primera nos indica las columnas  (lo vertical)y la segunda ls filas (lo horizontal), representan el tamaño, pero inicia de 0,1,2
		
		matriz [0][0]=1;
		matriz [0][1]=2;
		matriz [0][2]=3;

		matriz [1][0]=4;
		matriz [1][1]=5;
		matriz [1][2]=6;
		
		matriz [2][0]=7;
		matriz [2][1]=8;
		matriz [2][2]=9;
		
		//delcarar una matriz con valores asignados 
		int [] [] matriz2 = {{1,2,3},{4,5,6},{7,8,9}};
		
		//imprimir un solo valor en pantalla
		System.out.println(matriz2[0][2]);//aqui imrpime el numero 3 
		
		//imprimir todos los valores de nuestro array bidimensional 
		//con dos ciclos anidados
		
		for (int i = 0; i<3;i++) {
			for(int j = 0; j<3;j++) {
				System.out.print((matriz2[i][j])+ " ");
			}
			System.out.println();
		}
		
		
		
		//la teoria die que los array nos permiten almacenar datos de un tipo en comun 
		
		Object nuevo;
		Object [] arreglo = {1,"Omar",'e',true};
		
		//podemos "almacenar" mas de un tipo de dato diferente al crear un arreglo de la clase Objeto
		//ó un arreglo de objetos (tipos de datos no primitivos)
		
	}

}
