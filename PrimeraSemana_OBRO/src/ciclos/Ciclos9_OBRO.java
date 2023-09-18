package ciclos;

import java.util.Scanner;

public class Ciclos9_OBRO {

	public static void main(String[] args) {
		
		//Programa Java que lea dos números y muestre los números pares entre ellos 

		Scanner sc = new Scanner(System.in);
        int A, B;

        do {
            System.out.print("Introduce un número entero: ");
            A = sc.nextInt();
            System.out.print("Introduce otro número entero mayor que el anterior: ");
            B = sc.nextInt();
            if (A >= B) {
                System.out.println("El segundo número debe ser mayor que el primero");                  
            }
        } while (A >= B);


        System.out.println("\nNúmeros pares desde " + A + " hasta " + B + " : ");
        for (int i = A; i <= B; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
		


