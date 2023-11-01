package com;

public class ArrayBidimensional {

	public static void main(String[] args) {
		// Array Bidimensional -                [] [] [] [] [] [] [] []
        // pasamos al concepto de tabala        [] [] [] [] [] [] [] []
		// Imaginanadolo gráficamente, se puede asemejar a una tabla
		//Se declara un array de dos dimensiones 
		//El aaray bidimensional es conocido como matriz
		
		int [] [] num = new int [3] [3];
		num [0] [0] = 1;
		num [0] [1] = 0;
		num [0] [2] = 1;
		
		num [1] [0] = 0;
		num [1] [1] = 1;
		num [1] [2] = 0;
		
		num [2] [0] = 0;
		num [2] [1] = 0;
		num [2] [1] = 0;
		
		int [] [] num2 = {{1, 2, 3}, {0, 1, 1}, {2, 4, 1}};
		System.out.println(num2 [2] [0]);
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(num [i] [j] + " ");
			}
			System.out.println();
		}
		System.out.println();
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(num2 [i] [j] + " ");
			}
			System.out.println();
		}
		
		// La teoría nos dice que los arrays nos permiten almacenar una determinada cantidad de datos en un tipo en común
		// int, double, char, string (tipo de dato objeto) 
		
		Object [] nuevo = {1, "2", 'e', 2.3f};
		
		for (int i = 0; i < nuevo.length; i++) {
			System.out.println(nuevo [i]);
		}
		
		//Podemos almacenar más de un tipo de dato diferente al crear un arreglo de la clase objeto, o un arreglo de 
		//objetos (tipos de datos no primitivos)
	}
}
