package com.ejercicios;

import java.util.Scanner;

import javax.swing.text.html.HTMLDocument.HTMLReader.ParagraphAction;

public class ProblemasArray {
	/**
	 * @author Emmanuel Arcos Pérez
	 * @param Crea un array de 10 posiciones de números con valores pedidos por
	 *             teclado Muestra por consola el índice y el valor al que
	 *             corresponde.
	 **/
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
	}/*
		 * public void multiplicacionDeIteracion() { System.err.
		 * println("*** Tabla de multiplicación de iteracion que desea el usuario ***");
		 * Scanner entradScanner = new Scanner(System.in);
		 * System.out.println(" Ingresa el primer valor donde desea iniciar "); int
		 * value = entradScanner.nextInt();
		 * System.out.println(" Ingresa el segundo valor donde desea finalizar"); int
		 * value1 = entradScanner.nextInt(); if (value1 > value) { for (int i = value; i
		 * <= value1; i++) { System.out.println(value + " * " + i + " = " + (value *
		 * i)); } } else { System.err.println("El valor " + value1 +
		 * " tiene que ser mayor que " + value); } }
		 */

	/**
	 * @param 2.- Crea un array de números de 100 posiciones, que contendrá los
	 *            números del 1 al 100. Obtén la suma de todos ellos y la media.
	 */
	public void sumaDeArray() {
		int[] array = new int[15];// qui se define el tamaño
		float media = 0f;
		int suma_arreglo = 0;
		for (int i = 0; i < array.length; i++) {
			int valor_array = 1;
			valor_array += i;
			System.out.println("Ingresa el valor " + valor_array);
			array[i] = entradScanner.nextInt();
			suma_arreglo = suma_arreglo + array[i];
		}
		System.err.println("Suma de los valores de arreglo: " + suma_arreglo);
		media = (float) suma_arreglo / array.length;
		System.err.println("La media: " + media);

	}

	/**
	 * @param palabra
	 * @return 3.- Pide al usuario por teclado una frase y pasa sus caracteres a un
	 *         array decaracteres.
	 */
	public void name() {
		String palabraString = "Hola";
		char datCharacter;
		char[] poscicion = new char[palabraString.length()];

		for (int i = 0; i < palabraString.length(); i++) {
			poscicion[i] = palabraString.charAt(i);
		}
		System.out.println((poscicion).getClass().getSimpleName());
		System.out.println((poscicion[1]));

	}

	/**
	 * @param
	 * @return 4.- Dado un array de números de 5 posiciones con los siguientes
	 *         valores: {1,2,3,4,5}. Guardar los valores de este array en otro array
	 *         distinto pero con los valores invertidos, es decir, que el segundo
	 *         array deberá tener los valores {5,4,3,2,1}.
	 */
	public void numeroDePosicion() {
		int[] array = { 1, 2, 3, 4, 5 };/// aqui se agrega los valores
		int[] new_array = new int[array.length];
		for (int i = 0; i < array.length; i++) {
			int varia_tempo = array.length - i - 1;
			new_array[varia_tempo] = array[i];

		}
		array = new_array;
		for (int i = 0; i < new_array.length; i++) {
			System.err.print(array[i] + " ");
		}
	}

	/**
	 * @param
	 * @return 5.- Crea dos arrays, uno para mostrar n productos y otro para mostrar
	 *         sus respectivos precios. Muestra en consola la lista de productos y
	 *         sus precios. Por lo menos 5 productos o artículos.
	 */
	public void MostrarProducts() {
		boolean exit_ = false;
		String[] producto = {};
		int[] precio= {};
		//Hay que difinir un while ParagraphAction sabeAction n cantidad
		  // Definir dos arreglos, uno para productos y otro para precios
        String[] productos = {"MAnzana", "frijol ", "maiz", "calabaza", "Caf'e"};
        double[] precios = {10.99, 20.50, 5.75, 15.99, 8.49};

        // Mostrar la lista de productos y sus precios
        System.out.println("Lista de productos y precios:");
        for (int i = 0; i < productos.length; i++) {
            System.out.println(productos[i] + ": $" + precios[i]);
        }
		
}
	}
