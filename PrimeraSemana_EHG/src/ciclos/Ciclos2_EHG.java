package ciclos;

import java.util.Scanner;

public class Ciclos2_EHG {

	public static void main(String[] args) {
		// Programa un algoritmo que realice la tabla de multiplicar de un numero introducido 
		// desde teclado, hasta la iteración deseada por el usuario. Ejemplo, tabla de 23 hasta el 95. 
		// 23 x 95 = ???
		
		
		 int num = 1;
		 
		 Scanner entrada = new Scanner (System.in);
		 System.out.println("Introduce un numero entero");
		 num = entrada.nextInt();
		 entrada.close();
		 
		 System.out.println("Tabla del " + num);
		 for(int i = 1; i<=95; i++) {
			 System.out.println(num + " x " + i + " = " + num*i);
		 }
		 
		
		

	}

}
