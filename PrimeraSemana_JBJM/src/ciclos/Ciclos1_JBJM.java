package ciclos;

import java.util.Scanner;

public class Ciclos1_JBJM {

	public static void main(String[] args) {
		
		
		// Programa un algoritmo que realice la tabla 
		//de multiplicar del 12 
		
		   Scanner obtenerNumero = new Scanner(System.in);
	        int numero,i,j;
	 
	        System.out.print("indica la tabla de multiplicar: ");
	        numero = obtenerNumero.nextInt();
	 
	 
	            for(j = 1; j <= 12; j++)
	            {
	                System.out.println(numero + " X " + j + " = " + numero*j);
	            }
	            System.out.println();
	 
	    
	

	}

}
