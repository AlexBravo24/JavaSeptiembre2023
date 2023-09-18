package com.TablaMultiplicar;

import java.util.Scanner;

public class Arrays {
	// Crea un array de 10 posiciones de números con valores pedidos por teclado.
	// Muestra por consola el índice y el valor al que corresponde.
	Scanner entradScanner = new Scanner(System.in);

	public void arreglosPsicion() {
		int[] array = new int[10];

		System.out.println(" **** Arreglo de 10 posición");
		for (int i = 0; i < array.length; i++) {
			int valor = 1;
			valor += i;
			System.err.println("Ingresa el valor " + valor);
			array[i] = entradScanner.nextInt();
		}
		for (int i : array) {
			System.out.print(i + " ");
		}
	}
	/*
	 * Crea un array de números de 100 posiciones, que contendrá los números del 1
	 * al 100. Obtén la suma de todos ellos y la media.
	 */

	public void sumaDeArray() {
		int[] array = new int[10];//qui se define el tamaño
		int suma_arreglo = 0;
		for (int i = 0; i < array.length; i++) {
			int valor_array = 1;
			valor_array += i;
			System.out.println("Ingresa el valor " + valor_array);
			array[i] = entradScanner.nextInt();
			suma_arreglo = suma_arreglo + array[i];
		}
		System.err.println("Suma de los valores de arreglo: " + suma_arreglo);
	}
	/*
	 * Pide al usuario por teclado una frase y pasa sus caracteres a un array de
	 * caracteres
	 */
	public void fraseDeArray() {
		
	}
	/*
	 * Dado un array de números de 5 posiciones con los siguientes valores:
	 * {1,2,3,4,5}. Guardar los valores de este array en otro array distinto pero con
	 * los valores invertidos, es decir, que el segundo array deberá tener los valores
	 * {5,4,3,2,1}.
	 */
	public void numeroDePosicion() {
		int[] array = {1,2,3,4,5};///aqui se agrega  los valores
		int[] new_array =new  int[array.length];
		for (int i =0; i < array.length; i++) {
			int varia_tempo = array.length-i-1;
			new_array[varia_tempo] = array[i];
			
		}
		array=new_array;
		for (int i = 0; i < new_array.length; i++) {
			System.err.print(array[i]+" s");
		}
	}
	
	/**
	 * Crea dos arrays, uno para mostrar n productos y otro para mostrar sus
	 * respectivos precios. Muestra en consola la lista de productos y sus precios.
	 * Por lo menos 5 productos o artículos.
	 */
	public void listaDeProductos() {
		
	}
}
