package ciclos;

import java.util.Scanner;

public class Ciclos9_MARB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
		 int A, B;
		 
		 do {  
			 System.out.print("Introduce un n�mero entero: ");
			 A = sc.nextInt();
	         System.out.print("Introduce otro n�mero entero mayor que el anterior: ");
	         B = sc.nextInt();
	         if (A >= B) {
	        	 System.out.println("El segundo n�mero debe ser mayor que el primero");
	        	 
	         }
			}while(A >= B);
		 System.out.println("\nN�meros pares desde " + A + " hasta " + B + " : ");
		 for (int i = A; i <= B; i++) {
			 if (i % 2 == 0) {
				 System.out.println(i);
				 
			 }
		 }
		 

	}

}
