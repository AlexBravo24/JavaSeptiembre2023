package arrays;

import java.util.Scanner;

public class Arrays1_OIDA {
//	Crea un array de 10 posiciones de números con valores pedidos por teclado.
//	Muestra por consola el índice y el valor al que corresponde.

	public static void main(String[] args) {
		// Ejercicio 1 Crea un array de 10 posiciones de números con valores pedidos por teclado.
	    //Muestra por consola el índice y el valor al que corresponde.
	int [] numeros = new int[10];
	for(int i = 0; i <numeros.length; i++) {
		System.out.println("Introduce valor");
		Scanner entrada = new Scanner(System.in);
		numeros[i] = entrada.nextInt(); 
	}
	
	for(int o = 0; o<numeros.length; o++) {
		System.out.println("Posicion: " + o + " es " + numeros[o]);
	}
	}

}
