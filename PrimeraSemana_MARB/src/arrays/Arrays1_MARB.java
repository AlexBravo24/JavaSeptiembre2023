package arrays;

import java.util.Scanner;

public class Arrays1_MARB {

	public static void main(String[] args) {
		// Crea un array de 10 posiciones de números con valores pedidos por teclado.
		//Muestra por consola el índice y el valor al que corresponde.
		
		
		//Almacenar nnumeos en un array ingresados mediante teclado
		Scanner entrada = new Scanner(System.in);
		
//		int numeros;
//		
//		System.out.println("Introduce el primer numero");
//		numeros = entrada.nextInt();
		
		int[] numerosX = new int[10];
		
		for (int i = 0; i < numerosX.length; i++) {
			System.out.println("Introduce un numero ");
			numerosX[i]=entrada.nextInt(); 
		}
		 for(int j:numerosX) {
			 System.out.println(j);
		 }
		
		
		
		
		
		
		
		
	
	}

}
