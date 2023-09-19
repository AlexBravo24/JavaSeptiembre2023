package arrays;

import java.util.Scanner;

public class Arrays1_EHG {

	public static void main(String[] args) {
		// Crea un array de 10 posiciones de números con valores pedidos por teclado.
		// Muestra por consola el índice y el valor al que corresponde.
		
		
		Scanner entrada  = new Scanner(System.in);
		
	  int[]numerosx = new int[10];
	  
	  for (int i = 0; i < numerosx.length; i++) {
		  System.out.println("Introduce un numero");
		  numerosx[i] = entrada.nextInt();
		  
		  }
	  for(int j:numerosx) {
		  System.out.println(j);
	  }
	  
		
			
		}
		
		

	

}
